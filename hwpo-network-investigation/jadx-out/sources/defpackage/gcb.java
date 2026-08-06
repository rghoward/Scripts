package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$subscribeToValuesUpdates$1", f = "ValuesListViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
public final class gcb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ybb u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$subscribeToValuesUpdates$1$1", f = "ValuesListViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<xd3<? extends Exception, ? extends lr7<osa>>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ybb v;

        /* JADX INFO: renamed from: gcb$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class C0094a extends wa implements ci4<lr7<osa>, r02<? super g2b>, Object> {
            /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
            /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
            /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:45:0x010c  */
            @Override // defpackage.ci4
            public final Object invoke(lr7<osa> lr7Var, r02<? super g2b> r02Var) {
                bl0 bVar;
                boolean z;
                String str;
                Double dH;
                String strF;
                String strB;
                g81 g81Var;
                Double d;
                Integer num;
                int iIntValue;
                Integer num2;
                int iIntValue2;
                wab zn0Var;
                lr7<osa> lr7Var2 = lr7Var;
                ybb ybbVar = (ybb) this.receiver;
                ybb.a aVar = ybb.Companion;
                ybbVar.getClass();
                ybbVar.e(new hbb.a(lr7Var2.b));
                ArrayList arrayList = lr7Var2.a;
                boolean zIsEmpty = arrayList.isEmpty();
                if (zIsEmpty) {
                    bVar = hbb.c.a;
                } else {
                    if (zIsEmpty) {
                        u.b();
                        return null;
                    }
                    DecimalFormat decimalFormat = ybbVar.F;
                    bu8 bu8Var = ybbVar.C;
                    decimalFormat.getClass();
                    bu8Var.getClass();
                    ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        osa osaVar = (osa) obj;
                        int iB = osaVar.b();
                        String strD = osaVar.d();
                        m2b m2bVarG = osaVar.g();
                        if (osaVar.c() == xn0.u && m2bVarG != m2b.u) {
                            Double dH2 = osaVar.h();
                            strB = ki6.b(dH2 != null ? (long) dH2.doubleValue() : 0L, bu8Var);
                        } else if (osaVar instanceof qr0) {
                            qr0 qr0Var = (qr0) osaVar;
                            if (qr0Var.c == xn0.D) {
                                String str2 = decimalFormat.format(qr0Var.d);
                                str2.getClass();
                                String str3 = decimalFormat.format(qr0Var.e);
                                str3.getClass();
                                strB = bu8Var.b(R.string.blood_pressure_last_value_format, str2, str3, qr0Var.h);
                            } else {
                                z = osaVar instanceof g81;
                                str = BuildConfig.FLAVOR;
                                if (z) {
                                    g81Var = (g81) osaVar;
                                    if (g81Var.c == xn0.w) {
                                        d = g81Var.d;
                                        if (d != null) {
                                            String str4 = decimalFormat.format(d.doubleValue());
                                            str4.getClass();
                                            num = g81Var.i;
                                            if (num != null) {
                                                iIntValue = num.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            Integer numValueOf = Integer.valueOf(iIntValue);
                                            num2 = g81Var.j;
                                            if (num2 != null) {
                                                iIntValue2 = num2.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            strB = bu8Var.b(R.string.last_value_round_reps_format, str4, numValueOf, Integer.valueOf(iIntValue2));
                                        } else {
                                            strB = BuildConfig.FLAVOR;
                                        }
                                    } else {
                                        dH = osaVar.h();
                                        if (dH != null) {
                                            String str5 = decimalFormat.format(dH.doubleValue());
                                            str5.getClass();
                                            strF = osaVar.f();
                                            if (strF != null) {
                                                str = strF;
                                            }
                                            strB = bu8Var.b(R.string.value_with_measure_no_parentheses, str5, str);
                                        } else {
                                            strB = BuildConfig.FLAVOR;
                                        }
                                    }
                                } else {
                                    dH = osaVar.h();
                                    if (dH != null) {
                                        String str6 = decimalFormat.format(dH.doubleValue());
                                        str6.getClass();
                                        strF = osaVar.f();
                                        if (strF != null) {
                                            str = strF;
                                        }
                                        strB = bu8Var.b(R.string.value_with_measure_no_parentheses, str6, str);
                                    } else {
                                        strB = BuildConfig.FLAVOR;
                                    }
                                }
                            }
                        } else {
                            z = osaVar instanceof g81;
                            str = BuildConfig.FLAVOR;
                            if (z) {
                                g81Var = (g81) osaVar;
                                if (g81Var.c == xn0.w) {
                                    d = g81Var.d;
                                    if (d != null) {
                                        String str7 = decimalFormat.format(d.doubleValue());
                                        str7.getClass();
                                        num = g81Var.i;
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        Integer numValueOf2 = Integer.valueOf(iIntValue);
                                        num2 = g81Var.j;
                                        if (num2 != null) {
                                            iIntValue2 = num2.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        strB = bu8Var.b(R.string.last_value_round_reps_format, str7, numValueOf2, Integer.valueOf(iIntValue2));
                                    } else {
                                        strB = BuildConfig.FLAVOR;
                                    }
                                } else {
                                    dH = osaVar.h();
                                    if (dH != null) {
                                        String str8 = decimalFormat.format(dH.doubleValue());
                                        str8.getClass();
                                        strF = osaVar.f();
                                        if (strF != null) {
                                            str = strF;
                                        }
                                        strB = bu8Var.b(R.string.value_with_measure_no_parentheses, str8, str);
                                    } else {
                                        strB = BuildConfig.FLAVOR;
                                    }
                                }
                            } else {
                                dH = osaVar.h();
                                if (dH != null) {
                                    String str9 = decimalFormat.format(dH.doubleValue());
                                    str9.getClass();
                                    strF = osaVar.f();
                                    if (strF != null) {
                                        str = strF;
                                    }
                                    strB = bu8Var.b(R.string.value_with_measure_no_parentheses, str9, str);
                                } else {
                                    strB = BuildConfig.FLAVOR;
                                }
                            }
                        }
                        String str10 = strB;
                        String strA = ki6.a(osaVar.e(), bu8Var);
                        int iD = ki6.d(osaVar.a(), bu8Var);
                        int iC = ki6.c(osaVar.a(), bu8Var);
                        if ((osaVar instanceof co0) || (osaVar instanceof qr0)) {
                            zn0Var = new zn0(strD, str10, iB, strA, iD, iC);
                        } else {
                            if (!(osaVar instanceof g81)) {
                                z90.a(al.d(ll8.a(osaVar.getClass()).c(), " is unknown TrackedValue."));
                                return null;
                            }
                            zn0Var = new z71(iB, strD, ((g81) osaVar).k, str10, strA, iD, iC);
                        }
                        arrayList2.add(zn0Var);
                    }
                    bVar = new hbb.b(arrayList2);
                }
                ybbVar.e(bVar);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ybb ybbVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = ybbVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(xd3<? extends Exception, ? extends lr7<osa>> xd3Var, r02<? super g2b> r02Var) {
            return ((a) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            xd3 xd3Var = (xd3) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                C0094a c0094a = new C0094a(2, this.v, ybb.class, "listValuesUpdated", "listValuesUpdated(Lcom/hwpo_training_app/core/domain/model/PaginatedData;)V", 4);
                this.u = null;
                this.t = 1;
                Object objB = yd3.b(xd3Var, c0094a, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcb(ybb ybbVar, r02<? super gcb> r02Var) {
        super(2, r02Var);
        this.u = ybbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gcb(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gcb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ybb ybbVar = this.u;
            of7 of7Var = ybbVar.z;
            Object obj2 = g2b.a;
            e84 e84VarB = of7Var.b(obj2);
            a aVar = new a(ybbVar, null);
            this.t = 1;
            Object objCollect = e84VarB.collect(new k74.a(jc7.t, aVar), this);
            v72 v72Var = v72.t;
            if (objCollect != v72Var) {
                objCollect = obj2;
            }
            if (objCollect == v72Var) {
                obj2 = objCollect;
            }
            if (obj2 == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
