package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.hf3;
import defpackage.mh4;
import defpackage.qq2;
import defpackage.s42;
import defpackage.th1;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackLastReceivedPartsUseCase {
    public static final int $stable = 8;
    private Conversation currentConversation;
    private final MetricTracker metricTracker;
    private final mh4<UserIdentity> userIdentity;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase(MetricTracker metricTracker, mh4<? extends UserIdentity> mh4Var) {
        metricTracker.getClass();
        mh4Var.getClass();
        this.metricTracker = metricTracker;
        this.userIdentity = mh4Var;
        this.currentConversation = new Conversation(null, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$0() {
        return Injector.get().getUserIdentity();
    }

    public final synchronized void invoke(Conversation conversation) {
        try {
            conversation.getClass();
            int size = this.currentConversation.parts().size();
            int size2 = conversation.parts().size();
            List<Part> listH = (size == 0 && this.currentConversation.getTicket() == null) ? (conversation.isRead() || !conversation.lastPart().isReply()) ? hf3.t : ws0.h(conversation.lastPart()) : size2 > size ? conversation.parts().subList(size, size2) : hf3.t;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                Part part = (Part) obj;
                if (part.isAdmin() || (!part.getParticipant().isUserWithId(this.userIdentity.invoke().getIntercomId()) && !part.equals(Part.NULL))) {
                    arrayList.add(obj);
                }
            }
            int size3 = arrayList.size();
            int i = 0;
            while (i < size3) {
                Object obj2 = arrayList.get(i);
                i++;
                Part part2 = (Part) obj2;
                this.metricTracker.receivedReply(part2.hasAttachments(), PartExtensionsKt.isLinkCard(part2), part2.getId(), conversation.getId());
                if (xj5.a(part2.getId(), ((Part) th1.G(listH)).getId())) {
                    List<ReplyOption> replyOptions = part2.getReplyOptions();
                    replyOptions.getClass();
                    Iterator<T> it = replyOptions.iterator();
                    while (it.hasNext()) {
                        this.metricTracker.receivedQuickReply(((ReplyOption) it.next()).getUuid(), conversation.getId(), part2.getId());
                    }
                }
            }
            this.currentConversation = conversation;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TrackLastReceivedPartsUseCase(MetricTracker metricTracker, mh4 mh4Var, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i & 2) != 0 ? new s42(1) : mh4Var);
    }
}
