package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r04 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ r04(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qe0 qe0VarC;
        qe0 qe0VarF;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                s04 s04Var = (s04) obj;
                Object obj2 = s04.m;
                synchronized (obj2) {
                    try {
                        e04 e04Var = s04Var.a;
                        e04Var.a();
                        ob2 ob2VarA = ob2.a(e04Var.a);
                        try {
                            qe0VarC = s04Var.c.c();
                            if (ob2VarA != null) {
                                ob2VarA.b();
                            }
                        } catch (Throwable th) {
                            if (ob2VarA != null) {
                                ob2VarA.b();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    if (qe0VarC.f() == hw7.a.x) {
                        qe0VarF = s04Var.f(qe0VarC);
                    } else {
                        if (qe0VarC.f() == hw7.a.v) {
                            qe0VarF = s04Var.f(qe0VarC);
                        } else if (!s04Var.d.a(qe0VarC)) {
                            return;
                        } else {
                            qe0VarF = s04Var.c(qe0VarC);
                        }
                    }
                    synchronized (obj2) {
                        try {
                            e04 e04Var2 = s04Var.a;
                            e04Var2.a();
                            ob2 ob2VarA2 = ob2.a(e04Var2.a);
                            try {
                                s04Var.c.b(qe0VarF);
                                if (ob2VarA2 != null) {
                                    ob2VarA2.b();
                                }
                            } catch (Throwable th3) {
                                if (ob2VarA2 != null) {
                                    ob2VarA2.b();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (s04Var) {
                        if (s04Var.k.size() != 0 && !TextUtils.equals(qe0VarC.b, qe0VarF.b)) {
                            Iterator it = s04Var.k.iterator();
                            while (it.hasNext()) {
                                ((mu3) it.next()).a();
                            }
                        }
                    }
                    if (qe0VarF.f() == hw7.a.w) {
                        String str = qe0VarF.b;
                        synchronized (s04Var) {
                            s04Var.j = str;
                        }
                    }
                    if (qe0VarF.f() == hw7.a.x) {
                        s04Var.g(new u04());
                        return;
                    }
                    hw7.a aVar = qe0VarF.c;
                    if (aVar == hw7.a.u || aVar == hw7.a.t) {
                        s04Var.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        s04Var.h(qe0VarF);
                        return;
                    }
                } catch (u04 e) {
                    s04Var.g(e);
                    return;
                }
            default:
                o38 o38Var = (o38) obj;
                o38Var.m.start();
                o38Var.e(o38Var.v, 2000L);
                return;
        }
    }
}
