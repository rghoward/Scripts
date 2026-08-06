package com.hwpo_training_app.comments.data.network.request;

import defpackage.eb;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class AddCommentNetworkEntity {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] c = {null, hv5.c(j26.t, new eb(0))};
    public final String a;
    public final List<Long> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<AddCommentNetworkEntity> serializer() {
            return AddCommentNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddCommentNetworkEntity(int i, String str, List list) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, AddCommentNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddCommentNetworkEntity)) {
            return false;
        }
        AddCommentNetworkEntity addCommentNetworkEntity = (AddCommentNetworkEntity) obj;
        return xj5.a(this.a, addCommentNetworkEntity.a) && xj5.a(this.b, addCommentNetworkEntity.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Long> list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AddCommentNetworkEntity(text=" + this.a + ", attachmentIds=" + this.b + ")";
    }

    public AddCommentNetworkEntity(String str, List<Long> list) {
        this.a = str;
        this.b = list;
    }
}
