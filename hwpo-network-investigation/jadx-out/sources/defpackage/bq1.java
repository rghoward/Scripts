package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bq1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ bq1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return dq1.onBackPressedDispatcher_delegate$lambda$0((dq1) obj);
            case 1:
                rb3 rb3Var = (rb3) obj;
                rb3.a aVar = rb3.Companion;
                return new vm6(new rb3.i(1, rb3Var.s(), pc3.class, "onAttachmentActionClick", "onAttachmentActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0), new rb3.j(1, rb3Var.s(), pc3.class, "onUploadingActionClick", "onUploadingActionClick(Lcom/hwpo_training_app/core/presentation/entity/section_details/SectionAttachment;)V", 0));
            case 2:
                g2b g2bVar = g2b.a;
                ((h37) obj).setValue(g2bVar);
                return g2bVar;
            case 3:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8((mh4) obj);
            case 4:
                return new x57((String) obj);
            default:
                tva tvaVar = (tva) obj;
                return Boolean.valueOf((xj5.a(tvaVar.d.getValue(), tvaVar.a.b()) && tvaVar.g.b() == Long.MIN_VALUE && !((Boolean) tvaVar.h.getValue()).booleanValue()) ? false : true);
        }
    }
}
