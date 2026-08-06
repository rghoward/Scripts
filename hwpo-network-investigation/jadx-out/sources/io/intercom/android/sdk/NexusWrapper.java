package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import defpackage.lg7;
import defpackage.qq2;
import defpackage.ws0;
import defpackage.ya7;
import defpackage.za7;
import io.ably.lib.rest.Auth;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NexusWrapper extends NexusClient implements NexusListener {
    private static final String CONVERSATION_ID = "conversationId";
    private ScheduledFuture<?> actionFuture;
    private final Api api;
    private final IntercomDataLayer dataLayer;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;
    private final Twig twig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationSeen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NexusEventType.NewContent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NexusEventType.ConversationTitleGenerated.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NexusWrapper(Twig twig, lg7 lg7Var, Api api, long j, IntercomDataLayer intercomDataLayer) {
        super(twig, lg7Var);
        twig.getClass();
        lg7Var.getClass();
        api.getClass();
        intercomDataLayer.getClass();
        this.twig = twig;
        this.api = api;
        this.debouncePeriodMs = j;
        this.dataLayer = intercomDataLayer;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    private final void fetchUnreadConversations() {
        this.api.getUnreadConversations();
    }

    private final void logKnownEvent(NexusEvent nexusEvent) {
        this.twig.internal("Nexus", "Received " + nexusEvent.getEventType() + " event");
    }

    private final Boolean removeCallbacks() {
        ScheduledFuture<?> scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            return Boolean.valueOf(scheduledFuture.cancel(false));
        }
        return null;
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void connect(final NexusConfig nexusConfig, final boolean z) {
        nexusConfig.getClass();
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.w("No realtime endpoints present so we can't connect", new Object[0]);
        } else {
            removeCallbacks();
            this.actionFuture = this.executor.schedule(new Runnable() { // from class: xa7
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.connectNow(nexusConfig, z);
                }
            }, this.debouncePeriodMs, TimeUnit.MILLISECONDS);
        }
    }

    public final void connectNow(NexusConfig nexusConfig, boolean z) {
        nexusConfig.getClass();
        if (isConnected()) {
            return;
        }
        super.connect(nexusConfig, z);
        setTopics(ws0.h(Auth.WILDCARD_CLIENTID));
        addEventListener(this);
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new ya7(0, this), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    public final void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void notifyEvent(NexusEvent nexusEvent) {
        nexusEvent.getClass();
        String strOptString = nexusEvent.getEventData().optString(CONVERSATION_ID);
        NexusEventType eventType = nexusEvent.getEventType();
        switch (eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()]) {
            case 1:
                logKnownEvent(nexusEvent);
                break;
            case 2:
                logKnownEvent(nexusEvent);
                fetchUnreadConversations();
                break;
            case 3:
                logKnownEvent(nexusEvent);
                break;
            case 4:
                logKnownEvent(nexusEvent);
                IntercomDataLayer intercomDataLayer = this.dataLayer;
                strOptString.getClass();
                intercomDataLayer.markConversationAsRead(strOptString);
                break;
            case 5:
                logKnownEvent(nexusEvent);
                long jOptLong = nexusEvent.getEventData().optLong("entity_type");
                String strOptString2 = nexusEvent.getEventData().optString("entity_id");
                if (jOptLong == 44) {
                    this.api.fetchCarouselByEntityId(strOptString2);
                } else if (jOptLong != 85) {
                    this.twig.internal("Nexus NewContent", "Unexpected entity type: " + jOptLong);
                } else {
                    this.api.fetchSurveyByEntityId(strOptString2);
                }
                break;
            case 6:
                logKnownEvent(nexusEvent);
                String strOptString3 = nexusEvent.getEventData().optString(CONVERSATION_ID);
                String strOptString4 = nexusEvent.getEventData().optString("title");
                strOptString3.getClass();
                if (strOptString3.length() > 0) {
                    strOptString4.getClass();
                    if (strOptString4.length() > 0) {
                        this.dataLayer.updateConversationTitle(strOptString3, strOptString4);
                    }
                }
                break;
            default:
                this.twig.internal("Nexus", "Unexpected event: " + nexusEvent.getEventType());
                break;
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnect() {
        fetchUnreadConversations();
    }

    public final void scheduleDisconnect(long j) {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new za7(0, this), j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnectFailed() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onShutdown() {
    }
}
