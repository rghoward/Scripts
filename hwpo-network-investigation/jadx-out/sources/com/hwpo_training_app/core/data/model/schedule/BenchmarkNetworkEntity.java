package com.hwpo_training_app.core.data.model.schedule;

import defpackage.ao0;
import defpackage.bo0;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class BenchmarkNetworkEntity implements f93<ao0> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] z = {null, null, hv5.c(j26.t, new bo0()), null, null, null};
    public final int t;
    public final String u;
    public final BenchmarkMeasureTypeNetworkEntity v;
    public final Double w;
    public final UnitsNetworkEntity x;
    public final String y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<BenchmarkNetworkEntity> serializer() {
            return BenchmarkNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BenchmarkNetworkEntity(int i, int i2, String str, BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity, Double d, UnitsNetworkEntity unitsNetworkEntity, String str2) {
        if (23 != (i & 23)) {
            hl3.b(i, 23, BenchmarkNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = benchmarkMeasureTypeNetworkEntity;
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = d;
        }
        this.x = unitsNetworkEntity;
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = str2;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ao0 a() {
        return new ao0(this.t, this.u, this.v.a(), this.w, this.x.a(), this.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenchmarkNetworkEntity)) {
            return false;
        }
        BenchmarkNetworkEntity benchmarkNetworkEntity = (BenchmarkNetworkEntity) obj;
        return this.t == benchmarkNetworkEntity.t && xj5.a(this.u, benchmarkNetworkEntity.u) && this.v == benchmarkNetworkEntity.v && xj5.a(this.w, benchmarkNetworkEntity.w) && this.x == benchmarkNetworkEntity.x && xj5.a(this.y, benchmarkNetworkEntity.y);
    }

    public final int hashCode() {
        int iHashCode = (this.v.hashCode() + ru3.c(Integer.hashCode(this.t) * 31, 31, this.u)) * 31;
        Double d = this.w;
        int iHashCode2 = (this.x.hashCode() + ((iHashCode + (d == null ? 0 : d.hashCode())) * 31)) * 31;
        String str = this.y;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("BenchmarkNetworkEntity(id=", ", name=", this.u, ", measure=", this.t);
        sbA.append(this.v);
        sbA.append(", value=");
        sbA.append(this.w);
        sbA.append(", units=");
        sbA.append(this.x);
        sbA.append(", symbol=");
        sbA.append(this.y);
        sbA.append(")");
        return sbA.toString();
    }
}
