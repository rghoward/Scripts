package defpackage;

import com.hwpo_training_app.core.data.model.user.GenderNetworkEntity;
import com.hwpo_training_app.core.data.model.user.LengthUnitsNetworkEntity;
import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.hwpo_training_app.core.data.model.user.WeightUnitsNetworkEntity;
import com.hwpo_training_app.core.domain.model.auth.AuthResponse;
import com.hwpo_training_app.core.domain.model.response.MessageResponse;
import com.hwpo_training_app.multilanguage.data.model.AppLanguageNetworkEntity;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d6b implements w5b {
    public final ga0 a;
    public final e6b b;
    public final e6 c;
    public final k55 d;
    public final lw7 e;
    public final wg9 f;
    public final pc2 g;
    public final j74 h;

    public d6b(ga0 ga0Var, e6b e6bVar, e6 e6Var, k55 k55Var, lw7 lw7Var, wg9 wg9Var, pc2 pc2Var) {
        ga0Var.getClass();
        e6Var.getClass();
        k55Var.getClass();
        lw7Var.getClass();
        wg9Var.getClass();
        pc2Var.getClass();
        this.a = ga0Var;
        this.b = e6bVar;
        this.c = e6Var;
        this.d = k55Var;
        this.e = lw7Var;
        this.f = wg9Var;
        this.g = pc2Var;
        this.h = new j74(wg9Var.a());
    }

    @Override // defpackage.w5b
    public final j74 a() {
        return this.h;
    }

    @Override // defpackage.w5b
    public final String b() {
        String strB = this.c.b();
        this.f.e(strB);
        return strB;
    }

    @Override // defpackage.w5b
    public final Object c(u02 u02Var) {
        return this.g.c(u02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.w5b
    public final Object d(String str, u02 u02Var) throws Throwable {
        x5b x5bVar;
        if (u02Var instanceof x5b) {
            x5bVar = (x5b) u02Var;
            int i = x5bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x5bVar.v = i - Integer.MIN_VALUE;
            } else {
                x5bVar = new x5b(this, u02Var);
            }
        } else {
            x5bVar = new x5b(this, u02Var);
        }
        Object objE = x5bVar.t;
        int i2 = x5bVar.v;
        if (i2 == 0) {
            dv8.b(objE);
            x5bVar.v = 1;
            objE = this.a.e(str, x5bVar);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objE);
        }
        return ((MessageResponse) objE).a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // defpackage.w5b
    public final Object e(String str, String str2, uj4 uj4Var, String str3, ylb ylbVar, n33 n33Var, LocalDate localDate, s10 s10Var, u02 u02Var) throws Throwable {
        c6b c6bVar;
        String str4;
        String str5;
        String str6;
        String str7;
        Object objA;
        AppLanguageNetworkEntity appLanguageNetworkEntity;
        LengthUnitsNetworkEntity lengthUnitsNetworkEntity;
        WeightUnitsNetworkEntity weightUnitsNetworkEntity;
        GenderNetworkEntity genderNetworkEntity;
        if (u02Var instanceof c6b) {
            c6bVar = (c6b) u02Var;
            int i = c6bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6bVar.v = i - Integer.MIN_VALUE;
            } else {
                c6bVar = new c6b(this, u02Var);
            }
        } else {
            c6bVar = new c6b(this, u02Var);
        }
        c6b c6bVar2 = c6bVar;
        Object obj = c6bVar2.t;
        int i2 = c6bVar2.v;
        if (i2 == 0) {
            dv8.b(obj);
            if (uj4Var != null) {
                int iOrdinal = uj4Var.ordinal();
                if (iOrdinal == 0) {
                    genderNetworkEntity = GenderNetworkEntity.v;
                } else if (iOrdinal == 1) {
                    genderNetworkEntity = GenderNetworkEntity.w;
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    genderNetworkEntity = GenderNetworkEntity.x;
                }
                str4 = genderNetworkEntity.t;
            } else {
                str4 = null;
            }
            if (ylbVar != null) {
                int iOrdinal2 = ylbVar.ordinal();
                if (iOrdinal2 == 0) {
                    weightUnitsNetworkEntity = WeightUnitsNetworkEntity.v;
                } else {
                    if (iOrdinal2 != 1) {
                        u.b();
                        return null;
                    }
                    weightUnitsNetworkEntity = WeightUnitsNetworkEntity.w;
                }
                str5 = weightUnitsNetworkEntity.t;
            } else {
                str5 = null;
            }
            if (n33Var != null) {
                int iOrdinal3 = n33Var.ordinal();
                if (iOrdinal3 == 0) {
                    lengthUnitsNetworkEntity = LengthUnitsNetworkEntity.v;
                } else {
                    if (iOrdinal3 != 1) {
                        u.b();
                        return null;
                    }
                    lengthUnitsNetworkEntity = LengthUnitsNetworkEntity.w;
                }
                str6 = lengthUnitsNetworkEntity.t;
            } else {
                str6 = null;
            }
            if (s10Var != null) {
                int iOrdinal4 = s10Var.ordinal();
                if (iOrdinal4 == 0) {
                    appLanguageNetworkEntity = AppLanguageNetworkEntity.v;
                } else if (iOrdinal4 == 1) {
                    appLanguageNetworkEntity = AppLanguageNetworkEntity.w;
                } else {
                    if (iOrdinal4 != 2) {
                        u.b();
                        return null;
                    }
                    appLanguageNetworkEntity = AppLanguageNetworkEntity.x;
                }
                str7 = appLanguageNetworkEntity.t;
            } else {
                str7 = null;
            }
            c6bVar2.v = 1;
            objA = e6b.a(this.b, str, str2, str4, str3, str5, str6, localDate, null, null, str7, c6bVar2, 384);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            objA = obj;
        }
        h5b h5bVarA = ((UserNetworkEntity) objA).a();
        wg9 wg9Var = this.f;
        h5b h5bVarB = wg9Var.b();
        boolean z = (h5bVarB != null ? h5bVarB.p : null) != h5bVarA.p;
        wg9Var.c(h5bVarA);
        return new z3b(z);
    }

    @Override // defpackage.w5b
    public final Object f(sb1 sb1Var) {
        Object objA = this.e.a(sb1Var);
        return objA == v72.t ? objA : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // defpackage.w5b
    public final Object g(yp4 yp4Var, u02 u02Var) throws Throwable {
        b6b b6bVar;
        v72 v72Var;
        UserNetworkEntity userNetworkEntity;
        if (u02Var instanceof b6b) {
            b6bVar = (b6b) u02Var;
            int i = b6bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                b6bVar.v = i - Integer.MIN_VALUE;
            } else {
                b6bVar = new b6b(this, u02Var);
            }
        } else {
            b6bVar = new b6b(this, u02Var);
        }
        b6b b6bVar2 = b6bVar;
        Object obj = b6bVar2.t;
        int i2 = b6bVar2.v;
        if (i2 == 0) {
            dv8.b(obj);
            boolean zA = xj5.a(yp4Var, yp4.b.t);
            e6b e6bVar = this.b;
            v72 v72Var2 = v72.t;
            if (zA || xj5.a(yp4Var, yp4.c.t)) {
                v72Var = v72Var2;
                String string = yp4Var.toString();
                b6bVar2.v = 1;
                Object objA = e6b.a(e6bVar, null, null, null, null, null, null, null, string, null, null, b6bVar2, 895);
                if (objA != v72Var) {
                    obj = objA;
                    userNetworkEntity = (UserNetworkEntity) obj;
                }
            } else if (yp4Var instanceof yp4.a) {
                Integer num = new Integer(((yp4.a) yp4Var).t);
                b6bVar2.v = 2;
                v72Var = v72Var2;
                Object objA2 = e6b.a(e6bVar, null, null, null, null, null, null, null, "affiliated", num, null, b6bVar2, 639);
                if (objA2 != v72Var) {
                    obj = objA2;
                    userNetworkEntity = (UserNetworkEntity) obj;
                }
            } else {
                v72Var = v72Var2;
                if (yp4Var != null) {
                    u.b();
                    return null;
                }
                b6bVar2.v = 3;
                Object objA3 = e6b.a(e6bVar, null, null, null, null, null, null, null, "null", null, null, b6bVar2, 895);
                if (objA3 != v72Var) {
                    obj = objA3;
                    userNetworkEntity = (UserNetworkEntity) obj;
                }
            }
            return v72Var;
        }
        if (i2 == 1) {
            dv8.b(obj);
            userNetworkEntity = (UserNetworkEntity) obj;
        } else if (i2 == 2) {
            dv8.b(obj);
            userNetworkEntity = (UserNetworkEntity) obj;
        } else {
            if (i2 != 3) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            userNetworkEntity = (UserNetworkEntity) obj;
        }
        this.f.c(userNetworkEntity.a());
        return g2b.a;
    }

    @Override // defpackage.w5b
    public final Object h(String str, u02 u02Var) {
        this.d.getClass();
        Object objD = this.a.d(str, "prod", u02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.w5b
    public final Object i(u02 u02Var) throws Throwable {
        a6b a6bVar;
        if (u02Var instanceof a6b) {
            a6bVar = (a6b) u02Var;
            int i = a6bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                a6bVar.v = i - Integer.MIN_VALUE;
            } else {
                a6bVar = new a6b(this, u02Var);
            }
        } else {
            a6bVar = new a6b(this, u02Var);
        }
        Object objB = a6bVar.t;
        int i2 = a6bVar.v;
        if (i2 == 0) {
            dv8.b(objB);
            a6bVar.v = 1;
            objB = this.a.b(a6bVar);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        this.f.c(((UserNetworkEntity) objB).a());
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w5b
    public final Object j(String str, String str2, u02 u02Var) throws Throwable {
        y5b y5bVar;
        h5b h5bVar;
        if (u02Var instanceof y5b) {
            y5bVar = (y5b) u02Var;
            int i = y5bVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                y5bVar.w = i - Integer.MIN_VALUE;
            } else {
                y5bVar = new y5b(this, u02Var);
            }
        } else {
            y5bVar = new y5b(this, u02Var);
        }
        y5b y5bVar2 = y5bVar;
        Object objA = y5bVar2.u;
        int i2 = y5bVar2.w;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(objA);
            this.d.getClass();
            y5bVar2.w = 1;
            objA = this.a.a("-V7AJI-K7aiTfOKf_KixiRzjcuGK4OdYKuVWj5DoIKQ", "OY-loQv3iaDelRC8OyLJgW8_VXKST1fc5IgR0G-Clhw", str, str2, y5bVar2);
            if (objA != v72Var) {
            }
            return v72Var;
        }
        if (i2 == 1) {
            dv8.b(objA);
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h5bVar = y5bVar2.t;
            dv8.b(objA);
        }
        return new ha0.a(h5bVar);
        ru8 ru8Var = (ru8) objA;
        qu8 qu8Var = ru8Var.a;
        if (!qu8Var.J) {
            if (qu8Var.w == 403) {
                return ha0.b.a;
            }
            throw new q45(ru8Var);
        }
        T t = ru8Var.b;
        if (t == 0) {
            z90.a("Required value was null.");
            return null;
        }
        AuthResponse authResponse = (AuthResponse) t;
        String str3 = authResponse.a;
        h5b h5bVarA = authResponse.c.a();
        wg9 wg9Var = this.f;
        wg9Var.c(h5bVarA);
        wg9Var.e(str3);
        y5bVar2.t = h5bVarA;
        y5bVar2.w = 2;
        if (this.c.e(str3) != v72Var) {
            h5bVar = h5bVarA;
            return new ha0.a(h5bVar);
        }
        return v72Var;
    }

    @Override // defpackage.w5b
    public final Object k(sb1 sb1Var) {
        return this.e.c(sb1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r7 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r5.c.d() == r4) goto L28;
     */
    @Override // defpackage.w5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.z5b
            if (r0 == 0) goto L13
            r0 = r7
            z5b r0 = (defpackage.z5b) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            z5b r0 = new z5b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r7)
            goto L65
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            boolean r6 = r0.t
            defpackage.dv8.b(r7)
            goto L49
        L37:
            defpackage.dv8.b(r7)
            if (r6 != 0) goto L58
            r0.t = r6
            r0.w = r3
            ga0 r7 = r5.a
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r4) goto L49
            goto L64
        L49:
            ru8 r7 = (defpackage.ru8) r7
            qu8 r1 = r7.a
            boolean r1 = r1.J
            if (r1 == 0) goto L52
            goto L58
        L52:
            q45 r5 = new q45
            r5.<init>(r7)
            throw r5
        L58:
            r0.t = r6
            r0.w = r2
            e6 r6 = r5.c
            g2b r6 = r6.d()
            if (r6 != r4) goto L65
        L64:
            return r4
        L65:
            wg9 r5 = r5.f
            r5.clear()
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6b.l(boolean, u02):java.lang.Object");
    }
}
