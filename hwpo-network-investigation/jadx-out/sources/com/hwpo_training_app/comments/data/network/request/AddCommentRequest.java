package com.hwpo_training_app.comments.data.network.request;

import defpackage.hl3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class AddCommentRequest {
    public static final Companion Companion = new Companion();
    public final AddCommentNetworkEntity a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<AddCommentRequest> serializer() {
            return AddCommentRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddCommentRequest(int i, AddCommentNetworkEntity addCommentNetworkEntity) {
        if (1 == (i & 1)) {
            this.a = addCommentNetworkEntity;
        } else {
            hl3.b(i, 1, AddCommentRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCommentRequest) && xj5.a(this.a, ((AddCommentRequest) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddCommentRequest(comment=" + this.a + ")";
    }

    public AddCommentRequest(AddCommentNetworkEntity addCommentNetworkEntity) {
        this.a = addCommentNetworkEntity;
    }
}
