package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qb8 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(dz2[] dz2VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (dz2 dz2Var : dz2VarArr) {
            length += ((((dz2Var.g * 2) + 7) & (-8)) / 8) + (dz2Var.e * 2) + b(dz2Var.a, dz2Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dz2Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, rb8.c)) {
            int length2 = dz2VarArr.length;
            while (i < length2) {
                dz2 dz2Var2 = dz2VarArr[i];
                k(byteArrayOutputStream, dz2Var2, b(dz2Var2.a, dz2Var2.b, bArr));
                j(byteArrayOutputStream, dz2Var2);
                i++;
            }
        } else {
            for (dz2 dz2Var3 : dz2VarArr) {
                k(byteArrayOutputStream, dz2Var3, b(dz2Var3.a, dz2Var3.b, bArr));
            }
            int length3 = dz2VarArr.length;
            while (i < length3) {
                j(byteArrayOutputStream, dz2VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = rb8.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = rb8.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return av.a(bl2.a(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iD = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iD += (int) bg3.d(byteArrayInputStream, 2);
            iArr[i2] = iD;
        }
        return iArr;
    }

    public static dz2[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, dz2[] dz2VarArr) throws IOException {
        byte[] bArr3 = rb8.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, rb8.g)) {
                aa0.c("Unsupported meta version");
                return null;
            }
            int iD = (int) bg3.d(fileInputStream, 2);
            byte[] bArrC = bg3.c(fileInputStream, (int) bg3.d(fileInputStream, 4), (int) bg3.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                aa0.c("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                dz2[] dz2VarArrF = f(byteArrayInputStream, bArr2, iD, dz2VarArr);
                byteArrayInputStream.close();
                return dz2VarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(rb8.a, bArr2)) {
            aa0.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            aa0.c("Unsupported meta version");
            return null;
        }
        int iD2 = (int) bg3.d(fileInputStream, 1);
        byte[] bArrC2 = bg3.c(fileInputStream, (int) bg3.d(fileInputStream, 4), (int) bg3.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            aa0.c("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            dz2[] dz2VarArrE = e(byteArrayInputStream2, iD2, dz2VarArr);
            byteArrayInputStream2.close();
            return dz2VarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static dz2[] e(ByteArrayInputStream byteArrayInputStream, int i, dz2[] dz2VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new dz2[0];
        }
        if (i != dz2VarArr.length) {
            aa0.c("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iD = (int) bg3.d(byteArrayInputStream, 2);
            iArr[i2] = (int) bg3.d(byteArrayInputStream, 2);
            strArr[i2] = new String(bg3.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            dz2 dz2Var = dz2VarArr[i3];
            if (!dz2Var.b.equals(strArr[i3])) {
                aa0.c("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            dz2Var.e = i4;
            dz2Var.h = c(byteArrayInputStream, i4);
        }
        return dz2VarArr;
    }

    public static dz2[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, dz2[] dz2VarArr) throws IOException {
        dz2 dz2Var;
        if (byteArrayInputStream.available() == 0) {
            return new dz2[0];
        }
        if (i != dz2VarArr.length) {
            aa0.c("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            bg3.d(byteArrayInputStream, 2);
            String str = new String(bg3.b(byteArrayInputStream, (int) bg3.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = bg3.d(byteArrayInputStream, 4);
            int iD = (int) bg3.d(byteArrayInputStream, 2);
            if (dz2VarArr.length <= 0) {
                dz2Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= dz2VarArr.length) {
                    dz2Var = null;
                    break;
                }
                if (dz2VarArr[i3].b.equals(strSubstring)) {
                    dz2Var = dz2VarArr[i3];
                    break;
                }
                i3++;
            }
            if (dz2Var == null) {
                aa0.c("Missing profile key: ".concat(str));
                return null;
            }
            dz2Var.d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, rb8.e)) {
                dz2Var.e = iD;
                dz2Var.h = iArrC;
            }
        }
        return dz2VarArr;
    }

    public static dz2[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, rb8.b)) {
            aa0.c("Unsupported version");
            return null;
        }
        int iD = (int) bg3.d(fileInputStream, 1);
        byte[] bArrC = bg3.c(fileInputStream, (int) bg3.d(fileInputStream, 4), (int) bg3.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            aa0.c("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            dz2[] dz2VarArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return dz2VarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static dz2[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new dz2[0];
        }
        dz2[] dz2VarArr = new dz2[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iD = (int) bg3.d(byteArrayInputStream, 2);
            int iD2 = (int) bg3.d(byteArrayInputStream, 2);
            dz2VarArr[i3] = new dz2(str, new String(bg3.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), bg3.d(byteArrayInputStream, 4), iD2, (int) bg3.d(byteArrayInputStream, 4), (int) bg3.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            dz2 dz2Var = dz2VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = dz2Var.f;
            int i6 = dz2Var.g;
            TreeMap<Integer, Integer> treeMap = dz2Var.i;
            int i7 = iAvailable - i5;
            int iD3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iD3 += (int) bg3.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) bg3.d(byteArrayInputStream, 2);
                while (iD4 > 0) {
                    bg3.d(byteArrayInputStream, 2);
                    int iD5 = (int) bg3.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            bg3.d(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iD6 = (int) bg3.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                bg3.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iD4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                aa0.c("Read too much data during profile line parse");
                return null;
            }
            dz2Var.h = c(byteArrayInputStream, dz2Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(bg3.b(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return dz2VarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, dz2[] dz2VarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = rb8.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = rb8.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(dz2VarArr, bArr3);
                bg3.e(byteArrayOutputStream, dz2VarArr.length, 1);
                bg3.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = bg3.a(bArrA);
                bg3.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = rb8.d;
            if (Arrays.equals(bArr, bArr4)) {
                bg3.e(byteArrayOutputStream, dz2VarArr.length, 1);
                for (dz2 dz2Var : dz2VarArr) {
                    int size = dz2Var.i.size() * 4;
                    String strB = b(dz2Var.a, dz2Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    bg3.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    bg3.f(byteArrayOutputStream, dz2Var.h.length);
                    bg3.e(byteArrayOutputStream, size, 4);
                    bg3.e(byteArrayOutputStream, dz2Var.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = dz2Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        bg3.f(byteArrayOutputStream, it.next().intValue());
                        bg3.f(byteArrayOutputStream, 0);
                    }
                    for (int i2 : dz2Var.h) {
                        bg3.f(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = rb8.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(dz2VarArr, bArr5);
                bg3.e(byteArrayOutputStream, dz2VarArr.length, 1);
                bg3.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = bg3.a(bArrA3);
                bg3.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = rb8.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            bg3.f(byteArrayOutputStream, dz2VarArr.length);
            for (dz2 dz2Var2 : dz2VarArr) {
                String str = dz2Var2.a;
                TreeMap<Integer, Integer> treeMap = dz2Var2.i;
                String strB2 = b(str, dz2Var2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                bg3.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                bg3.f(byteArrayOutputStream, treeMap.size());
                bg3.f(byteArrayOutputStream, dz2Var2.h.length);
                bg3.e(byteArrayOutputStream, dz2Var2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    bg3.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : dz2Var2.h) {
                    bg3.f(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            bg3.f(byteArrayOutputStream2, dz2VarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (dz2 dz2Var3 : dz2VarArr) {
                bg3.e(byteArrayOutputStream2, dz2Var3.c, 4);
                bg3.e(byteArrayOutputStream2, dz2Var3.d, 4);
                bg3.e(byteArrayOutputStream2, dz2Var3.g, 4);
                String strB3 = b(dz2Var3.a, dz2Var3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                bg3.f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            yqb yqbVar = new yqb(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(yqbVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < dz2VarArr.length) {
                try {
                    dz2 dz2Var4 = dz2VarArr[i6];
                    bg3.f(byteArrayOutputStream3, i6);
                    bg3.f(byteArrayOutputStream3, dz2Var4.e);
                    i7 = i7 + 4 + (dz2Var4.e * i4);
                    int[] iArr = dz2Var4.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        bg3.f(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i4 = i4;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i10 = i4;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            yqb yqbVar2 = new yqb(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(yqbVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dz2VarArr.length) {
                try {
                    dz2 dz2Var5 = dz2VarArr[i11];
                    Iterator<Map.Entry<Integer, Integer>> it3 = dz2Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream5, iIntValue, dz2Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream6, dz2Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            bg3.f(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            bg3.e(byteArrayOutputStream4, length4, 4);
                            bg3.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            yqb yqbVar3 = new yqb(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(yqbVar3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            bg3.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                yqb yqbVar4 = (yqb) arrayList2.get(i14);
                int i15 = yqbVar4.a;
                byte[] bArr7 = yqbVar4.b;
                int i16 = i10;
                if (i15 == 1) {
                    j = 0;
                } else if (i15 == i16) {
                    j = 1;
                } else if (i15 == 3) {
                    j = 2;
                } else if (i15 == 4) {
                    j = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                bg3.e(byteArrayOutputStream, j, 4);
                bg3.e(byteArrayOutputStream, size2, 4);
                if (yqbVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = bg3.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    bg3.e(byteArrayOutputStream, bArrA5.length, 4);
                    bg3.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    bg3.e(byteArrayOutputStream, bArr7.length, 4);
                    bg3.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
                i10 = i16;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, dz2 dz2Var) throws IOException {
        m(byteArrayOutputStream, dz2Var);
        int i = dz2Var.g;
        int[] iArr = dz2Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            bg3.f(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : dz2Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, dz2 dz2Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        bg3.f(byteArrayOutputStream, str.getBytes(charset).length);
        bg3.f(byteArrayOutputStream, dz2Var.e);
        bg3.e(byteArrayOutputStream, dz2Var.f, 4);
        bg3.e(byteArrayOutputStream, dz2Var.c, 4);
        bg3.e(byteArrayOutputStream, dz2Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i, dz2 dz2Var) throws IOException {
        int i2 = dz2Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : dz2Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, dz2 dz2Var) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : dz2Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                bg3.f(byteArrayOutputStream, iIntValue - i);
                bg3.f(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
