package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.m2b;
import defpackage.n03;
import defpackage.psa;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.uo2;
import defpackage.v42;
import defpackage.xj5;
import j$.time.LocalDate;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class TrackedValueEntryNetworkEntity implements f93<psa> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] D = {null, null, null, hv5.c(j26.t, new v42(1)), null, null, null, null, null, null};
    public final boolean A;
    public final Integer B;
    public final String C;
    public final int t;
    public final double u;
    public final Double v;
    public final DifferenceNetworkEntity w;
    public final UnitsNetworkEntity x;
    public final String y;
    public final Integer z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<TrackedValueEntryNetworkEntity> serializer() {
            return TrackedValueEntryNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackedValueEntryNetworkEntity(int i, int i2, double d, Double d2, DifferenceNetworkEntity differenceNetworkEntity, UnitsNetworkEntity unitsNetworkEntity, String str, Integer num, boolean z, Integer num2, String str2) {
        if (691 != (i & 691)) {
            hl3.b(i, 691, TrackedValueEntryNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = d;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = d2;
        }
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = differenceNetworkEntity;
        }
        this.x = unitsNetworkEntity;
        this.y = str;
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = num;
        }
        this.A = z;
        if ((i & 256) == 0) {
            this.B = null;
        } else {
            this.B = num2;
        }
        this.C = str2;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final psa a() {
        DifferenceNetworkEntity differenceNetworkEntity = this.w;
        n03 n03VarA = differenceNetworkEntity != null ? differenceNetworkEntity.a() : null;
        m2b m2bVarA = this.x.a();
        LocalDate localDate = LocalDate.parse(this.C);
        localDate.getClass();
        return new psa(this.t, this.u, this.v, n03VarA, m2bVarA, this.y, this.z, this.A, this.B, localDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackedValueEntryNetworkEntity)) {
            return false;
        }
        TrackedValueEntryNetworkEntity trackedValueEntryNetworkEntity = (TrackedValueEntryNetworkEntity) obj;
        return this.t == trackedValueEntryNetworkEntity.t && Double.compare(this.u, trackedValueEntryNetworkEntity.u) == 0 && xj5.a(this.v, trackedValueEntryNetworkEntity.v) && this.w == trackedValueEntryNetworkEntity.w && this.x == trackedValueEntryNetworkEntity.x && xj5.a(this.y, trackedValueEntryNetworkEntity.y) && xj5.a(this.z, trackedValueEntryNetworkEntity.z) && this.A == trackedValueEntryNetworkEntity.A && xj5.a(this.B, trackedValueEntryNetworkEntity.B) && xj5.a(this.C, trackedValueEntryNetworkEntity.C);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.u) + (Integer.hashCode(this.t) * 31)) * 31;
        Double d = this.v;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        DifferenceNetworkEntity differenceNetworkEntity = this.w;
        int iC = ru3.c((this.x.hashCode() + ((iHashCode2 + (differenceNetworkEntity == null ? 0 : differenceNetworkEntity.hashCode())) * 31)) * 31, 31, this.y);
        Integer num = this.z;
        int iA = uo2.a((iC + (num == null ? 0 : num.hashCode())) * 31, this.A, 31);
        Integer num2 = this.B;
        return this.C.hashCode() + ((iA + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrackedValueEntryNetworkEntity(id=" + this.t + ", value=" + this.u + ", secondValue=" + this.v + ", difference=" + this.w + ", units=" + this.x + ", symbol=" + this.y + ", progress=" + this.z + ", hasNote=" + this.A + ", mediaCount=" + this.B + ", date=" + this.C + ")";
    }
}
