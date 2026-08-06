package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t6 extends pi4 implements oh4 {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.t = i3;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                zlb zlbVar = (zlb) obj;
                zlbVar.getClass();
                r7 r7Var = (r7) this.receiver;
                r7Var.getClass();
                r7Var.e(new m6.h(zlbVar));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((pta) this.receiver).u(str);
                break;
        }
        return g2b.a;
    }
}
