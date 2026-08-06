package com.hwpo_training_app.core.domain.model.response;

import defpackage.hl3;
import defpackage.rd9;
import defpackage.sk0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class MessageResponse {
    public static final Companion Companion = new Companion();
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<MessageResponse> serializer() {
            return MessageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageResponse(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            hl3.b(i, 1, MessageResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageResponse) && xj5.a(this.a, ((MessageResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sk0.c("MessageResponse(message=", this.a, ")");
    }
}
