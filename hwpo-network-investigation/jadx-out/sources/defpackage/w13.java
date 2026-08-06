package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w13 implements j13 {
    public final File u;
    public t13 x;
    public final l13 w = new l13();
    public final long v = 262144000;
    public final qz8 t = new qz8();

    @Deprecated
    public w13(File file) {
        this.u = file;
    }

    public final synchronized t13 a() {
        try {
            if (this.x == null) {
                this.x = t13.y(this.u, this.v);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.x;
    }

    @Override // defpackage.j13
    public final File b(ko5 ko5Var) {
        String strA = this.t.a(ko5Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + ko5Var);
        }
        try {
            t13.e eVarU = a().u(strA);
            if (eVarU != null) {
                return eVarU.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.j13
    public final void c(ko5 ko5Var, qe2 qe2Var) {
        l13.a aVar;
        String strA = this.t.a(ko5Var);
        l13 l13Var = this.w;
        synchronized (l13Var) {
            aVar = (l13.a) l13Var.a.get(strA);
            if (aVar == null) {
                l13.b bVar = l13Var.b;
                synchronized (bVar.a) {
                    aVar = (l13.a) bVar.a.poll();
                }
                if (aVar == null) {
                    aVar = new l13.a();
                }
                l13Var.a.put(strA, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + ko5Var);
            }
            try {
                t13 t13VarA = a();
                if (t13VarA.u(strA) == null) {
                    t13.c cVarP = t13VarA.p(strA);
                    if (cVarP == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (qe2Var.a.b(qe2Var.b, cVarP.b(), qe2Var.c)) {
                            t13.h(t13.this, cVarP, true);
                            cVarP.c = true;
                        }
                        if (!cVarP.c) {
                            try {
                                cVarP.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!cVarP.c) {
                            try {
                                cVarP.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.w.a(strA);
        } catch (Throwable th2) {
            this.w.a(strA);
            throw th2;
        }
    }
}
