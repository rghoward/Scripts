package defpackage;

import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dr implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ dr(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return Boolean.valueOf((((cg7) obj).a() & 9223372034707292159L) != 9205357640488583168L);
            case 1:
                am1 am1Var = (am1) obj;
                am1.a aVar = am1.Companion;
                return new vk1(true, new am1.c(0, am1Var.s(), qn1.class, "onHeaderClick", "onHeaderClick()V", 0), new am1.d(1, am1Var.s(), qn1.class, "onCommentActionClick", "onCommentActionClick(Lcom/hwpo_training_app/core/presentation/entity/comment/CommentUiEntity;)V", 0), new am1.e(1, am1Var.s(), qn1.class, "onFileAttachmentClick", "onFileAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity$FileAttachment;)V", 0), new am1.f(2, am1Var.s(), qn1.class, "onMediaAttachmentClick", "onMediaAttachmentClick(Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity$MediaAttachment;Ljava/util/List;)V", 0), new am1.g(2, am1Var.s(), qn1.class, "onCommentRetryClick", "onCommentRetryClick(Lcom/hwpo_training_app/core/presentation/entity/comment/CommentUiEntity;Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity;)V", 0), new am1.h(2, am1Var.s(), qn1.class, "onCommentStopLoadingClick", "onCommentStopLoadingClick(Lcom/hwpo_training_app/core/presentation/entity/comment/CommentUiEntity;Lcom/hwpo_training_app/core/presentation/entity/AttachmentUiEntity;)V", 0));
            case 2:
                return IntercomArticleActivity.arguments_delegate$lambda$0((IntercomArticleActivity) obj);
            default:
                return (qq5) ((h37) obj).getValue();
        }
    }
}
