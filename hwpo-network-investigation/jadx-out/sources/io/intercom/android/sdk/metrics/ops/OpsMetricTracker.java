package io.intercom.android.sdk.metrics.ops;

import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OpsMetricTracker {
    public static final String FINISH = "finish";
    public static final String LOAD_CONVERSATION_TIME_TO_COMPLETE_REQUEST = "time-to-complete-request-load-conversation-ms";
    public static final String LOAD_CONVERSATION_TIME_TO_PROCESS_ACTION = "time-to-process-action-load-conversation-ms";
    public static final String LOAD_CONVERSATION_TIME_TO_RENDER_RESULT = "time-to-render-result-load-conversation-ms";
    public static final String SEND_PART_TIME_TO_COMPLETE_REQUEST = "time-to-complete-request-send-part-ms";
    public static final String SEND_PART_TIME_TO_PROCESS_ACTION = "time-to-process-action-send-part-ms";
    public static final String SEND_PART_TIME_TO_RENDER_RESULT = "time-to-render-result-send-part-ms";
    public static final String START = "start";
    public static final String TIME_TO_COMPLETE_PING = "time-to-complete-ping-ms";
    public static final String TIMING_TYPE = "timing";
    final List<OpsEvent> events = new CopyOnWriteArrayList();
    private final MetricsStore store;
    private final TimeProvider timeProvider;
    private final UuidStringProvider uuidStringProvider;

    public OpsMetricTracker(MetricsStore metricsStore, TimeProvider timeProvider, UuidStringProvider uuidStringProvider) {
        this.store = metricsStore;
        this.timeProvider = timeProvider;
        this.uuidStringProvider = uuidStringProvider;
    }

    private OpsEvent findStartEvent(String str) {
        OpsEvent opsEvent = null;
        for (OpsEvent opsEvent2 : this.events) {
            if (START.equals(opsEvent2.getEventType()) && str.equals(opsEvent2.getName())) {
                opsEvent = opsEvent2;
            }
        }
        return opsEvent;
    }

    private void trackOpsEvent(OpsEvent opsEvent) {
        OpsEvent opsEventFindStartEvent = findStartEvent(opsEvent.getName());
        if (opsEventFindStartEvent == null) {
            return;
        }
        this.events.remove(opsEventFindStartEvent);
        this.store.track(new OpsMetricObject(TIMING_TYPE, opsEventFindStartEvent.getName(), opsEvent.getTimestamp() - opsEventFindStartEvent.getTimestamp(), this.uuidStringProvider.newUuidString()));
    }

    public void clear() {
        this.events.clear();
    }

    public void trackEvent(String str, String str2) {
        OpsEvent opsEvent = new OpsEvent(str, str2, this.timeProvider.currentTimeMillis());
        if (FINISH.equals(str)) {
            trackOpsEvent(opsEvent);
        } else {
            this.events.add(opsEvent);
        }
    }
}
