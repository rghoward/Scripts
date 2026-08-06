package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m07 implements ps7 {
    public final iw a;
    public final List<iw.c<mz7>> b;
    public final ss5 c;
    public final ss5 d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    public m07(iw iwVar, wja wjaVar, List<iw.c<mz7>> list, tx2 tx2Var, qa4.a aVar) {
        iw iwVar2 = iwVar;
        wja wjaVar2 = wjaVar;
        this.a = iwVar2;
        this.b = list;
        int i = 1;
        m24 m24Var = new m24(i, this);
        j26 j26Var = j26.u;
        this.c = hv5.c(j26Var, m24Var);
        this.d = hv5.c(j26Var, new j32(i, this));
        ss7 ss7Var = wjaVar2.b;
        iw iwVar3 = lw.a;
        ArrayList arrayList = iwVar2.w;
        String str = iwVar2.u;
        hf3 hf3Var = hf3.t;
        List listN = arrayList != null ? th1.N(arrayList, new kw()) : hf3Var;
        ArrayList arrayList2 = new ArrayList();
        h30 h30Var = new h30();
        int size = listN.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            iw.c cVar = (iw.c) listN.get(i3);
            iw.c cVarA = iw.c.a(cVar, ss7Var.a((ss7) cVar.a), i2, 14);
            T t = cVarA.a;
            int i5 = cVarA.c;
            int i6 = cVarA.b;
            while (i4 < i6 && !h30Var.isEmpty()) {
                iw.c cVar2 = (iw.c) h30Var.last();
                listN = listN;
                int i7 = cVar2.c;
                hf3Var = hf3Var;
                T t2 = cVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new iw.c(i4, i6, t2));
                    i4 = i6;
                } else {
                    int i8 = size;
                    arrayList2.add(new iw.c(i4, i7, t2));
                    i4 = cVar2.c;
                    while (!h30Var.isEmpty() && i4 == ((iw.c) h30Var.last()).c) {
                        h30Var.removeLast();
                    }
                    size = i8;
                }
            }
            List list2 = listN;
            hf3 hf3Var2 = hf3Var;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new iw.c(i4, i6, ss7Var));
                i4 = i6;
            }
            iw.c cVar3 = (iw.c) h30Var.l();
            if (cVar3 != null) {
                int i10 = cVar3.c;
                T t3 = cVar3.a;
                int i11 = cVar3.b;
                if (i11 == i6 && i10 == i5) {
                    h30Var.removeLast();
                    h30Var.addLast(new iw.c(i6, i5, ((ss7) t3).a((ss7) t)));
                } else if (i11 == i10) {
                    arrayList2.add(new iw.c(i11, i10, t3));
                    h30Var.removeLast();
                    h30Var.addLast(new iw.c(i6, i5, t));
                } else {
                    if (i10 < i5) {
                        zn3.b();
                        throw null;
                    }
                    h30Var.addLast(new iw.c(i6, i5, ((ss7) t3).a((ss7) t)));
                }
            } else {
                h30Var.addLast(new iw.c(i6, i5, t));
            }
            i3++;
            listN = list2;
            hf3Var = hf3Var2;
            size = i9;
            i2 = 0;
        }
        hf3 hf3Var3 = hf3Var;
        while (i4 <= str.length() && !h30Var.isEmpty()) {
            iw.c cVar4 = (iw.c) h30Var.last();
            T t4 = cVar4.a;
            int i12 = cVar4.c;
            arrayList2.add(new iw.c(i4, i12, t4));
            while (!h30Var.isEmpty() && i12 == ((iw.c) h30Var.last()).c) {
                h30Var.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str.length()) {
            arrayList2.add(new iw.c(i4, str.length(), ss7Var));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new iw.c(0, 0, ss7Var));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i13 = 0;
        for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
            iw.c cVar5 = (iw.c) arrayList2.get(i13);
            int i14 = cVar5.b;
            int i15 = cVar5.c;
            String strSubstring = i14 != i15 ? str.substring(i14, i15) : BuildConfig.FLAVOR;
            List listA = lw.a(iwVar2, i14, i15, new jw(0));
            iw iwVar4 = new iw(strSubstring, (List<? extends iw.c<? extends iw.a>>) (listA == null ? hf3Var3 : listA));
            ss7 ss7Var2 = (ss7) cVar5.a;
            if (ss7Var2.b == 0) {
                ss7Var2 = new ss7(ss7Var2.a, ss7Var.b, ss7Var2.c, ss7Var2.d, ss7Var2.e, ss7Var2.f, ss7Var2.g, ss7Var2.h, ss7Var2.i);
            }
            wja wjaVar3 = new wja(wjaVar2.a, ss7Var.a(ss7Var2));
            List<iw.c<? extends iw.a>> list3 = iwVar4.t;
            List<iw.c<? extends iw.a>> list4 = list3 == null ? hf3Var3 : list3;
            List<iw.c<mz7>> list5 = this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                iw.c<mz7> cVar6 = list5.get(i16);
                int i17 = cVar6.b;
                ss7 ss7Var3 = ss7Var;
                int i18 = cVar6.c;
                if (lw.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        vc5.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new iw.c(i17 - i14, i18 - i14, cVar6.a));
                }
                i16++;
                wjaVar3 = wjaVar3;
                ss7Var = ss7Var3;
            }
            arrayList3.add(new os7(new tp(strSubstring, wjaVar3, list4, arrayList4, aVar, tx2Var), i14, i15));
            i13++;
            iwVar2 = iwVar;
            wjaVar2 = wjaVar;
            str = str;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.ps7
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((os7) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ps7
    public final float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    @Override // defpackage.ps7
    public final float c() {
        return ((Number) this.d.getValue()).floatValue();
    }
}
