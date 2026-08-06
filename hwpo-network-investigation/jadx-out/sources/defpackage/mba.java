package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mba implements oh4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ h37 u;
    public final /* synthetic */ h37 v;
    public final /* synthetic */ Object w;

    public /* synthetic */ mba(h37 h37Var, h37 h37Var2, h37 h37Var3) {
        this.u = h37Var;
        this.v = h37Var2;
        this.w = h37Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.w;
        h37 h37Var = this.v;
        h37 h37Var2 = this.u;
        switch (i) {
            case 0:
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$13$lambda$12((AttributeData) obj2, h37Var2, h37Var, (String) obj);
            default:
                h37 h37Var3 = (h37) obj2;
                qq5 qq5Var = (qq5) obj;
                qq5 qq5VarV = qq5Var.v();
                h37Var2.setValue(new bg5(qq5VarV != null ? c43.b(qq5VarV.a()) : 0L));
                h37Var.setValue(rq5.a(qq5Var));
                h37Var3.setValue(new vf7(((sk8) h37Var.getValue()).b()));
                return g2b.a;
        }
    }

    public /* synthetic */ mba(AttributeData attributeData, h37 h37Var, h37 h37Var2) {
        this.w = attributeData;
        this.u = h37Var;
        this.v = h37Var2;
    }
}
