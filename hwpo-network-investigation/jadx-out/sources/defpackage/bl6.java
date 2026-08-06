package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bl6 implements su6.a {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public bl6(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                xl7.g(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                xl7.g(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                xl7.g(z);
                break;
            case "auxiliary.tracks.map":
                xl7.g(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        xl7.q("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bl6.class == obj.getClass()) {
            bl6 bl6Var = (bl6) obj;
            if (this.a.equals(bl6Var.a) && Arrays.equals(this.b, bl6Var.b) && this.c == bl6Var.c && this.d == bl6Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ru3.c(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f A[EDGE_INSN: B:73:0x016f->B:75:0x0175 BREAK  A[LOOP:0: B:33:0x00c6->B:74:0x0171]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0171 A[LOOP:0: B:33:0x00c6->B:74:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c0, please report this as an issue */
    public final String toString() {
        String string;
        ek0.b bVar;
        ek0 ek0VarD;
        ek0.a aVar;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        ek0.a aVar2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                byte[] bArr2 = this.b;
                String str = n6b.a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                byte[] bArr3 = this.b;
                xl7.c(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(ek5.j1(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i6 == 67) {
                byte[] bArr4 = this.b;
                xl7.c(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
                string = String.valueOf(ek5.j1(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i6 == 75) {
                string = String.valueOf(this.b[0] & MessagePack.Code.EXT_TIMESTAMP);
            } else if (i6 != 78) {
                byte[] bArr5 = this.b;
                String str2 = n6b.a;
                bVar = ek0.b;
                ek0VarD = bVar.e;
                if (ek0VarD == null) {
                    aVar = bVar.c;
                    cArr = aVar.b;
                    for (char c5 : cArr) {
                        if (h40.b(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            xl7.q("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (h40.b(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            aVar2 = new ek0.a(av.a(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                            if (aVar.h) {
                                aVar = aVar2;
                                break;
                            }
                            bArr = aVar2.g;
                            if (aVar2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            aa0.c(p2a.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                aVar = new ek0.a(av.a(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, bArrCopyOf, true);
                                break;
                            }
                            aVar = aVar2;
                            break;
                        }
                    }
                    if (aVar == bVar.c) {
                        ek0VarD = bVar;
                    } else {
                        ek0VarD = bVar.d(aVar, bVar.d);
                    }
                    bVar.e = ek0VarD;
                }
                string = ek0VarD.a(bArr5);
            } else {
                string = String.valueOf(new pt7(this.b).F());
            }
        } else if (this.a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbA = bl2.a("track types = ");
            new pl5(String.valueOf(',')).a(sbA, arrayListD.iterator());
            string = sbA.toString();
        } else {
            byte[] bArr6 = this.b;
            String str3 = n6b.a;
            bVar = ek0.b;
            ek0VarD = bVar.e;
            if (ek0VarD == null) {
                aVar = bVar.c;
                cArr = aVar.b;
                while (i < r6) {
                    if (h40.b(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        xl7.q("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (h40.b(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        aVar2 = new ek0.a(av.a(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                        if (aVar.h) {
                            aVar = aVar2;
                            break;
                        }
                        bArr = aVar2.g;
                        if (aVar2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        aa0.c(p2a.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            aVar = new ek0.a(av.a(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, bArrCopyOf, true);
                            break;
                        }
                        aVar = aVar2;
                        break;
                    }
                }
                if (aVar == bVar.c) {
                    ek0VarD = bVar;
                } else {
                    ek0VarD = bVar.d(aVar, bVar.d);
                }
                bVar.e = ek0VarD;
            }
            string = ek0VarD.a(bArr6);
        }
        return w27.a(new StringBuilder("mdta: key="), this.a, ", value=", string);
    }
}
