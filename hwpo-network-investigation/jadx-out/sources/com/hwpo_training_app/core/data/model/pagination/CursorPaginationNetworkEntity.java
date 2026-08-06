package com.hwpo_training_app.core.data.model.pagination;

import defpackage.hl3;
import defpackage.os2;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class CursorPaginationNetworkEntity {
    public static final Companion Companion = new Companion();
    public final Long a;
    public final Long b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<CursorPaginationNetworkEntity> serializer() {
            return CursorPaginationNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CursorPaginationNetworkEntity(int i, Long l, Long l2, int i2, int i3) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, CursorPaginationNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = l;
        this.b = l2;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CursorPaginationNetworkEntity)) {
            return false;
        }
        CursorPaginationNetworkEntity cursorPaginationNetworkEntity = (CursorPaginationNetworkEntity) obj;
        return xj5.a(this.a, cursorPaginationNetworkEntity.a) && xj5.a(this.b, cursorPaginationNetworkEntity.b) && this.c == cursorPaginationNetworkEntity.c && this.d == cursorPaginationNetworkEntity.d;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return Integer.hashCode(this.d) + os2.a(this.c, (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "CursorPaginationNetworkEntity(afterId=" + this.a + ", beforeId=" + this.b + ", size=" + this.c + ", limit=" + this.d + ")";
    }
}
