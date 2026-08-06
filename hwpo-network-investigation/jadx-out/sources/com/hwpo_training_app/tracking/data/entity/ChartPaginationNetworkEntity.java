package com.hwpo_training_app.tracking.data.entity;

import defpackage.hl3;
import defpackage.rd9;
import defpackage.uo2;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ChartPaginationNetworkEntity {
    public static final Companion Companion = new Companion();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<ChartPaginationNetworkEntity> serializer() {
            return ChartPaginationNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartPaginationNetworkEntity(int i, int i2, int i3, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, ChartPaginationNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartPaginationNetworkEntity)) {
            return false;
        }
        ChartPaginationNetworkEntity chartPaginationNetworkEntity = (ChartPaginationNetworkEntity) obj;
        return this.a == chartPaginationNetworkEntity.a && this.b == chartPaginationNetworkEntity.b && this.c == chartPaginationNetworkEntity.c && this.d == chartPaginationNetworkEntity.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + uo2.a(uo2.a(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ChartPaginationNetworkEntity(size=" + this.a + ", hasMore=" + this.b + ", hasLess=" + this.c + ", limit=" + this.d + ")";
    }
}
