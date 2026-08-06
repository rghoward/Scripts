package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.cbb;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.xj5;
import defpackage.xw9;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ValueToAddNetworkEntity implements f93<cbb> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] x = {null, null, hv5.c(j26.t, new xw9(1)), null};
    public final int t;
    public final String u;
    public final BenchmarkMeasureTypeNetworkEntity v;
    public final UnitsNetworkEntity w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ValueToAddNetworkEntity> serializer() {
            return ValueToAddNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValueToAddNetworkEntity(int i, int i2, String str, BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity, UnitsNetworkEntity unitsNetworkEntity) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, ValueToAddNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = benchmarkMeasureTypeNetworkEntity;
        this.w = unitsNetworkEntity;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cbb a() {
        return new cbb(this.t, this.v.a(), this.w.a(), this.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueToAddNetworkEntity)) {
            return false;
        }
        ValueToAddNetworkEntity valueToAddNetworkEntity = (ValueToAddNetworkEntity) obj;
        return this.t == valueToAddNetworkEntity.t && xj5.a(this.u, valueToAddNetworkEntity.u) && this.v == valueToAddNetworkEntity.v && this.w == valueToAddNetworkEntity.w;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.v.hashCode() + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ValueToAddNetworkEntity(id=", ", name=", this.u, ", measure=", this.t);
        sbA.append(this.v);
        sbA.append(", units=");
        sbA.append(this.w);
        sbA.append(")");
        return sbA.toString();
    }
}
