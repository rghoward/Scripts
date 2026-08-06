package defpackage;

import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ zh3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                fi3 fi3Var = (fi3) obj;
                fi3.a aVar = fi3.Companion;
                return new vm6(new fi3.l(1, fi3Var.r(), fj3.class, "onAttachmentActionClick", "onAttachmentActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)Lkotlinx/coroutines/Job;", 8), new fi3.m(1, fi3Var.r(), fj3.class, "onUploadingActionClick", "onUploadingActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)Lkotlinx/coroutines/Job;", 8));
            default:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3((mh4) obj);
        }
    }
}
