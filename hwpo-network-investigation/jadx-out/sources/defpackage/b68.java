package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b68 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements fi4<Integer, Integer, Integer, Integer, g2b> {
        public final /* synthetic */ ViewStructure u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewStructure viewStructure) {
            super(4);
            this.u = viewStructure;
        }

        @Override // defpackage.fi4
        public final g2b invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue();
            int iIntValue4 = num4.intValue() - iIntValue2;
            this.u.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
            return g2b.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0374  */
    /* JADX WARN: Code duplicated, block: B:183:0x037d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0388  */
    /* JADX WARN: Code duplicated, block: B:190:0x038e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0397 A[LOOP:5: B:191:0x0395->B:192:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ViewStructure viewStructure, mb9 mb9Var, AutofillId autofillId, String str, xk8 xk8Var) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        boolean zBooleanValue;
        fqa fqaVar;
        iw iwVar;
        fo foVar;
        ex8 ex8Var;
        bz1 bz1Var;
        boolean z;
        pz1 pz1Var;
        Boolean bool;
        boolean z2;
        Integer num;
        int i2;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String strC;
        int size;
        String strA;
        int i3;
        String[] strArrB;
        String[] strArrB2;
        c37<gc9<?>, Object> c37Var;
        List list2;
        int i4;
        int i5;
        c37<gc9<?>, Object> c37Var2;
        fqa fqaVar2;
        iw iwVar2;
        fo foVar2;
        ex8 ex8Var2;
        long j4;
        gc9<List<String>> gc9Var = ac9.a;
        gc9<k3<oh4<List<ria>, Boolean>>> gc9Var2 = kb9.a;
        lb9 lb9VarR = mb9Var.r();
        int i6 = 2;
        long j5 = -9187201950435737472L;
        int i7 = 8;
        if (lb9VarR == null || (c37Var2 = lb9VarR.t) == null) {
            i = 2;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            c = 7;
            zBooleanValue = true;
            fqaVar = null;
            iwVar = null;
            foVar = null;
            ex8Var = null;
            bz1Var = null;
            z = false;
            pz1Var = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            Object[] objArr = c37Var2.b;
            Object[] objArr2 = c37Var2.c;
            long[] jArr = c37Var2.a;
            j2 = 128;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i8 = 0;
                bz1Var = null;
                z = false;
                fqaVar2 = null;
                iwVar2 = null;
                foVar2 = null;
                pz1Var = null;
                bool = null;
                ex8Var2 = null;
                z2 = false;
                num = null;
                j3 = 255;
                while (true) {
                    long j6 = jArr[i8];
                    i = i6;
                    c = 7;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j6 & 255) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr[i11];
                                Object obj2 = objArr2[i11];
                                j4 = j5;
                                gc9 gc9Var3 = (gc9) obj;
                                if (xj5.a(gc9Var3, ac9.s)) {
                                    obj2.getClass();
                                    bz1Var = (bz1) obj2;
                                } else if (xj5.a(gc9Var3, ac9.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) th1.A((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (xj5.a(gc9Var3, ac9.r)) {
                                    obj2.getClass();
                                    pz1Var = (pz1) obj2;
                                } else if (xj5.a(gc9Var3, ac9.t)) {
                                    obj2.getClass();
                                    foVar2 = (fo) obj2;
                                } else if (xj5.a(gc9Var3, ac9.G)) {
                                    obj2.getClass();
                                    iwVar2 = (iw) obj2;
                                } else if (xj5.a(gc9Var3, ac9.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (xj5.a(gc9Var3, ac9.P)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (xj5.a(gc9Var3, ac9.L)) {
                                    z2 = true;
                                } else if (xj5.a(gc9Var3, ac9.o)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (xj5.a(gc9Var3, ac9.z)) {
                                    obj2.getClass();
                                    ex8Var2 = (ex8) obj2;
                                } else if (xj5.a(gc9Var3, ac9.J)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (xj5.a(gc9Var3, ac9.K)) {
                                    obj2.getClass();
                                    fqaVar2 = (fqa) obj2;
                                } else if (xj5.a(gc9Var3, kb9.b)) {
                                    viewStructure.setClickable(true);
                                } else if (xj5.a(gc9Var3, kb9.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (xj5.a(gc9Var3, kb9.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (xj5.a(gc9Var3, kb9.k)) {
                                    z = true;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i10++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i9 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    i6 = i;
                    j5 = j;
                }
            } else {
                i = 2;
                j = -9187201950435737472L;
                j3 = 255;
                c = 7;
                zBooleanValue = true;
                bz1Var = null;
                z = false;
                fqaVar2 = null;
                iwVar2 = null;
                foVar2 = null;
                pz1Var = null;
                bool = null;
                ex8Var2 = null;
                z2 = false;
                num = null;
            }
            fqaVar = fqaVar2;
            iwVar = iwVar2;
            foVar = foVar2;
            ex8Var = ex8Var2;
        }
        lb9 lb9VarR2 = mb9Var.r();
        if (lb9VarR2 != null && lb9VarR2.v && !lb9VarR2.w) {
            lb9VarR2 = lb9VarR2.e();
            t27 t27Var = new t27(mb9Var.t().size());
            t27Var.i(mb9Var.t());
            while (t27Var.e()) {
                mb9 mb9Var2 = (mb9) t27Var.l(t27Var.b - 1);
                lb9 lb9VarR3 = mb9Var2.r();
                if (lb9VarR3 != null && !lb9VarR3.v) {
                    lb9VarR2.i(lb9VarR3);
                    if (!lb9VarR3.w) {
                        t27Var.i(mb9Var2.t());
                    }
                }
            }
        }
        if (lb9VarR2 == null || (c37Var = lb9VarR2.t) == null) {
            i2 = 1;
            list = null;
        } else {
            Object[] objArr3 = c37Var.b;
            Object[] objArr4 = c37Var.c;
            long[] jArr2 = c37Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i12 = 1;
                int i13 = 0;
                list2 = null;
                while (true) {
                    long j7 = jArr2[i13];
                    int i14 = i7;
                    if ((((~j7) << c) & j7 & j) != j) {
                        int i15 = 8 - ((~(i13 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j7 & j3) < j2) {
                                int i17 = (i13 << 3) + i16;
                                Object obj3 = objArr3[i17];
                                Object obj4 = objArr4[i17];
                                i5 = i12;
                                gc9 gc9Var4 = (gc9) obj3;
                                if (xj5.a(gc9Var4, ac9.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (xj5.a(gc9Var4, ac9.C)) {
                                    obj4.getClass();
                                    list2 = (List) obj4;
                                }
                            } else {
                                i5 = i12;
                            }
                            j7 >>= i14;
                            i16++;
                            i12 = i5;
                        }
                        i2 = i12;
                        i4 = i14;
                        if (i15 != i4) {
                            break;
                        }
                    } else {
                        i2 = i12;
                        i4 = i14;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    i7 = i4;
                    i12 = i2;
                }
            } else {
                i2 = 1;
                list2 = null;
            }
            list = list2;
        }
        Integer numValueOf2 = Integer.valueOf(mb9Var.d());
        if (mb9Var.s() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        gf0.d(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (bz1Var != null) {
            numValueOf = Integer.valueOf(((en) bz1Var).a);
        } else if (z) {
            numValueOf = Integer.valueOf(i2);
        } else {
            numValueOf = fqaVar != null ? Integer.valueOf(i) : null;
        }
        if (numValueOf != null) {
            gf0.e(viewStructure, numValueOf.intValue());
        }
        if (iwVar != null) {
            gf0.f(viewStructure, gf0.a(iwVar.u));
        }
        if (foVar != null) {
            gf0.f(viewStructure, foVar.a);
        }
        if (pz1Var != null && (strArrB2 = rd7.b(pz1Var)) != null) {
            gf0.c(viewStructure, strArrB2);
        }
        xk8Var.b.e(mb9Var.d(), new a(viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (fqaVar != null) {
            viewStructure.setCheckable(i2);
            viewStructure.setChecked(fqaVar == fqa.t);
        } else if (bool != null && (ex8Var == null || ex8Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        pz1.a.getClass();
        String str2 = (String) u30.w(rd7.b(pz1.a.b));
        if (pz1Var != null && (strArrB = rd7.b(pz1Var)) != null) {
            z3 = true;
            boolean z6 = u30.t(str2, strArrB);
            if (!z2 || z6) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            gf0.g(viewStructure, z5);
            viewStructure.setVisibility(mb9Var.u() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strA = BuildConfig.FLAVOR;
                for (i3 = 0; i3 < size; i3++) {
                    strA = wu0.a(bl2.a(strA), ((iw) list.get(i3)).u, '\n');
                }
                viewStructure.setText(strA);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (mb9Var.t().isEmpty() && ex8Var != null && (strC = kc9.c(ex8Var.a)) != null) {
                viewStructure.setClassName(strC);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    if0.b(viewStructure, num.intValue());
                }
                if (z4) {
                    gf0.h(viewStructure);
                }
            }
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        gf0.g(viewStructure, z5);
        viewStructure.setVisibility(mb9Var.u() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strA = BuildConfig.FLAVOR;
            while (i3 < size) {
                strA = wu0.a(bl2.a(strA), ((iw) list.get(i3)).u, '\n');
            }
            viewStructure.setText(strA);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (mb9Var.t().isEmpty()) {
            viewStructure.setClassName(strC);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                if0.b(viewStructure, num.intValue());
            }
            if (z4) {
                gf0.h(viewStructure);
            }
        }
    }
}
