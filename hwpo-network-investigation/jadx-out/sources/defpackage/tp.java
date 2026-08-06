package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.emoji2.text.d;
import com.intercom.twig.BuildConfig;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp implements ps7 {
    public final String a;
    public final wja b;
    public final List<iw.c<? extends iw.a>> c;
    public final List<iw.c<mz7>> d;
    public final qa4.a e;
    public final tx2 f;
    public final ms g;
    public final CharSequence h;
    public final cr5 i;
    public tza j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:231:0x0465  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:246:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:251:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:256:0x0508  */
    /* JADX WARN: Code duplicated, block: B:259:0x051a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0526  */
    /* JADX WARN: Code duplicated, block: B:270:0x053c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0559  */
    /* JADX WARN: Code duplicated, block: B:286:0x0592  */
    /* JADX WARN: Code duplicated, block: B:288:0x0598  */
    /* JADX WARN: Code duplicated, block: B:291:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:293:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:295:0x05d6 A[LOOP:9: B:294:0x05d4->B:295:0x05d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:298:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:300:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:302:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:304:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:305:0x0601  */
    /* JADX WARN: Code duplicated, block: B:307:0x0609  */
    /* JADX WARN: Code duplicated, block: B:318:0x063f  */
    /* JADX WARN: Code duplicated, block: B:323:0x065d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0669  */
    /* JADX WARN: Code duplicated, block: B:332:0x067d  */
    /* JADX WARN: Code duplicated, block: B:383:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:385:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:387:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:394:0x07df  */
    /* JADX WARN: Code duplicated, block: B:407:0x082e  */
    /* JADX WARN: Code duplicated, block: B:409:0x083f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0843  */
    /* JADX WARN: Code duplicated, block: B:412:0x084e  */
    /* JADX WARN: Code duplicated, block: B:415:0x0858 A[LOOP:6: B:414:0x0856->B:415:0x0858, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x086a  */
    /* JADX WARN: Code duplicated, block: B:420:0x0884 A[LOOP:8: B:419:0x0882->B:420:0x0884, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:423:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:425:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:427:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:428:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:431:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:432:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:434:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:435:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:440:0x091a  */
    /* JADX WARN: Code duplicated, block: B:452:0x053f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:418:0x086a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public tp(String str, wja wjaVar, List<? extends iw.c<? extends iw.a>> list, List<iw.c<mz7>> list2, qa4.a aVar, tx2 tx2Var) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        ob4 ob4Var;
        int i2;
        Typeface typeface;
        CharSequence charSequence;
        int i3;
        qha qhaVar;
        ss7 ss7Var;
        ArrayList arrayList;
        int size;
        int i4;
        ww9 ww9Var;
        qa4 qa4Var;
        ww9 ww9Var2;
        ei4 ei4Var;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        ww9 ww9VarC;
        int i10;
        ArrayList arrayList2;
        ww9 ww9Var3;
        int i11;
        int i12;
        int size5;
        int i13;
        boolean z;
        List<iw.c<? extends iw.a>> list3;
        List<iw.c<mz7>> list4;
        List<iw.c<? extends iw.a>> list5;
        qha qhaVar2;
        int size6;
        int i14;
        int size7;
        int i15;
        Spannable spannable;
        int i16;
        long jB;
        int i17;
        long jB2;
        int i18;
        long j;
        long jB3;
        int size8;
        int i19;
        iw.c<? extends iw.a> cVar;
        iw.a aVar2;
        int i20;
        int i21;
        int i22;
        iw.c<? extends iw.a> cVar2;
        T t;
        int i23;
        int i24;
        ss7 ss7Var2;
        int i25;
        int i26;
        iw.c<? extends iw.a> cVar3;
        T t2;
        ww9 ww9Var4;
        int i27;
        long j2;
        long j3;
        long jB4;
        float fC;
        long jB5;
        float fC2;
        h18 h18Var;
        CharSequence charSequence2;
        h18 h18Var2;
        this.a = str;
        this.b = wjaVar;
        this.c = list;
        this.d = list2;
        this.e = aVar;
        this.f = tx2Var;
        float density = tx2Var.getDensity();
        ms msVar = new ms(1);
        ((TextPaint) msVar).density = density;
        msVar.b = fda.b;
        msVar.c = 3;
        msVar.d = el9.d;
        this.g = msVar;
        boolean zA = up.a(wjaVar);
        ww9 ww9Var5 = wjaVar.a;
        ss7 ss7Var3 = wjaVar.b;
        if (zA) {
            ur2 ur2Var = he3.a;
            ur2 ur2Var2 = he3.a;
            yz9<Boolean> yz9VarA = ur2Var2.a;
            if (yz9VarA == null) {
                if (d.d()) {
                    yz9VarA = ur2Var2.a();
                    ur2Var2.a = yz9VarA;
                } else {
                    yz9VarA = ie3.a;
                }
            }
            zBooleanValue = yz9VarA.getValue().booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.k = zBooleanValue;
        int i28 = ss7Var3.b;
        ad6 ad6Var = ww9Var5.k;
        if (i28 == 4) {
            i = 2;
        } else if (i28 == 5) {
            i = 3;
        } else if (i28 == 1) {
            i = 0;
        } else if (i28 == 2) {
            i = 1;
        } else {
            if (i28 != 3 && i28 != 0) {
                aa0.c("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((ad6Var == null || (locale = ad6Var.t.get(0).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.l = i;
        final sp spVar = new sp(this);
        jja jjaVar = ss7Var3.i;
        jjaVar = jjaVar == null ? jja.c : jjaVar;
        msVar.setFlags(jjaVar.b ? msVar.getFlags() | 128 : msVar.getFlags() & (-129));
        int i29 = jjaVar.a;
        if (i29 == 1) {
            msVar.setFlags(msVar.getFlags() | 64);
            msVar.setHinting(0);
        } else if (i29 == 2) {
            msVar.getFlags();
            msVar.setHinting(1);
        } else if (i29 == 3) {
            msVar.getFlags();
            msVar.setHinting(0);
        } else {
            msVar.getFlags();
        }
        int size9 = list.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size9) {
                obj = null;
                break;
            }
            obj = list.get(i30);
            if (((iw.c) obj).a instanceof ww9) {
                break;
            } else {
                i30++;
            }
        }
        boolean z2 = obj != null;
        long j4 = ww9Var5.b;
        ob4 ob4Var2 = ww9Var5.c;
        mb4 mb4Var = ww9Var5.d;
        String str2 = ww9Var5.g;
        ad6 ad6Var2 = ww9Var5.k;
        mha mhaVar = ww9Var5.a;
        oha ohaVar = ww9Var5.j;
        long j5 = ww9Var5.h;
        long jB6 = bka.b(j4);
        boolean z3 = z2;
        if (dka.a(jB6, 4294967296L)) {
            msVar.setTextSize(tx2Var.C1(j4));
        } else if (dka.a(jB6, 8589934592L)) {
            msVar.setTextSize(bka.c(j4) * msVar.getTextSize());
        }
        qa4 qa4Var2 = ww9Var5.f;
        if (qa4Var2 != null || mb4Var != null || ob4Var2 != null) {
            if (ob4Var2 == null) {
                ob4Var = ob4.y;
            }
            if (mb4Var != null) {
                ob4Var = ob4Var2;
                i2 = mb4Var.a;
            } else {
                ob4Var = ob4Var2;
                i2 = 0;
            }
            nb4 nb4Var = ww9Var5.e;
            int i31 = nb4Var != null ? nb4Var.a : 65535;
            tp tpVar = spVar.t;
            yza yzaVarA = tpVar.e.a(qa4Var2, ob4Var, i2, i31);
            if (yzaVarA instanceof yza.a) {
                Object obj2 = ((yza.a) yzaVarA).t;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                tza tzaVar = new tza(yzaVarA, tpVar.j);
                tpVar.j = tzaVar;
                Object obj3 = tzaVar.c;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            msVar.setTypeface(typeface);
        }
        if (ad6Var2 != null) {
            ad6 ad6Var3 = ad6.v;
            if (!ad6Var2.equals(w08.a.a())) {
                ArrayList arrayList3 = new ArrayList(ph1.n(ad6Var2, 10));
                Iterator<yc6> it = ad6Var2.t.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                msVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            msVar.setFontFeatureSettings(str2);
        }
        if (ohaVar != null && !ohaVar.equals(oha.c)) {
            msVar.setTextScaleX(msVar.getTextScaleX() * ohaVar.a);
            msVar.setTextSkewX(msVar.getTextSkewX() + ohaVar.b);
        }
        msVar.d(mhaVar.c());
        msVar.c(mhaVar.e(), 9205357640488583168L, mhaVar.a());
        msVar.f(ww9Var5.n);
        msVar.g(ww9Var5.m);
        msVar.e(ww9Var5.p);
        if (dka.a(bka.b(j5), 4294967296L) && bka.c(j5) != 0.0f) {
            float textScaleX = msVar.getTextScaleX() * msVar.getTextSize();
            float fC1 = tx2Var.C1(j5);
            if (textScaleX != 0.0f) {
                msVar.setLetterSpacing(fC1 / textScaleX);
            }
        } else if (dka.a(bka.b(j5), 8589934592L)) {
            msVar.setLetterSpacing(bka.c(j5));
        }
        long j6 = ww9Var5.l;
        gl0 gl0Var = ww9Var5.i;
        boolean z4 = z3 && dka.a(bka.b(j5), 4294967296L) && bka.c(j5) != 0.0f;
        long j7 = uh1.k;
        boolean z5 = (uh1.c(j6, j7) || uh1.c(j6, uh1.j)) ? false : true;
        boolean z6 = (gl0Var == null || Float.compare(gl0Var.a, 0.0f) == 0) ? false : true;
        ww9 ww9Var6 = (z4 || z5 || z6) ? new ww9(0L, 0L, null, null, null, null, null, z4 ? j5 : bka.c, z6 ? gl0Var : null, null, null, z5 ? j6 : j7, null, null, 63103) : null;
        List<iw.c<? extends iw.a>> list6 = this.c;
        if (ww9Var6 != null) {
            int size10 = list6.size() + 1;
            ArrayList arrayList4 = new ArrayList(size10);
            int i32 = 0;
            while (i32 < size10) {
                arrayList4.add(i32 == 0 ? new iw.c<>(0, this.a.length(), ww9Var6) : this.c.get(i32 - 1));
                i32++;
            }
            list6 = arrayList4;
        }
        String str3 = this.a;
        float textSize = this.g.getTextSize();
        wja wjaVar2 = this.b;
        List<iw.c<mz7>> list7 = this.d;
        tx2 tx2Var2 = this.f;
        boolean z7 = this.k;
        rp.a aVar3 = rp.a;
        if (z7 && d.d()) {
            b28 b28Var = wjaVar2.c;
            we3 we3Var = (b28Var == null || (h18Var2 = b28Var.b) == null) ? null : new we3(h18Var2.b);
            int i33 = (we3Var != null && we3Var.a == 2) ? 1 : 0;
            CharSequence charSequenceG = d.a().g(0, str3.length(), i33, str3);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!list6.isEmpty() || !list7.isEmpty() || !xj5.a(wjaVar2.b.d, qha.c) || (wjaVar2.b.c & 1095216660480L) != 0) {
            charSequence2 = charSequence;
            final Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            ww9 ww9Var7 = wjaVar2.a;
            ss7 ss7Var4 = wjaVar2.b;
            if (xj5.a(ww9Var7.m, fda.c)) {
                spannableString.setSpan(rp.a, 0, str3.length(), 33);
            }
            b28 b28Var2 = wjaVar2.c;
            if (((b28Var2 == null || (h18Var = b28Var2.b) == null) ? false : h18Var.a) && ss7Var4.f == null) {
                float fB = bx9.b(ss7Var4.c, textSize, tx2Var2);
                if (!Float.isNaN(fB)) {
                    spannableString.setSpan(new d86(fB), 0, spannableString.length(), 33);
                }
            } else {
                e86 e86Var = ss7Var4.f;
                e86Var = e86Var == null ? e86.d : e86Var;
                float fB2 = bx9.b(ss7Var4.c, textSize, tx2Var2);
                if (!Float.isNaN(fB2)) {
                    int length = (spannableString.length() == 0 || a3a.T(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i34 = e86Var.b;
                    i3 = 0;
                    spannableString.setSpan(new f86(fB2, length, (i34 & 1) > 0, (i34 & 16) > 0, e86Var.a, e86Var.c), 0, spannableString.length(), 33);
                }
                qhaVar = ss7Var4.d;
                if (qhaVar != null) {
                    i27 = i3;
                    j2 = qhaVar.a;
                    j3 = qhaVar.b;
                    if ((!bka.a(j2, cka.b(i27)) && bka.a(j3, cka.b(i27))) || (j2 & 1095216660480L) == r13 || (j3 & 1095216660480L) == 0) {
                        ss7Var = ss7Var4;
                    } else {
                        jB4 = bka.b(j2);
                        ss7Var = ss7Var4;
                        if (dka.a(jB4, 4294967296L)) {
                            fC = tx2Var2.C1(j2);
                        } else if (dka.a(jB4, 8589934592L)) {
                            fC = bka.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB5 = bka.b(j3);
                        if (dka.a(jB5, 4294967296L)) {
                            fC2 = tx2Var2.C1(j3);
                        } else if (dka.a(jB5, 8589934592L)) {
                            fC2 = bka.c(j3) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                } else {
                    ss7Var = ss7Var4;
                }
                arrayList = new ArrayList(list6.size());
                size = list6.size();
                for (i4 = 0; i4 < size; i4++) {
                    cVar3 = list6.get(i4);
                    t2 = cVar3.a;
                    if (t2 instanceof ww9) {
                        ww9Var4 = (ww9) t2;
                        if (ww9Var4.f == null || ww9Var4.d != null || ww9Var4.c != null || ((ww9) t2).e != null) {
                            arrayList.add(cVar3);
                        }
                    }
                }
                ww9Var = wjaVar2.a;
                qa4Var = ww9Var.f;
                if (qa4Var != null && ww9Var.d == null && ww9Var.c == null && ww9Var.e == null) {
                    ww9Var2 = null;
                } else {
                    ww9Var2 = new ww9(0L, 0L, ww9Var.c, ww9Var.d, ww9Var.e, qa4Var, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                ei4Var = new ei4() { // from class: ax9
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        Typeface typeface2;
                        ww9 ww9Var8 = (ww9) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        int iIntValue2 = ((Integer) obj6).intValue();
                        qa4 qa4Var3 = ww9Var8.f;
                        ob4 ob4Var3 = ww9Var8.c;
                        if (ob4Var3 == null) {
                            ob4Var3 = ob4.y;
                        }
                        mb4 mb4Var2 = ww9Var8.d;
                        int i35 = mb4Var2 != null ? mb4Var2.a : 0;
                        nb4 nb4Var2 = ww9Var8.e;
                        int i36 = nb4Var2 != null ? nb4Var2.a : 65535;
                        tp tpVar2 = spVar.t;
                        yza yzaVarA2 = tpVar2.e.a(qa4Var3, ob4Var3, i35, i36);
                        if (yzaVarA2 instanceof yza.a) {
                            Object obj7 = ((yza.a) yzaVarA2).t;
                            obj7.getClass();
                            typeface2 = (Typeface) obj7;
                        } else {
                            tza tzaVar2 = new tza(yzaVarA2, tpVar2.j);
                            tpVar2.j = tzaVar2;
                            Object obj8 = tzaVar2.c;
                            obj8.getClass();
                            typeface2 = (Typeface) obj8;
                        }
                        spannableString.setSpan(new zza(typeface2), iIntValue, iIntValue2, 33);
                        return g2b.a;
                    }
                };
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        iw.c cVar4 = (iw.c) arrayList.get(i6);
                        iArr[i6] = cVar4.b;
                        iArr[i6 + size2] = cVar4.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        px1.b("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            ww9Var3 = ww9Var2;
                        } else {
                            size4 = arrayList.size();
                            ww9VarC = ww9Var2;
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                iw.c cVar5 = (iw.c) arrayList.get(i10);
                                ww9 ww9Var8 = ww9Var2;
                                i11 = cVar5.b;
                                int i35 = size4;
                                i12 = cVar5.c;
                                if (i11 == i12 && lw.b(i7, i9, i11, i12)) {
                                    ww9 ww9Var9 = (ww9) cVar5.a;
                                    ww9VarC = ww9VarC != null ? ww9VarC.c(ww9Var9) : ww9Var9;
                                }
                                i10++;
                                arrayList = arrayList5;
                                ww9Var2 = ww9Var8;
                                size4 = i35;
                            }
                            arrayList2 = arrayList;
                            ww9Var3 = ww9Var2;
                            if (ww9VarC != null) {
                                ei4Var.invoke(ww9VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8++;
                        arrayList = arrayList2;
                        ww9Var2 = ww9Var3;
                    }
                } else if (!arrayList.isEmpty()) {
                    ww9 ww9Var10 = (ww9) ((iw.c) arrayList.get(0)).a;
                    ei4Var.invoke(ww9Var2 != null ? ww9Var2.c(ww9Var10) : ww9Var10, Integer.valueOf(((iw.c) arrayList.get(0)).b), Integer.valueOf(((iw.c) arrayList.get(0)).c));
                }
                size5 = list6.size();
                i13 = 0;
                z = false;
                while (i13 < size5) {
                    cVar2 = list6.get(i13);
                    t = cVar2.a;
                    if (t instanceof ww9) {
                        i25 = cVar2.b;
                        int i36 = cVar2.c;
                        if (i25 >= 0 || i25 >= spannableString.length() || i36 <= i25 || i36 > spannableString.length()) {
                            i23 = size5;
                            i24 = i13;
                            list6 = list6;
                            z = z;
                            ss7Var2 = ss7Var;
                            list7 = list7;
                        } else {
                            ww9 ww9Var11 = (ww9) t;
                            long j8 = ww9Var11.h;
                            gl0 gl0Var2 = ww9Var11.i;
                            mha mhaVar2 = ww9Var11.a;
                            if (gl0Var2 != null) {
                                spannableString.setSpan(new hl0(gl0Var2.a), i25, i36, 33);
                            }
                            i23 = size5;
                            i24 = i13;
                            bx9.c(spannableString, mhaVar2.c(), i25, i36);
                            fx0 fx0VarE = mhaVar2.e();
                            float fA = mhaVar2.a();
                            if (fx0VarE != null) {
                                if (fx0VarE instanceof aw9) {
                                    bx9.c(spannableString, ((aw9) fx0VarE).a, i25, i36);
                                } else {
                                    spannableString.setSpan(new dl9((cl9) fx0VarE, fA), i25, i36, 33);
                                }
                            }
                            fda fdaVar = ww9Var11.m;
                            if (fdaVar != null) {
                                int i37 = fdaVar.a;
                                gda gdaVar = new gda((i37 | 1) == i37, (i37 | 2) == i37);
                                i26 = 33;
                                spannableString.setSpan(gdaVar, i25, i36, 33);
                            } else {
                                i26 = 33;
                            }
                            int i38 = i26;
                            ss7Var2 = ss7Var;
                            bx9.d(spannableString, ww9Var11.b, tx2Var2, i25, i36);
                            String str4 = ww9Var11.g;
                            if (str4 != null) {
                                spannableString.setSpan(new wa4(str4), i25, i36, i38);
                            }
                            oha ohaVar2 = ww9Var11.j;
                            if (ohaVar2 != null) {
                                spannableString.setSpan(new ScaleXSpan(ohaVar2.a), i25, i36, i38);
                                spannableString.setSpan(new or9(ohaVar2.b), i25, i36, i38);
                            }
                            bx9.e(spannableString, ww9Var11.k, i25, i36);
                            long j9 = ww9Var11.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(u7d.l(j9)), i25, i36, i38);
                            }
                            el9 el9Var = ww9Var11.n;
                            if (el9Var != null) {
                                long j10 = el9Var.b;
                                int iL = u7d.l(el9Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = el9Var.c;
                                il9 il9Var = new il9(fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f, iL);
                                i38 = 33;
                                spannableString.setSpan(il9Var, i25, i36, 33);
                            }
                            e73 e73Var = ww9Var11.p;
                            if (e73Var != null) {
                                spannableString.setSpan(new f73(e73Var), i25, i36, i38);
                            }
                            z = (dka.a(bka.b(j8), 4294967296L) || dka.a(bka.b(j8), 8589934592L)) ? true : z;
                        }
                        z = z;
                    } else {
                        i23 = size5;
                        i24 = i13;
                        list6 = list6;
                        z = z;
                        ss7Var2 = ss7Var;
                        list7 = list7;
                        z = z;
                    }
                    i13 = i24 + 1;
                    list6 = list6;
                    list7 = list7;
                    ss7Var = ss7Var2;
                    size5 = i23;
                }
                list3 = list6;
                ss7 ss7Var5 = ss7Var;
                list4 = list7;
                if (z) {
                    size8 = list3.size();
                    i19 = 0;
                    while (i19 < size8) {
                        List<iw.c<? extends iw.a>> list8 = list3;
                        cVar = list8.get(i19);
                        aVar2 = (iw.a) cVar.a;
                        if (aVar2 instanceof ww9) {
                            i22 = cVar.b;
                            int i39 = cVar.c;
                            if (i22 >= 0 || i22 >= spannableString.length() || i39 <= i22 || i39 > spannableString.length()) {
                                i20 = size8;
                                i21 = i19;
                            } else {
                                long j11 = ((ww9) aVar2).h;
                                long jB7 = bka.b(j11);
                                i20 = size8;
                                i21 = i19;
                                Object n66Var = dka.a(jB7, 4294967296L) ? new n66(tx2Var2.C1(j11)) : dka.a(jB7, 8589934592L) ? new m66(bka.c(j11)) : null;
                                if (n66Var != null) {
                                    spannableString.setSpan(n66Var, i22, i39, 33);
                                }
                            }
                        } else {
                            i20 = size8;
                            i21 = i19;
                        }
                        i19 = i21 + 1;
                        size8 = i20;
                        list3 = list8;
                    }
                }
                list5 = list3;
                qhaVar2 = ss7Var5.d;
                if (qhaVar2 != null) {
                    j = qhaVar2.a;
                    jB3 = bka.b(j);
                    if (dka.a(jB3, 4294967296L)) {
                        tx2Var2.C1(j);
                    } else if (dka.a(jB3, 8589934592L)) {
                        bka.c(j);
                    }
                }
                size6 = list5.size();
                for (i14 = 0; i14 < size6; i14++) {
                    T t3 = list5.get(i14).a;
                }
                size7 = list4.size();
                i15 = 0;
                spannable = spannableString;
                while (i15 < size7) {
                    List<iw.c<mz7>> list9 = list4;
                    iw.c<mz7> cVar6 = list9.get(i15);
                    mz7 mz7Var = cVar6.a;
                    int i40 = cVar6.b;
                    int i41 = cVar6.c;
                    for (Object obj4 : spannable.getSpans(i40, i41, ve3.class)) {
                        spannable.removeSpan((ve3) obj4);
                    }
                    long j12 = mz7Var.a;
                    long j13 = mz7Var.b;
                    float fC3 = bka.c(j12);
                    int i42 = size7;
                    int i43 = i15;
                    jB = bka.b(mz7Var.a);
                    if (dka.a(jB, 4294967296L)) {
                        i17 = 0;
                    } else if (dka.a(jB, 8589934592L)) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                    tx2 tx2Var3 = tx2Var2;
                    float fC4 = bka.c(j13);
                    jB2 = bka.b(j13);
                    if (dka.a(jB2, 4294967296L)) {
                        i18 = 0;
                    } else if (dka.a(jB2, 8589934592L)) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    Spannable spannable2 = spannable;
                    uz7 uz7Var = new uz7(fC3, i17, fC4, i18, tx2Var3, 3);
                    tx2Var2 = tx2Var3;
                    spannable2.setSpan(uz7Var, i40, i41, 33);
                    spannable = spannable2;
                    list4 = list9;
                    i15 = i43 + 1;
                    size7 = i42;
                }
                charSequence2 = spannable;
            }
            i3 = 0;
            qhaVar = ss7Var4.d;
            if (qhaVar != null) {
                i27 = i3;
                j2 = qhaVar.a;
                j3 = qhaVar.b;
                if (!bka.a(j2, cka.b(i27))) {
                    jB4 = bka.b(j2);
                    ss7Var = ss7Var4;
                    if (dka.a(jB4, 4294967296L)) {
                        fC = tx2Var2.C1(j2);
                    } else if (dka.a(jB4, 8589934592L)) {
                        fC = bka.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB5 = bka.b(j3);
                    if (dka.a(jB5, 4294967296L)) {
                        fC2 = tx2Var2.C1(j3);
                    } else if (dka.a(jB5, 8589934592L)) {
                        fC2 = bka.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB4 = bka.b(j2);
                    ss7Var = ss7Var4;
                    if (dka.a(jB4, 4294967296L)) {
                        fC = tx2Var2.C1(j2);
                    } else if (dka.a(jB4, 8589934592L)) {
                        fC = bka.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB5 = bka.b(j3);
                    if (dka.a(jB5, 4294967296L)) {
                        fC2 = tx2Var2.C1(j3);
                    } else if (dka.a(jB5, 8589934592L)) {
                        fC2 = bka.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            } else {
                ss7Var = ss7Var4;
            }
            arrayList = new ArrayList(list6.size());
            size = list6.size();
            while (i4 < size) {
                cVar3 = list6.get(i4);
                t2 = cVar3.a;
                if (t2 instanceof ww9) {
                    ww9Var4 = (ww9) t2;
                    if (ww9Var4.f == null) {
                        arrayList.add(cVar3);
                    } else {
                        arrayList.add(cVar3);
                    }
                }
            }
            ww9Var = wjaVar2.a;
            qa4Var = ww9Var.f;
            if (qa4Var != null) {
                ww9Var2 = new ww9(0L, 0L, ww9Var.c, ww9Var.d, ww9Var.e, qa4Var, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                ww9Var2 = new ww9(0L, 0L, ww9Var.c, ww9Var.d, ww9Var.e, qa4Var, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            ei4Var = new ei4() { // from class: ax9
                @Override // defpackage.ei4
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    Typeface typeface2;
                    ww9 ww9Var12 = (ww9) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    int iIntValue2 = ((Integer) obj7).intValue();
                    qa4 qa4Var3 = ww9Var12.f;
                    ob4 ob4Var3 = ww9Var12.c;
                    if (ob4Var3 == null) {
                        ob4Var3 = ob4.y;
                    }
                    mb4 mb4Var2 = ww9Var12.d;
                    int i310 = mb4Var2 != null ? mb4Var2.a : 0;
                    nb4 nb4Var2 = ww9Var12.e;
                    int i311 = nb4Var2 != null ? nb4Var2.a : 65535;
                    tp tpVar2 = spVar.t;
                    yza yzaVarA2 = tpVar2.e.a(qa4Var3, ob4Var3, i310, i311);
                    if (yzaVarA2 instanceof yza.a) {
                        Object obj8 = ((yza.a) yzaVarA2).t;
                        obj8.getClass();
                        typeface2 = (Typeface) obj8;
                    } else {
                        tza tzaVar2 = new tza(yzaVarA2, tpVar2.j);
                        tpVar2.j = tzaVar2;
                        Object obj9 = tzaVar2.c;
                        obj9.getClass();
                        typeface2 = (Typeface) obj9;
                    }
                    spannableString.setSpan(new zza(typeface2), iIntValue, iIntValue2, 33);
                    return g2b.a;
                }
            };
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    iw.c cVar7 = (iw.c) arrayList.get(i6);
                    iArr[i6] = cVar7.b;
                    iArr[i6 + size2] = cVar7.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    px1.b("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        ww9Var3 = ww9Var2;
                    } else {
                        size4 = arrayList.size();
                        ww9VarC = ww9Var2;
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            iw.c cVar8 = (iw.c) arrayList.get(i10);
                            ww9 ww9Var12 = ww9Var2;
                            i11 = cVar8.b;
                            int i310 = size4;
                            i12 = cVar8.c;
                            if (i11 == i12) {
                            }
                            i10++;
                            arrayList = arrayList6;
                            ww9Var2 = ww9Var12;
                            size4 = i310;
                        }
                        arrayList2 = arrayList;
                        ww9Var3 = ww9Var2;
                        if (ww9VarC != null) {
                            ei4Var.invoke(ww9VarC, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8++;
                    arrayList = arrayList2;
                    ww9Var2 = ww9Var3;
                }
            } else if (!arrayList.isEmpty()) {
                ww9 ww9Var13 = (ww9) ((iw.c) arrayList.get(0)).a;
                ei4Var.invoke(ww9Var2 != null ? ww9Var2.c(ww9Var13) : ww9Var13, Integer.valueOf(((iw.c) arrayList.get(0)).b), Integer.valueOf(((iw.c) arrayList.get(0)).c));
            }
            size5 = list6.size();
            i13 = 0;
            z = false;
            while (i13 < size5) {
                cVar2 = list6.get(i13);
                t = cVar2.a;
                if (t instanceof ww9) {
                    i25 = cVar2.b;
                    int i311 = cVar2.c;
                    if (i25 >= 0) {
                        i23 = size5;
                        i24 = i13;
                        list6 = list6;
                        z = z;
                        ss7Var2 = ss7Var;
                        list7 = list7;
                        z = z;
                    } else {
                        i23 = size5;
                        i24 = i13;
                        list6 = list6;
                        z = z;
                        ss7Var2 = ss7Var;
                        list7 = list7;
                        z = z;
                    }
                } else {
                    i23 = size5;
                    i24 = i13;
                    list6 = list6;
                    z = z;
                    ss7Var2 = ss7Var;
                    list7 = list7;
                    z = z;
                }
                i13 = i24 + 1;
                list6 = list6;
                list7 = list7;
                ss7Var = ss7Var2;
                size5 = i23;
            }
            list3 = list6;
            ss7 ss7Var6 = ss7Var;
            list4 = list7;
            if (z) {
                size8 = list3.size();
                i19 = 0;
                while (i19 < size8) {
                    List<iw.c<? extends iw.a>> list10 = list3;
                    cVar = list10.get(i19);
                    aVar2 = (iw.a) cVar.a;
                    if (aVar2 instanceof ww9) {
                        i22 = cVar.b;
                        int i312 = cVar.c;
                        if (i22 >= 0) {
                            i20 = size8;
                            i21 = i19;
                        } else {
                            i20 = size8;
                            i21 = i19;
                        }
                    } else {
                        i20 = size8;
                        i21 = i19;
                    }
                    i19 = i21 + 1;
                    size8 = i20;
                    list3 = list10;
                }
            }
            list5 = list3;
            qhaVar2 = ss7Var6.d;
            if (qhaVar2 != null) {
                j = qhaVar2.a;
                jB3 = bka.b(j);
                if (dka.a(jB3, 4294967296L)) {
                    tx2Var2.C1(j);
                } else if (dka.a(jB3, 8589934592L)) {
                    bka.c(j);
                }
            }
            size6 = list5.size();
            while (i14 < size6) {
                T t4 = list5.get(i14).a;
            }
            size7 = list4.size();
            i15 = 0;
            spannable = spannableString;
            while (i15 < size7) {
                List<iw.c<mz7>> list11 = list4;
                iw.c<mz7> cVar9 = list11.get(i15);
                mz7 mz7Var2 = cVar9.a;
                int i44 = cVar9.b;
                int i45 = cVar9.c;
                while (i16 < r8) {
                    spannable.removeSpan((ve3) obj4);
                }
                long j14 = mz7Var2.a;
                long j15 = mz7Var2.b;
                float fC5 = bka.c(j14);
                int i46 = size7;
                int i47 = i15;
                jB = bka.b(mz7Var2.a);
                if (dka.a(jB, 4294967296L)) {
                    i17 = 0;
                } else if (dka.a(jB, 8589934592L)) {
                    i17 = 1;
                } else {
                    i17 = 2;
                }
                tx2 tx2Var4 = tx2Var2;
                float fC6 = bka.c(j15);
                jB2 = bka.b(j15);
                if (dka.a(jB2, 4294967296L)) {
                    i18 = 0;
                } else if (dka.a(jB2, 8589934592L)) {
                    i18 = 1;
                } else {
                    i18 = 2;
                }
                Spannable spannable3 = spannable;
                uz7 uz7Var2 = new uz7(fC5, i17, fC6, i18, tx2Var4, 3);
                tx2Var2 = tx2Var4;
                spannable3.setSpan(uz7Var2, i44, i45, 33);
                spannable = spannable3;
                list4 = list11;
                i15 = i47 + 1;
                size7 = i46;
            }
            charSequence2 = spannable;
        }
        charSequence2 = charSequence;
        this.h = charSequence2;
        this.i = new cr5(charSequence2, this.g, this.l);
    }

    @Override // defpackage.ps7
    public final boolean a() {
        tza tzaVar = this.j;
        if (tzaVar != null ? tzaVar.a() : false) {
            return true;
        }
        if (!this.k && up.a(this.b)) {
            ur2 ur2Var = he3.a;
            ur2 ur2Var2 = he3.a;
            yz9<Boolean> yz9VarA = ur2Var2.a;
            if (yz9VarA == null) {
                if (d.d()) {
                    yz9VarA = ur2Var2.a();
                    ur2Var2.a = yz9VarA;
                } else {
                    yz9VarA = ie3.a;
                }
            }
            if (yz9VarA.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ps7
    public final float b() {
        cr5 cr5Var = this.i;
        float f = cr5Var.e;
        TextPaint textPaint = cr5Var.b;
        if (!Float.isNaN(f)) {
            return cr5Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = cr5Var.a;
        lineInstance.setText(new qa1(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, er5.a);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new fg5(i, next, 1));
            } else {
                fg5 fg5Var = (fg5) priorityQueue.peek();
                if (fg5Var != null && fg5Var.u - fg5Var.t < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new fg5(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                vl.b();
                return 0.0f;
            }
            fg5 fg5Var2 = (fg5) it.next();
            desiredWidth = Layout.getDesiredWidth(cr5Var.b(), fg5Var2.t, fg5Var2.u, textPaint);
            while (it.hasNext()) {
                fg5 fg5Var3 = (fg5) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(cr5Var.b(), fg5Var3.t, fg5Var3.u, textPaint));
            }
        }
        cr5Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.ps7
    public final float c() {
        return this.i.c();
    }
}
