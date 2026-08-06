package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.ably.lib.rest.Auth;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b55 implements lu3 {
    public static final n01 f;
    public static final n01 g;
    public final String a;
    public final zk7 b;
    public final o7a c;
    public final o7a d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<Uri> {
        public final o7a a;
        public final o7a b;
        public final boolean c;

        public a(o7a o7aVar, o7a o7aVar2, boolean z) {
            this.a = o7aVar;
            this.b = o7aVar2;
            this.c = z;
        }

        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            Uri uri = (Uri) obj;
            if (!xj5.a(uri.getScheme(), "http") && !xj5.a(uri.getScheme(), "https")) {
                return null;
            }
            return new b55(uri.toString(), zk7Var, this.a, this.b, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    public static final class b extends u02 {
        public b55 t;
        public i13.b u;
        public Object v;
        public /* synthetic */ Object w;
        public int y;

        public b(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return b55.this.a(this);
        }
    }

    static {
        n01.a aVar = new n01.a();
        aVar.a = true;
        aVar.b = true;
        f = aVar.a();
        n01.a aVar2 = new n01.a();
        aVar2.a = true;
        aVar2.d = true;
        g = aVar2.a();
    }

    public b55(String str, zk7 zk7Var, o7a o7aVar, o7a o7aVar2, boolean z) {
        this.a = str;
        this.b = zk7Var;
        this.c = o7aVar;
        this.d = o7aVar2;
        this.e = z;
    }

    public static String d(String str, wq6 wq6Var) {
        String strB;
        String str2 = wq6Var != null ? wq6Var.a : null;
        if ((str2 == null || w2a.n(str2, "text/plain", false)) && (strB = v.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return z2a.O(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab A[Catch: Exception -> 0x01d6, TryCatch #4 {Exception -> 0x01d6, blocks: (B:83:0x01a5, B:85:0x01ab, B:89:0x01d2, B:93:0x01d9, B:94:0x01de), top: B:112:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9 A[Catch: Exception -> 0x01d6, TryCatch #4 {Exception -> 0x01d6, blocks: (B:83:0x01a5, B:85:0x01ab, B:89:0x01d2, B:93:0x01d9, B:94:0x01de), top: B:112:0x01a5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) throws Exception {
        b bVar;
        i13.b bVarB;
        z01 z01VarA;
        Object objB;
        i13 i13Var;
        i13.b bVar2;
        qu8 qu8Var;
        qu8 qu8Var2;
        su8 su8Var;
        b55 b55Var = this;
        if (r02Var instanceof b) {
            bVar = (b) r02Var;
            int i = bVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.y = i - Integer.MIN_VALUE;
            } else {
                bVar = b55Var.new b((u02) r02Var);
            }
        } else {
            bVar = b55Var.new b((u02) r02Var);
        }
        Object obj = bVar.w;
        ?? r3 = bVar.y;
        jf2 jf2Var = jf2.w;
        jf2 jf2Var2 = jf2.v;
        v72 v72Var = v72.t;
        try {
            if (r3 == 0) {
                dv8.b(obj);
                zk7 zk7Var = b55Var.b;
                boolean z = zk7Var.n.t;
                String str = b55Var.a;
                if (!z || (i13Var = (i13) b55Var.d.getValue()) == null) {
                    bVarB = null;
                } else {
                    String str2 = zk7Var.i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    bVarB = i13Var.b(str2);
                }
                if (bVarB != null) {
                    Long l = b55Var.c().B(bVarB.G()).d;
                    if (l != null && l.longValue() == 0) {
                        return new tw9(b55Var.g(bVarB), d(str, null), jf2Var2);
                    }
                    if (!b55Var.e) {
                        ax3 ax3VarG = b55Var.g(bVarB);
                        y01 y01VarF = b55Var.f(bVarB);
                        return new tw9(ax3VarG, d(str, y01VarF != null ? (wq6) y01VarF.b.getValue() : null), jf2Var2);
                    }
                    z01VarA = new z01.b(b55Var.e(), b55Var.f(bVarB)).a();
                    y01 y01Var = z01VarA.b;
                    if (z01VarA.a == null && y01Var != null) {
                        return new tw9(b55Var.g(bVarB), d(str, (wq6) y01Var.b.getValue()), jf2Var2);
                    }
                } else {
                    z01VarA = new z01.b(b55Var.e(), null).a();
                }
                jp8 jp8Var = z01VarA.a;
                jp8Var.getClass();
                bVar.t = b55Var;
                bVar.u = bVarB;
                bVar.v = z01VarA;
                bVar.y = 1;
                objB = b55Var.b(jp8Var, bVar);
                if (objB == v72Var) {
                }
                return v72Var;
            }
            if (r3 != 1) {
                if (r3 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qu8Var = (qu8) bVar.v;
                bVar2 = bVar.u;
                b55Var = bVar.t;
                try {
                    dv8.b(obj);
                    qu8Var2 = (qu8) obj;
                    try {
                        Bitmap.Config[] configArr = v.a;
                        su8Var = qu8Var2.z;
                        if (su8Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        b55Var.getClass();
                        nw9 nw9Var = new nw9(su8Var.p(), new ld2(2, b55Var.b.a), null);
                        String strD = d(b55Var.a, su8Var.m());
                        if (qu8Var2.B != null) {
                            jf2Var = jf2Var2;
                        }
                        return new tw9(nw9Var, strD, jf2Var);
                    } catch (Exception e) {
                        e = e;
                        qu8Var = qu8Var2;
                        try {
                            v.a(qu8Var);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            r3 = bVar2;
                            if (r3 != 0) {
                                v.a(r3);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    v.a(qu8Var);
                    throw e;
                }
            }
            z01 z01Var = (z01) bVar.v;
            bVarB = bVar.u;
            b55 b55Var2 = bVar.t;
            dv8.b(obj);
            z01VarA = z01Var;
            b55Var = b55Var2;
            objB = obj;
            qu8 qu8Var3 = (qu8) objB;
            Bitmap.Config[] configArr2 = v.a;
            su8 su8Var2 = qu8Var3.z;
            if (su8Var2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                i13.b bVarH = b55Var.h(bVarB, z01VarA.a, qu8Var3, z01VarA.b);
                String str3 = b55Var.a;
                try {
                    if (bVarH != null) {
                        ax3 ax3VarG2 = b55Var.g(bVarH);
                        y01 y01VarF2 = b55Var.f(bVarH);
                        return new tw9(ax3VarG2, d(str3, y01VarF2 != null ? (wq6) y01VarF2.b.getValue() : null), jf2Var);
                    }
                    if (su8Var2.p().request(1L)) {
                        nw9 nw9Var2 = new nw9(su8Var2.p(), new ld2(2, b55Var.b.a), null);
                        String strD2 = d(str3, su8Var2.m());
                        if (qu8Var3.B == null) {
                            jf2Var = jf2Var2;
                        }
                        return new tw9(nw9Var2, strD2, jf2Var);
                    }
                    v.a(qu8Var3);
                    jp8 jp8VarE = b55Var.e();
                    bVar.t = b55Var;
                    bVar.u = bVarH;
                    bVar.v = qu8Var3;
                    bVar.y = 2;
                    Object objB2 = b55Var.b(jp8VarE, bVar);
                    if (objB2 != v72Var) {
                        qu8Var = qu8Var3;
                        bVar2 = bVarH;
                        obj = objB2;
                        qu8Var2 = (qu8) obj;
                        Bitmap.Config[] configArr3 = v.a;
                        su8Var = qu8Var2.z;
                        if (su8Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        b55Var.getClass();
                        nw9 nw9Var3 = new nw9(su8Var.p(), new ld2(2, b55Var.b.a), null);
                        String strD3 = d(b55Var.a, su8Var.m());
                        if (qu8Var2.B != null) {
                            jf2Var = jf2Var2;
                        }
                        return new tw9(nw9Var3, strD3, jf2Var);
                    }
                    return v72Var;
                } catch (Exception e4) {
                    e = e4;
                    qu8Var = qu8Var3;
                    bVar2 = bVarH;
                    v.a(qu8Var);
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
                bVar2 = bVarB;
                qu8Var = qu8Var3;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(jp8 jp8Var, u02 u02Var) throws Throwable {
        c55 c55Var;
        qu8 qu8VarExecute;
        boolean z;
        if (u02Var instanceof c55) {
            c55Var = (c55) u02Var;
            int i = c55Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c55Var.v = i - Integer.MIN_VALUE;
            } else {
                c55Var = new c55(this, u02Var);
            }
        } else {
            c55Var = new c55(this, u02Var);
        }
        Object objR = c55Var.t;
        int i2 = c55Var.v;
        if (i2 == 0) {
            dv8.b(objR);
            Bitmap.Config[] configArr = v.a;
            boolean zA = xj5.a(Looper.myLooper(), Looper.getMainLooper());
            o7a o7aVar = this.c;
            if (!zA) {
                oi8 oi8VarA = ((o21.a) o7aVar.getValue()).a(jp8Var);
                c55Var.v = 1;
                e41 e41Var = new e41(1, th0.e(c55Var));
                e41Var.t();
                t02 t02Var = new t02(oi8VarA, e41Var);
                FirebasePerfOkHttpClient.enqueue(oi8VarA, t02Var);
                e41Var.v(t02Var);
                objR = e41Var.r();
                v72 v72Var = v72.t;
                if (objR == v72Var) {
                    return v72Var;
                }
            } else {
                if (this.b.o.t) {
                    throw new NetworkOnMainThreadException();
                }
                qu8VarExecute = FirebasePerfOkHttpClient.execute(((o21.a) o7aVar.getValue()).a(jp8Var));
            }
            z = qu8VarExecute.J;
            int i3 = qu8VarExecute.w;
            if (!z || i3 == 304) {
                return qu8VarExecute;
            }
            su8 su8Var = qu8VarExecute.z;
            if (su8Var != null) {
                v.a(su8Var);
            }
            StringBuilder sbB = t43.b(i3, "HTTP ", ": ");
            sbB.append(qu8VarExecute.v);
            throw new r45(sbB.toString());
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(objR);
        qu8VarExecute = (qu8) objR;
        z = qu8VarExecute.J;
        int i4 = qu8VarExecute.w;
        if (z) {
        }
        return qu8VarExecute;
    }

    public final fy3 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((i13) value).getFileSystem();
    }

    public final jp8 e() {
        jp8.a aVar = new jp8.a();
        aVar.d(this.a);
        zk7 zk7Var = this.b;
        nu4 nu4Var = zk7Var.j;
        nu4Var.getClass();
        aVar.c = nu4Var.f();
        for (Map.Entry<Class<?>, Object> entry : zk7Var.k.a.entrySet()) {
            Class<?> key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            aVar.e = aVar.e.U0(ll8.a(key), value);
        }
        v01 v01Var = zk7Var.n;
        boolean z = v01Var.t;
        boolean z2 = zk7Var.o.t;
        if (!z2 && z) {
            aVar.a(n01.o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                aVar.a(g);
            }
        } else if (v01Var.u) {
            aVar.a(n01.n);
        } else {
            aVar.a(f);
        }
        return new jp8(aVar);
    }

    public final y01 f(i13.b bVar) throws Throwable {
        Throwable th;
        y01 y01Var;
        try {
            kw9 kw9VarK = c().K(bVar.G());
            kw9VarK.getClass();
            ni8 ni8Var = new ni8(kw9VarK);
            try {
                y01Var = new y01(ni8Var);
                try {
                    ni8Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    ni8Var.close();
                } catch (Throwable th4) {
                    fn3.b(th3, th4);
                }
                th = th3;
                y01Var = null;
            }
            if (th == null) {
                return y01Var;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final ax3 g(i13.b bVar) {
        du7 data = bVar.getData();
        fy3 fy3VarC = c();
        String str = this.b.i;
        if (str == null) {
            str = this.a;
        }
        return new ax3(data, fy3VarC, str, bVar);
    }

    public final i13.b h(i13.b bVar, jp8 jp8Var, qu8 qu8Var, y01 y01Var) {
        si8.a aVarA;
        Throwable th;
        nu4 nu4Var = qu8Var.y;
        zk7 zk7Var = this.b;
        Throwable th2 = null;
        if (zk7Var.n.u && (!this.e || (!jp8Var.a().b && !qu8Var.h().b && !xj5.a(nu4Var.d("Vary"), Auth.WILDCARD_CLIENTID)))) {
            if (bVar != null) {
                aVarA = bVar.Q();
            } else {
                i13 i13Var = (i13) this.d.getValue();
                if (i13Var != null) {
                    String str = zk7Var.i;
                    if (str == null) {
                        str = this.a;
                    }
                    aVarA = i13Var.a(str);
                } else {
                    aVarA = null;
                }
            }
            try {
                if (aVarA != null) {
                    try {
                        if (qu8Var.w != 304 || y01Var == null) {
                            mi8 mi8VarB = ev6.b(c().J(aVarA.b()));
                            try {
                                new y01(qu8Var).a(mi8VarB);
                                g2b g2bVar = g2b.a;
                                try {
                                    mi8VarB.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    mi8VarB.close();
                                } catch (Throwable th5) {
                                    fn3.b(th4, th5);
                                }
                                th = th4;
                            }
                            if (th != null) {
                                throw th;
                            }
                            mi8 mi8VarB2 = ev6.b(c().J(aVarA.a.b(1)));
                            try {
                                su8 su8Var = qu8Var.z;
                                su8Var.getClass();
                                su8Var.p().M(mi8VarB2);
                                try {
                                    mi8VarB2.close();
                                } catch (Throwable th6) {
                                    th2 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                try {
                                    mi8VarB2.close();
                                } catch (Throwable th8) {
                                    fn3.b(th2, th8);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        } else {
                            qu8.a aVarK = qu8Var.k();
                            aVarK.f = z01.a.a(y01Var.f, nu4Var).f();
                            qu8 qu8VarA = aVarK.a();
                            mi8 mi8VarB3 = ev6.b(c().J(aVarA.b()));
                            try {
                                new y01(qu8VarA).a(mi8VarB3);
                                g2b g2bVar2 = g2b.a;
                                try {
                                    mi8VarB3.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            } catch (Throwable th10) {
                                th2 = th10;
                                try {
                                    mi8VarB3.close();
                                } catch (Throwable th11) {
                                    fn3.b(th2, th11);
                                }
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        si8.b bVarA = aVarA.a();
                        v.a(qu8Var);
                        return bVarA;
                    } catch (Exception e) {
                        Bitmap.Config[] configArr = v.a;
                        try {
                            aVarA.a.a(false);
                        } catch (Exception unused) {
                        }
                        throw e;
                    }
                }
            } catch (Throwable th12) {
                v.a(qu8Var);
                throw th12;
            }
        } else if (bVar != null) {
            v.a(bVar);
        }
        return null;
    }
}
