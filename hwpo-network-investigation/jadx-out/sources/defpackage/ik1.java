package defpackage;

import com.hwpo_training_app.core.data.model.attachments.AttachmentTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.comment.CommentMentionNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik1 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ik1(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                CommentNetworkEntity.Companion companion = CommentNetworkEntity.Companion;
                return new m30(CommentMentionNetworkEntity$$serializer.INSTANCE);
            default:
                SectionAttachmentNetworkEntity.Companion companion2 = SectionAttachmentNetworkEntity.Companion;
                return AttachmentTypeNetworkEntity.Companion.serializer();
        }
    }
}
