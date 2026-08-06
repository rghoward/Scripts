package defpackage;

import android.content.Context;
import androidx.fragment.app.g;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ su5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        float f;
        boolean z;
        long j;
        gu5 gu5Var;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                zu5 zu5Var = (zu5) obj2;
                xu5 xu5Var = zu5Var.p;
                xr2 xr2Var = zu5Var.a;
                boolean z2 = zu5Var.i;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || zu5Var.d()) && (f2 <= 0.0f || zu5Var.b())) {
                    if (Math.abs(zu5Var.g) > 0.5f) {
                        xc5.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = zu5Var.g + f2;
                    zu5Var.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = zu5Var.g;
                        int iB = wk6.b(f4);
                        gu5 gu5VarO = ((gu5) zu5Var.e.getValue()).o(iB, !zu5Var.b);
                        if (gu5VarO != null && (gu5Var = zu5Var.c) != null) {
                            gu5 gu5VarO2 = gu5Var.o(iB, true);
                            if (gu5VarO2 != null) {
                                zu5Var.c = gu5VarO2;
                            } else {
                                gu5VarO = null;
                            }
                        }
                        fl7 fl7Var = fl7.t;
                        int i2 = 0;
                        if (gu5VarO != null) {
                            zu5Var.f(gu5VarO, zu5Var.b, true);
                            f18.b(zu5Var.r);
                            float f5 = f4 - zu5Var.g;
                            if (z2) {
                                k37<lx5.b> k37Var = xr2Var.b;
                                if (gu5VarO.g().isEmpty()) {
                                    f = 0.5f;
                                } else {
                                    z = f5 < 0.0f;
                                    int iB2 = xr2.b(gu5VarO, z);
                                    f = 0.5f;
                                    int iA = xr2.a(gu5VarO, z);
                                    if (iA >= 0 && iA < gu5VarO.e()) {
                                        if (iB2 == xr2Var.a || iB2 < 0) {
                                            j = 4294967295L;
                                        } else {
                                            if (xr2Var.c != z) {
                                                lx5.b[] bVarArr = k37Var.t;
                                                int i3 = k37Var.v;
                                                j = 4294967295L;
                                                for (int i4 = 0; i4 < i3; i4++) {
                                                    bVarArr[i4].cancel();
                                                }
                                            } else {
                                                j = 4294967295L;
                                            }
                                            xr2Var.c = z;
                                            xr2Var.a = iB2;
                                            k37Var.k();
                                            k37Var.f(k37Var.v, xu5Var.a(iB2));
                                        }
                                        if (z) {
                                            kt5 kt5Var = (kt5) th1.G(gu5VarO.g());
                                            if (((pu5.a(kt5Var, gu5VarO.c()) + ((int) (gu5VarO.c() == fl7Var ? kt5Var.a() & j : kt5Var.a() >> 32))) + gu5VarO.f()) - gu5VarO.i() < (-f5)) {
                                                lx5.b[] bVarArr2 = k37Var.t;
                                                int i5 = k37Var.v;
                                                while (i2 < i5) {
                                                    bVarArr2[i2].c();
                                                    i2++;
                                                }
                                            }
                                        } else if (gu5VarO.k() - pu5.a((kt5) th1.y(gu5VarO.g()), gu5VarO.c()) < f5) {
                                            lx5.b[] bVarArr3 = k37Var.t;
                                            int i6 = k37Var.v;
                                            while (i2 < i6) {
                                                bVarArr3[i2].c();
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                xr2Var.e = f5;
                            } else {
                                f = 0.5f;
                            }
                        } else {
                            f = 0.5f;
                            fm8 fm8Var = zu5Var.j;
                            if (fm8Var != null) {
                                fm8Var.i();
                            }
                            float f6 = f4 - zu5Var.g;
                            cu5 cu5VarG = zu5Var.g();
                            if (z2) {
                                k37<lx5.b> k37Var2 = xr2Var.b;
                                if (!cu5VarG.g().isEmpty()) {
                                    z = f6 < 0.0f;
                                    int iB3 = xr2.b(cu5VarG, z);
                                    int iA2 = xr2.a(cu5VarG, z);
                                    if (iA2 >= 0 && iA2 < cu5VarG.e()) {
                                        if (iB3 != xr2Var.a && iB3 >= 0) {
                                            if (xr2Var.c != z) {
                                                lx5.b[] bVarArr4 = k37Var2.t;
                                                int i7 = k37Var2.v;
                                                for (int i8 = 0; i8 < i7; i8++) {
                                                    bVarArr4[i8].cancel();
                                                }
                                            }
                                            xr2Var.c = z;
                                            xr2Var.a = iB3;
                                            k37Var2.k();
                                            k37Var2.f(k37Var2.v, xu5Var.a(iB3));
                                        }
                                        if (z) {
                                            kt5 kt5Var2 = (kt5) th1.G(cu5VarG.g());
                                            if (((pu5.a(kt5Var2, cu5VarG.c()) + ((int) (cu5VarG.c() == fl7Var ? kt5Var2.a() & 4294967295L : kt5Var2.a() >> 32))) + cu5VarG.f()) - cu5VarG.i() < (-f6)) {
                                                lx5.b[] bVarArr5 = k37Var2.t;
                                                int i9 = k37Var2.v;
                                                while (i2 < i9) {
                                                    bVarArr5[i2].c();
                                                    i2++;
                                                }
                                            }
                                        } else if (cu5VarG.k() - pu5.a((kt5) th1.y(cu5VarG.g()), cu5VarG.c()) < f6) {
                                            lx5.b[] bVarArr6 = k37Var2.t;
                                            int i10 = k37Var2.v;
                                            while (i2 < i10) {
                                                bVarArr6[i2].c();
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                xr2Var.e = f6;
                            }
                        }
                    } else {
                        f = 0.5f;
                    }
                    if (Math.abs(zu5Var.g) > f) {
                        f2 -= zu5Var.g;
                        zu5Var.g = 0.0f;
                    }
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(-f2);
            default:
                jo9 jo9Var = (jo9) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = jo9.C;
                gm3Var.getClass();
                if (gm3Var instanceof to9) {
                    jo9Var.m(((to9) gm3Var).b);
                } else if (gm3Var instanceof ro9) {
                    Context context = jo9Var.getContext();
                    if (context != null) {
                        yz1.a(context, ((ro9) gm3Var).b);
                    }
                } else if (gm3Var instanceof so9) {
                    g gVarRequireActivity = jo9Var.requireActivity();
                    gVarRequireActivity.getClass();
                    nr1.d(gVarRequireActivity, xp5.MAIN_TABS);
                }
                return g2b.a;
        }
    }
}
