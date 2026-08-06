package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.intercom.twig.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qya {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final tya f;
    public final String[] g;
    public final String h;
    public final String i;
    public final qya j;
    public final HashMap<String, Integer> k;
    public final HashMap<String, Integer> l;
    public ArrayList m;

    public qya(String str, String str2, long j, long j2, tya tyaVar, String[] strArr, String str3, String str4, qya qyaVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = tyaVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = qyaVar;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public static qya a(String str) {
        return new qya(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, BuildConfig.FLAVOR, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            ec2.a aVar = new ec2.a();
            aVar.b(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((ec2.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final qya b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (qya) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((qya) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!BuildConfig.FLAVOR.equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0208  */
    /* JADX WARN: Code duplicated, block: B:146:0x0216  */
    /* JADX WARN: Code duplicated, block: B:148:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x021c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0222  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x0267  */
    /* JADX WARN: Code duplicated, block: B:168:0x027f  */
    /* JADX WARN: Code duplicated, block: B:169:0x028e  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator<Map.Entry<String, Integer>> it;
        int i;
        qya qyaVar;
        int i2;
        tya tyaVarA;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = BuildConfig.FLAVOR.equals(str2) ? str : str2;
            Iterator<Map.Entry<String, Integer>> it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                HashMap<String, Integer> map4 = this.k;
                int iIntValue = map4.containsKey(key) ? map4.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    ec2.a aVar = (ec2.a) treeMap.get(key);
                    aVar.getClass();
                    sya syaVar = (sya) map2.get(str3);
                    syaVar.getClass();
                    int i10 = syaVar.j;
                    tya tyaVarA2 = mq2.a(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.b(spannableStringBuilder);
                    }
                    if (tyaVarA2 != null) {
                        int i11 = tyaVarA2.h;
                        int i12 = 1;
                        if (((i11 == -1 && tyaVarA2.i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (tyaVarA2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = tyaVarA2.h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (tyaVarA2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (tyaVarA2.i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (tyaVarA2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (tyaVarA2.f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (tyaVarA2.g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (tyaVarA2.c) {
                            if (!tyaVarA2.c) {
                                aa0.c("Font color has not been defined.");
                                return;
                            }
                            ym7.b(spannableStringBuilder, new ForegroundColorSpan(tyaVarA2.b), iIntValue, iIntValue2);
                        }
                        if (tyaVarA2.e) {
                            if (!tyaVarA2.e) {
                                aa0.c("Background color has not been defined.");
                                return;
                            }
                            ym7.b(spannableStringBuilder, new BackgroundColorSpan(tyaVarA2.d), iIntValue, iIntValue2);
                        }
                        if (tyaVarA2.a != null) {
                            ym7.b(spannableStringBuilder, new TypefaceSpan(tyaVarA2.a), iIntValue, iIntValue2);
                        }
                        nda ndaVar = tyaVarA2.r;
                        if (ndaVar != null) {
                            int i14 = ndaVar.a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = ndaVar.b;
                            }
                            int i15 = ndaVar.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            ym7.b(spannableStringBuilder, new oda(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = tyaVarA2.m;
                        if (i16 == 2) {
                            qya qyaVar2 = this.j;
                            while (true) {
                                if (qyaVar2 == null) {
                                    qyaVar2 = null;
                                    break;
                                }
                                tya tyaVarA3 = mq2.a(qyaVar2.f, qyaVar2.g, map3);
                                if (tyaVarA3 != null && tyaVarA3.m == 1) {
                                    break;
                                } else {
                                    qyaVar2 = qyaVar2.j;
                                }
                            }
                            if (qyaVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(qyaVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        qyaVar = null;
                                        break;
                                    }
                                    qya qyaVar3 = (qya) arrayDeque.pop();
                                    tya tyaVarA4 = mq2.a(qyaVar3.f, qyaVar3.g, map3);
                                    if (tyaVarA4 != null && tyaVarA4.m == 3) {
                                        qyaVar = qyaVar3;
                                        break;
                                    }
                                    for (int iC = qyaVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(qyaVar3.b(iC));
                                    }
                                }
                                if (qyaVar != null) {
                                    if (qyaVar.c() == 1) {
                                        i2 = 0;
                                        if (qyaVar.b(0).b != null) {
                                            String str4 = qyaVar.b(0).b;
                                            String str5 = n6b.a;
                                            tya tyaVarA5 = mq2.a(qyaVar.f, qyaVar.g, map3);
                                            int i17 = tyaVarA5 != null ? tyaVarA5.n : -1;
                                            if (i17 == -1 && (tyaVarA = mq2.a(qyaVar2.f, qyaVar2.g, map3)) != null) {
                                                i17 = tyaVarA.n;
                                            }
                                            spannableStringBuilder.setSpan(new ty8(str4, i17), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    md6.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (tyaVarA2.q == 1) {
                                ym7.b(spannableStringBuilder, new n15(), iIntValue, iIntValue2);
                            }
                            i3 = tyaVarA2.j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                ym7.b(spannableStringBuilder, new AbsoluteSizeSpan((int) tyaVarA2.k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                ym7.b(spannableStringBuilder, new RelativeSizeSpan(tyaVarA2.k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = tyaVarA2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator<Map.Entry<String, Integer>> it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = tyaVarA2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    aVar.q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = tyaVarA2.o;
                                if (alignment != null) {
                                    aVar.c = alignment;
                                }
                                alignment2 = tyaVarA2.p;
                                if (alignment2 != null) {
                                    aVar.d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new nx2(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (tyaVarA2.q == 1) {
                            ym7.b(spannableStringBuilder, new n15(), iIntValue, iIntValue2);
                        }
                        i3 = tyaVarA2.j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            ym7.b(spannableStringBuilder, new AbsoluteSizeSpan((int) tyaVarA2.k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            ym7.b(spannableStringBuilder, new RelativeSizeSpan(tyaVarA2.k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = tyaVarA2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator<Map.Entry<String, Integer>> it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = tyaVarA2.s;
                            if (f3 != Float.MAX_VALUE) {
                                aVar.q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = tyaVarA2.o;
                            if (alignment != null) {
                                aVar.c = alignment;
                            }
                            alignment2 = tyaVarA2.p;
                            if (alignment2 != null) {
                                aVar.d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < c()) {
                b(i20).h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.k;
        map.clear();
        HashMap<String, Integer> map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = BuildConfig.FLAVOR.equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((ec2.a) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((ec2.a) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
