package com.hwpo_training_app.core.data.model.schedule;

import defpackage.f93;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.sc8;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ScheduleDetailsResponse implements f93<sc8> {
    public static final Companion Companion = new Companion();
    public final ScheduleNetworkEntity t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScheduleDetailsResponse> serializer() {
            return ScheduleDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ScheduleDetailsResponse(int i, ScheduleNetworkEntity scheduleNetworkEntity) {
        if (1 == (i & 1)) {
            this.t = scheduleNetworkEntity;
        } else {
            hl3.b(i, 1, ScheduleDetailsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.f93
    public final sc8 a() {
        return this.t.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScheduleDetailsResponse) && xj5.a(this.t, ((ScheduleDetailsResponse) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "ScheduleDetailsResponse(schedule=" + this.t + ")";
    }
}
