package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xga implements oh4 {
    public final /* synthetic */ qga t;
    public final /* synthetic */ t72 u;
    public final /* synthetic */ Context v;

    public /* synthetic */ xga(qga qgaVar, t72 t72Var, Context context) {
        this.t = qgaVar;
        this.u = t72Var;
        this.v = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        cca ccaVar = (cca) obj;
        t27<dca> t27Var = ccaVar.a;
        t27<dca> t27Var2 = ccaVar.a;
        zca zcaVar = zca.b;
        t27Var.g(zcaVar);
        tca tcaVar = tca.Autofill;
        qga qgaVar = this.t;
        boolean z = false;
        int i = 1;
        boolean z2 = (lja.c(qgaVar.n().b) || !qgaVar.j() || qgaVar.g == null) ? false : true;
        di4 di4Var = null;
        final aha ahaVar = new aha(qgaVar, null);
        final t72 t72Var = this.u;
        mh4 mh4Var = new mh4() { // from class: wga
            @Override // defpackage.mh4
            public final Object invoke() {
                oy0.d(t72Var, null, x72.w, new dha(ahaVar, null), 1);
                return g2b.a;
            }
        };
        Context context = this.v;
        Resources resources = context.getResources();
        ke9 ke9Var = new ke9(mh4Var, di4Var, i);
        if (z2) {
            t27Var2.g(new sca(pt9.D, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, ke9Var));
        }
        tca tcaVar2 = tca.Autofill;
        boolean z3 = (lja.c(qgaVar.n().b) || qgaVar.g == null) ? false : true;
        final bha bhaVar = new bha(qgaVar, null);
        mh4 mh4Var2 = new mh4() { // from class: wga
            @Override // defpackage.mh4
            public final Object invoke() {
                oy0.d(t72Var, null, x72.w, new dha(bhaVar, null), 1);
                return g2b.a;
            }
        };
        Resources resources2 = context.getResources();
        ke9 ke9Var2 = new ke9(mh4Var2, di4Var, i);
        if (z3) {
            t27Var2.g(new sca(pt9.E, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, ke9Var2));
        }
        tca tcaVar3 = tca.Autofill;
        boolean z4 = qgaVar.j() && ((Boolean) qgaVar.x.getValue()).booleanValue() && qgaVar.g != null;
        final cha chaVar = new cha(qgaVar, null);
        mh4 mh4Var3 = new mh4() { // from class: wga
            @Override // defpackage.mh4
            public final Object invoke() {
                oy0.d(t72Var, null, x72.w, new dha(chaVar, null), 1);
                return g2b.a;
            }
        };
        Resources resources3 = context.getResources();
        ke9 ke9Var3 = new ke9(mh4Var3, di4Var, i);
        if (z4) {
            t27Var2.g(new sca(pt9.F, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, ke9Var3));
        }
        tca tcaVar4 = tca.Autofill;
        boolean z5 = lja.d(qgaVar.n().b) != qgaVar.n().a.u.length();
        vb vbVar = new vb(3, qgaVar);
        up1 up1Var = new up1(4, qgaVar);
        Resources resources4 = context.getResources();
        ke9 ke9Var4 = new ke9(up1Var, vbVar, i);
        if (z5) {
            t27Var2.g(new sca(pt9.G, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, ke9Var4));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            tca tcaVar5 = tca.Autofill;
            if (qgaVar.j() && lja.c(qgaVar.n().b)) {
                z = true;
            }
            vp1 vp1Var = new vp1(2, qgaVar);
            Resources resources5 = context.getResources();
            ke9 ke9Var5 = new ke9(vp1Var, di4Var, i);
            if (z) {
                t27Var2.g(new sca(tcaVar5.t, resources5.getString(tcaVar5.u), tcaVar5.v, ke9Var5));
            }
        }
        t27Var2.g(zcaVar);
        return g2b.a;
    }
}
