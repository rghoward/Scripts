package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uhb {
    public final vhb a;
    public final thb.c b;
    public final lb2 c;
    public final kr5 d;

    public uhb(vhb vhbVar, thb.c cVar, lb2 lb2Var) {
        vhbVar.getClass();
        cVar.getClass();
        lb2Var.getClass();
        this.a = vhbVar;
        this.b = cVar;
        this.c = lb2Var;
        this.d = new kr5();
    }

    public final mhb a(sd1 sd1Var, String str) {
        mhb mhbVar;
        mhb mhbVarCreate;
        synchronized (this.d) {
            try {
                vhb vhbVar = this.a;
                vhbVar.getClass();
                mhbVar = (mhb) vhbVar.a.get(str);
                if (sd1Var.d(mhbVar)) {
                    Object obj = this.b;
                    if (obj instanceof thb.e) {
                        mhbVar.getClass();
                        ((thb.e) obj).a(mhbVar);
                    }
                    mhbVar.getClass();
                } else {
                    z17 z17Var = new z17(this.c);
                    z17Var.a.put(thb.b, str);
                    thb.c cVar = this.b;
                    cVar.getClass();
                    try {
                        try {
                            mhbVarCreate = cVar.create(sd1Var, z17Var);
                        } catch (AbstractMethodError unused) {
                            mhbVarCreate = cVar.create(me3.b(sd1Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        mhbVarCreate = cVar.create((Class<mhb>) me3.b(sd1Var), z17Var);
                    }
                    mhbVar = mhbVarCreate;
                    vhb vhbVar2 = this.a;
                    vhbVar2.getClass();
                    mhbVar.getClass();
                    mhb mhbVar2 = (mhb) vhbVar2.a.put(str, mhbVar);
                    if (mhbVar2 != null) {
                        mhbVar2.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mhbVar;
    }
}
