package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$observeData$1", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u9b extends p6a implements ci4<xd3<? extends Exception, ? extends ab1>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ o9b u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xn0.values().length];
            try {
                iArr[10] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9b(o9b o9bVar, r02<? super u9b> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        u9b u9bVar = new u9b(this.u, r02Var);
        u9bVar.t = obj;
        return u9bVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends ab1> xd3Var, r02<? super g2b> r02Var) {
        return ((u9b) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ab1 ab1Var;
        o9b o9bVar;
        bl0 bVar;
        d8b.c cVar;
        o9b o9bVar2 = this.u;
        m2b m2bVar = o9bVar2.Q;
        SimpleDateFormat simpleDateFormat = o9bVar2.W;
        SimpleDateFormat simpleDateFormat2 = o9bVar2.U;
        DecimalFormat decimalFormat = o9bVar2.T;
        bu8 bu8Var = o9bVar2.z;
        xn0 xn0Var = o9bVar2.P;
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        xd3.b bVar2 = xd3Var instanceof xd3.b ? (xd3.b) xd3Var : null;
        if (bVar2 == null || (ab1Var = (ab1) bVar2.a) == null) {
            return g2b.a;
        }
        ArrayList arrayList = ab1Var.a;
        ebb ebbVar = o9bVar2.O;
        decimalFormat.getClass();
        simpleDateFormat2.getClass();
        bu8Var.getClass();
        ebbVar.getClass();
        xn0Var.getClass();
        int iA = bu8Var.a(R.color.iconSecondaryActive);
        int iA2 = bu8Var.a(R.color.iconPrimaryDefault);
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            psa psaVar = (psa) obj2;
            int i2 = iA;
            int i3 = psaVar.a;
            boolean z = psaVar.h;
            n03 n03Var = psaVar.d;
            int i4 = iA2;
            Integer num = psaVar.i;
            String strB = li6.b(psaVar, bu8Var, xn0Var, decimalFormat);
            String strA = ki6.a(psaVar.g, bu8Var);
            int iD = ki6.d(n03Var, bu8Var);
            int iC = ki6.c(n03Var, bu8Var);
            String str = simpleDateFormat2.format(Long.valueOf(yk2.v(psaVar.j)));
            str.getClass();
            arrayList2.add(new vy2(i3, strB, strA, iD, iC, str, num != null ? num.intValue() : 0, (num != null ? num.intValue() : 0) > 0 ? i2 : i4, z ? i2 : i4, (num != null ? num.intValue() : 0) > 0 || z || ebbVar == ebb.CHALLENGES));
            iA = i2;
            iA2 = i4;
        }
        if (arrayList.isEmpty()) {
            o9bVar2.e(d8b.g.a);
            return g2b.a;
        }
        o9bVar2.e(new d8b.d(ab1Var.b, ab1Var.c));
        o9bVar2.e(new d8b.e(arrayList2));
        String strB2 = simpleDateFormat2.format(new Long(yk2.v(((psa) th1.G(arrayList)).j)));
        String str2 = simpleDateFormat2.format(new Long(yk2.v(((psa) th1.y(arrayList)).j)));
        if (arrayList.size() != 1) {
            strB2.getClass();
            str2.getClass();
            strB2 = bu8Var.b(R.string.displayed_period_format, strB2, str2);
        }
        strB2.getClass();
        o9bVar2.e(new d8b.f(strB2));
        int i5 = a.a[xn0Var.ordinal()];
        SimpleDateFormat simpleDateFormat3 = o9bVar2.V;
        if (i5 == 1) {
            simpleDateFormat3.getClass();
            simpleDateFormat.getClass();
            bu8Var.getClass();
            xn0Var.getClass();
            decimalFormat.getClass();
            int size2 = 7 - arrayList.size();
            ArrayList arrayList3 = new ArrayList();
            if (1 <= size2) {
                int i6 = 1;
                while (true) {
                    arrayList3.add(new js7(new mr0.a(-1, -1, null), BuildConfig.FLAVOR));
                    if (i6 == size2) {
                        break;
                    }
                    i6++;
                }
            }
            ArrayList arrayList4 = new ArrayList(ph1.n(arrayList, 10));
            int size3 = arrayList.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList.get(i7);
                int i8 = i7 + 1;
                psa psaVar2 = (psa) obj3;
                int i9 = size3;
                double d = psaVar2.b;
                LocalDate localDate = psaVar2.j;
                int i10 = (int) d;
                Double d2 = psaVar2.c;
                d8b.c cVar2 = cVar;
                o9b o9bVar3 = o9bVar2;
                int iDoubleValue = d2 != null ? (int) d2.doubleValue() : 0;
                String strB3 = li6.b(psaVar2, bu8Var, xn0Var, decimalFormat);
                String str3 = simpleDateFormat.format(Long.valueOf(yk2.v(localDate)));
                str3.getClass();
                arrayList4.add(new js7(new mr0.a(i10, iDoubleValue, new jl3(strB3, str3)), simpleDateFormat3.format(Long.valueOf(yk2.v(localDate)))));
                size3 = i9;
                i7 = i8;
                o9bVar2 = o9bVar3;
                cVar = cVar2;
            }
            o9bVar = o9bVar2;
            bVar = new d8b.c(new mr0(th1.K(th1.M(arrayList4), arrayList3)), new js7(xn0Var, m2bVar));
        } else {
            o9bVar = o9bVar2;
            decimalFormat.getClass();
            simpleDateFormat.getClass();
            simpleDateFormat3.getClass();
            bu8Var.getClass();
            xn0Var.getClass();
            int size4 = 7 - arrayList.size();
            ArrayList arrayList5 = new ArrayList();
            int i11 = 1;
            if (1 <= size4) {
                while (true) {
                    arrayList5.add(new js7(new ej0.a(0.0f, null), BuildConfig.FLAVOR));
                    if (i11 == size4) {
                        break;
                    }
                    i11++;
                }
            }
            ArrayList arrayList6 = new ArrayList(ph1.n(arrayList, 10));
            int size5 = arrayList.size();
            int i12 = 0;
            while (i12 < size5) {
                Object obj4 = arrayList.get(i12);
                i12++;
                psa psaVar3 = (psa) obj4;
                String strB4 = li6.b(psaVar3, bu8Var, xn0Var, decimalFormat);
                LocalDate localDate2 = psaVar3.j;
                DecimalFormat decimalFormat2 = decimalFormat;
                String str4 = simpleDateFormat.format(Long.valueOf(yk2.v(localDate2)));
                str4.getClass();
                arrayList6.add(new js7(new ej0.a((float) psaVar3.b, new jl3(strB4, str4)), simpleDateFormat3.format(Long.valueOf(yk2.v(localDate2)))));
                size5 = size5;
                arrayList = arrayList;
                decimalFormat = decimalFormat2;
            }
            bVar = new d8b.b(new ej0(th1.K(th1.M(arrayList6), arrayList5), xn0Var), new js7(xn0Var, m2bVar));
        }
        o9b o9bVar4 = o9bVar;
        o9bVar4.e(bVar);
        o9bVar4.f(f8b.b);
        return g2b.a;
    }
}
