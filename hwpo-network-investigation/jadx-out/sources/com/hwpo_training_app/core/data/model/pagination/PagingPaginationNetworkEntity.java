package com.hwpo_training_app.core.data.model.pagination;

import defpackage.hl3;
import defpackage.os2;
import defpackage.rd9;
import defpackage.u43;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class PagingPaginationNetworkEntity {
    public static final Companion Companion = new Companion();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<PagingPaginationNetworkEntity> serializer() {
            return PagingPaginationNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PagingPaginationNetworkEntity(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, PagingPaginationNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingPaginationNetworkEntity)) {
            return false;
        }
        PagingPaginationNetworkEntity pagingPaginationNetworkEntity = (PagingPaginationNetworkEntity) obj;
        return this.a == pagingPaginationNetworkEntity.a && this.b == pagingPaginationNetworkEntity.b && this.c == pagingPaginationNetworkEntity.c && this.d == pagingPaginationNetworkEntity.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + os2.a(this.c, os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("PagingPaginationNetworkEntity(totalItems=", ", totalPages=", ", currentPage=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", perPage=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
