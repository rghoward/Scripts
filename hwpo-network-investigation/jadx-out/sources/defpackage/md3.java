package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ md3(ra3 ra3Var, nd3 nd3Var) {
        this.t = 0;
        this.u = ra3Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        boolean z;
        int i2 = this.t;
        Object obj2 = this.u;
        switch (i2) {
            case 0:
                ra3 ra3Var = (ra3) obj;
                String str = ((ra3) obj2) == ra3Var ? " > " : "   ";
                if (!(ra3Var instanceof lo1)) {
                    if (ra3Var instanceof ak9) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        ak9 ak9Var = (ak9) ra3Var;
                        sb.append(ak9Var.a.u.length());
                        sb.append(", newCursorPosition=");
                        i = ak9Var.b;
                    } else if (ra3Var instanceof zj9) {
                        strConcat = ((zj9) ra3Var).toString();
                    } else if (ra3Var instanceof lx2) {
                        strConcat = ((lx2) ra3Var).toString();
                    } else if (ra3Var instanceof mx2) {
                        strConcat = ((mx2) ra3Var).toString();
                    } else if (ra3Var instanceof ek9) {
                        strConcat = ((ek9) ra3Var).toString();
                    } else if (ra3Var instanceof zz3) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (ra3Var instanceof oi0) {
                        strConcat = "BackspaceCommand()";
                    } else if (ra3Var instanceof nz6) {
                        strConcat = "MoveCursorCommand(amount=0)";
                    } else if (ra3Var instanceof cx2) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = ll8.a(ra3Var.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str.concat(strConcat);
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                lo1 lo1Var = (lo1) ra3Var;
                sb.append(lo1Var.a.u.length());
                sb.append(", newCursorPosition=");
                i = lo1Var.b;
                strConcat = e44.a(sb, i, ')');
                return str.concat(strConcat);
            case 1:
                vja vjaVar = (vja) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vja.a aVar = vjaVar.S;
                if (aVar == null) {
                    z = false;
                } else {
                    aVar.c = zBooleanValue;
                    ew2.f(vjaVar).R();
                    ew2.f(vjaVar).Q();
                    b73.a(vjaVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                hya hyaVar = (hya) obj2;
                td1 td1Var = (td1) obj;
                td1Var.getClass();
                td1.a(td1Var, "first", hyaVar.a.getDescriptor());
                td1.a(td1Var, "second", hyaVar.b.getDescriptor());
                td1.a(td1Var, "third", hyaVar.c.getDescriptor());
                return g2b.a;
        }
    }

    public /* synthetic */ md3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }
}
