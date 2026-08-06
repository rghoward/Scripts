package com.hwpo_training_app.core.data.model.comment;

import defpackage.f93;
import defpackage.gr6;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class CommentMentionNetworkEntity implements f93<gr6> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final String u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<CommentMentionNetworkEntity> serializer() {
            return CommentMentionNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommentMentionNetworkEntity(int i, int i2, String str) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, CommentMentionNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
    }

    @Override // defpackage.f93
    public final gr6 a() {
        return new gr6(this.t, this.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentMentionNetworkEntity)) {
            return false;
        }
        CommentMentionNetworkEntity commentMentionNetworkEntity = (CommentMentionNetworkEntity) obj;
        return this.t == commentMentionNetworkEntity.t && xj5.a(this.u, commentMentionNetworkEntity.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (Integer.hashCode(this.t) * 31);
    }

    public final String toString() {
        return "CommentMentionNetworkEntity(id=" + this.t + ", userName=" + this.u + ")";
    }
}
