package com.hwpo_training_app.core.data.model.schedule;

import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.k49;
import defpackage.m49;
import defpackage.n49;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ScheduleResponse implements f93<k49> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] v;
    public final List<ScheduleNetworkEntity> t;
    public final List<LaunchDateNetworkEntity> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScheduleResponse> serializer() {
            return ScheduleResponse$$serializer.INSTANCE;
        }
    }

    static {
        m49 m49Var = new m49();
        j26 j26Var = j26.t;
        v = new ss5[]{hv5.c(j26Var, m49Var), hv5.c(j26Var, new n49())};
    }

    public /* synthetic */ ScheduleResponse(int i, List list, List list2) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, ScheduleResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = list;
        this.u = list2;
    }

    @Override // defpackage.f93
    public final k49 a() {
        return new k49(g93.a(this.t), g93.a(this.u));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleResponse)) {
            return false;
        }
        ScheduleResponse scheduleResponse = (ScheduleResponse) obj;
        return xj5.a(this.t, scheduleResponse.t) && xj5.a(this.u, scheduleResponse.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduleResponse(schedules=" + this.t + ", launchDates=" + this.u + ")";
    }
}
