package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ va3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj;
                rb3.a aVar = rb3.Companion;
                return new iw3(new rb3.c(1, rb3Var.s(), pc3.class, "onAttachmentActionClick", "onAttachmentActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0), new rb3.d(1, rb3Var.s(), pc3.class, "onUploadingActionClick", "onUploadingActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0));
            case 1:
                bf9.a aVar2 = bf9.Companion;
                qf9 qf9VarQ = ((bf9) obj).q();
                oy0.d(rhb.b(qf9VarQ), null, null, new kg9(qf9VarQ, null), 3);
                return g2b.a;
            default:
                return (mha) obj;
        }
    }
}
