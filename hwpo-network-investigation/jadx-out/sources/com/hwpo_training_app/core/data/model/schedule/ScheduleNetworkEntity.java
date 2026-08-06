package com.hwpo_training_app.core.data.model.schedule;

import defpackage.a08;
import defpackage.al;
import defpackage.f93;
import defpackage.g93;
import defpackage.hl3;
import defpackage.ho2;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.l49;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sc8;
import defpackage.ss5;
import defpackage.xj5;
import defpackage.yk2;
import j$.time.LocalDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class ScheduleNetworkEntity implements f93<sc8> {
    public final Boolean A;
    public final int t;
    public final String u;
    public final PlanNetworkEntity v;
    public final Integer w;
    public final long x;
    public final List<ProgramSectionNetworkEntity> y;
    public final Boolean z;
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] B = {null, null, null, null, null, hv5.c(j26.t, new l49(0)), null, null};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ScheduleNetworkEntity> serializer() {
            return ScheduleNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ScheduleNetworkEntity(int i, int i2, String str, PlanNetworkEntity planNetworkEntity, Integer num, long j, List list, Boolean bool, Boolean bool2) {
        if (55 != (i & 55)) {
            hl3.b(i, 55, ScheduleNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = planNetworkEntity;
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        this.x = j;
        this.y = list;
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = bool;
        }
        if ((i & 128) == 0) {
            this.A = null;
        } else {
            this.A = bool2;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sc8 a() {
        a08 a08VarB = this.v.a();
        LocalDateTime localDateTimeQ = yk2.q(this.x);
        localDateTimeQ.getClass();
        List listA = g93.a(this.y);
        Boolean bool = this.z;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.A;
        return new sc8(this.t, this.u, a08VarB, this.w, localDateTimeQ, listA, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleNetworkEntity)) {
            return false;
        }
        ScheduleNetworkEntity scheduleNetworkEntity = (ScheduleNetworkEntity) obj;
        return this.t == scheduleNetworkEntity.t && xj5.a(this.u, scheduleNetworkEntity.u) && xj5.a(this.v, scheduleNetworkEntity.v) && xj5.a(this.w, scheduleNetworkEntity.w) && this.x == scheduleNetworkEntity.x && xj5.a(this.y, scheduleNetworkEntity.y) && xj5.a(this.z, scheduleNetworkEntity.z) && xj5.a(this.A, scheduleNetworkEntity.A);
    }

    public final int hashCode() {
        int iHashCode = (this.v.hashCode() + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u)) * 31;
        Integer num = this.w;
        int iA = ho2.a(al.c(this.x, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.y);
        Boolean bool = this.z;
        int iHashCode2 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ScheduleNetworkEntity(id=", ", color=", this.u, ", plan=", this.t);
        sbA.append(this.v);
        sbA.append(", dayNumber=");
        sbA.append(this.w);
        sbA.append(", date=");
        sbA.append(this.x);
        sbA.append(", sections=");
        sbA.append(this.y);
        sbA.append(", canNavigateBack=");
        sbA.append(this.z);
        sbA.append(", canNavigateForward=");
        sbA.append(this.A);
        sbA.append(")");
        return sbA.toString();
    }
}
