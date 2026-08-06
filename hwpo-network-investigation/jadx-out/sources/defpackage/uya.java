package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uya implements r4a {
    public final qya t;
    public final long[] u;
    public final Map<String, tya> v;
    public final HashMap w;
    public final HashMap x;

    public uya(qya qyaVar, HashMap map, HashMap map2, HashMap map3) {
        this.t = qyaVar;
        this.w = map2;
        this.x = map3;
        this.v = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        qyaVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.u = jArr;
    }

    @Override // defpackage.r4a
    public final int a(long j) {
        long[] jArr = this.u;
        int iB = n6b.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.r4a
    public final long e(int i) {
        return this.u[i];
    }

    @Override // defpackage.r4a
    public final List<ec2> f(long j) {
        ArrayList arrayList = new ArrayList();
        qya qyaVar = this.t;
        qyaVar.g(j, qyaVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        qyaVar.i(j, false, qyaVar.h, treeMap);
        String str = qyaVar.h;
        Map<String, tya> map = this.v;
        HashMap map2 = this.w;
        qyaVar.h(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str2 = (String) this.x.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                sya syaVar = (sya) map2.get(pair.first);
                syaVar.getClass();
                ec2.a aVar = new ec2.a();
                aVar.b = bitmapDecodeByteArray;
                aVar.a = null;
                aVar.h = syaVar.b;
                aVar.i = 0;
                aVar.e = syaVar.c;
                aVar.f = 0;
                aVar.g = syaVar.e;
                aVar.l = syaVar.f;
                aVar.m = syaVar.g;
                aVar.p = syaVar.j;
                arrayList2.add(aVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            sya syaVar2 = (sya) map2.get(entry.getKey());
            syaVar2.getClass();
            ec2.a aVar2 = (ec2.a) entry.getValue();
            CharSequence charSequence = aVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (nx2 nx2Var : (nx2[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nx2.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(nx2Var), spannableStringBuilder.getSpanEnd(nx2Var), (CharSequence) BuildConfig.FLAVOR);
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = syaVar2.c;
            int i10 = syaVar2.d;
            aVar2.e = f;
            aVar2.f = i10;
            aVar2.g = syaVar2.e;
            aVar2.h = syaVar2.b;
            aVar2.l = syaVar2.f;
            float f2 = syaVar2.i;
            int i11 = syaVar2.h;
            aVar2.k = f2;
            aVar2.j = i11;
            aVar2.p = syaVar2.j;
            arrayList2.add(aVar2.a());
        }
        return arrayList2;
    }

    @Override // defpackage.r4a
    public final int g() {
        return this.u.length;
    }
}
