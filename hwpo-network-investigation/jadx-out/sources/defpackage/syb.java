package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class syb extends l4c {
    public static final Set f;
    public static final ead g;
    public static final qyb h;
    public final String b;
    public final Level c;
    public final Set d;
    public final ead e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(n8d.a, o9d.a, p9d.a)));
        f = setUnmodifiableSet;
        ead eadVar = new ead(utb.f(setUnmodifiableSet));
        g = eadVar;
        h = new qyb(Level.ALL, setUnmodifiableSet, eadVar);
    }

    public /* synthetic */ syb(String str, Level level, Set set, ead eadVar) {
        super(str);
        this.b = lyb.a(str);
        this.c = level;
        this.d = set;
        this.e = eadVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:140:0x023d  */
    /* JADX WARN: Code duplicated, block: B:145:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x026a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0274  */
    /* JADX WARN: Code duplicated, block: B:156:0x0277  */
    /* JADX WARN: Code duplicated, block: B:162:0x0281  */
    /* JADX WARN: Code duplicated, block: B:167:0x028b  */
    /* JADX WARN: Code duplicated, block: B:169:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:199:0x0303  */
    /* JADX WARN: Code duplicated, block: B:202:0x0310  */
    /* JADX WARN: Code duplicated, block: B:205:0x0331  */
    /* JADX WARN: Code duplicated, block: B:207:0x0335  */
    /* JADX WARN: Code duplicated, block: B:208:0x0339  */
    /* JADX WARN: Code duplicated, block: B:209:0x033f  */
    /* JADX WARN: Code duplicated, block: B:217:0x036b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0376  */
    /* JADX WARN: Code duplicated, block: B:221:0x037e A[LOOP:4: B:138:0x0234->B:221:0x037e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x0398 A[LOOP:2: B:99:0x0195->B:228:0x0398, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:255:0x0424  */
    /* JADX WARN: Code duplicated, block: B:257:0x042a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0430  */
    /* JADX WARN: Code duplicated, block: B:261:0x043a  */
    /* JADX WARN: Code duplicated, block: B:262:0x043d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0440  */
    /* JADX WARN: Code duplicated, block: B:266:0x0444  */
    /* JADX WARN: Code duplicated, block: B:269:0x0463  */
    /* JADX WARN: Code duplicated, block: B:289:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:291:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:293:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:295:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x022e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[LOOP:1: B:63:0x00f9->B:69:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x018e  */
    public static void u(p8d p8dVar, String str, Level level, Set set, ead eadVar) {
        cyb nadVar;
        StringBuilder sb;
        x8d x8dVar;
        gyb gybVar;
        cyb cybVar;
        Level level2;
        boolean z;
        Object[] objArr;
        StringBuilder sb2;
        y9d y9dVar;
        q9d q9dVar;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        gyb gybVar2;
        String str4;
        int iB;
        int i;
        int i2;
        int i3;
        StringBuilder sb3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str5;
        int i8;
        String str6;
        char cCharAt;
        int i9;
        char c;
        int i10;
        int i11;
        char cCharAt2;
        int i12;
        boolean z3;
        int i13;
        x9d x9dVar;
        int i14;
        int i15;
        char cCharAt3;
        cyb cybVar2;
        StringBuilder sb4;
        int i16;
        int i17;
        char cCharAt4;
        char c2;
        int i18;
        int i19;
        r9d r9dVar;
        int i20;
        int i21;
        hzb hzbVar;
        jzb izbVar;
        jzb lzbVar;
        int i22;
        int i23;
        Object[] objArr3;
        Object obj;
        int i24;
        int i25;
        boolean z4;
        int i26;
        int i27;
        String string;
        p8d p8dVar2 = p8dVar;
        ln4 ln4VarG = p8dVar2.g();
        Level level3 = p8dVar2.a;
        Boolean bool = (Boolean) ln4VarG.g1(p9d.a);
        if (bool == null || !bool.booleanValue()) {
            ln4 ln4VarC = dyb.a.c().c();
            ln4 ln4VarG2 = p8dVar2.g();
            int iB1 = ln4VarG2.b1();
            if (iB1 == 0) {
                nadVar = cyb.a;
            } else {
                nadVar = iB1 <= 28 ? new nad(ln4VarC, ln4VarG2) : new oad(ln4VarC, ln4VarG2);
            }
            boolean z5 = level3.intValue() < level.intValue();
            if (z5) {
                sb = new StringBuilder();
                x8dVar = p8dVar2.d;
                if (x8dVar != null) {
                    aa0.c("cannot request log site information prior to postProcess()");
                    return;
                }
                if (pu9.c(2, x8dVar, sb)) {
                    sb.append(" ");
                }
                if (z5) {
                    gybVar = p8dVar2.f;
                    if (gybVar != null) {
                        if (gybVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            aa0.c("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = p8dVar2.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            aa0.c("cannot get arguments before calling log()");
                            return;
                        }
                        q9dVar = new q9d(gybVar, objArr2, sb);
                        Object obj2 = q9dVar.c;
                        gyb gybVar3 = (gyb) obj2;
                        gybVar3.a.getClass();
                        gybVar2 = (gyb) obj2;
                        str4 = gybVar2.b;
                        iB = ozb.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (true) {
                            i3 = 3;
                            sb3 = q9dVar.e;
                            if (iB < 0) {
                                cybVar = nadVar;
                                level2 = level3;
                                StringBuilder sb5 = sb;
                                String str7 = str2;
                                String str8 = str3;
                                i4 = q9dVar.a;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new nzb(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                            }
                            i5 = iB + 1;
                            Level level4 = level3;
                            i6 = i5;
                            i7 = 0;
                            while (true) {
                                str5 = str2;
                                if (i6 >= str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                i8 = i6 + 1;
                                str6 = str3;
                                cCharAt = str4.charAt(i6);
                                i9 = i6;
                                c = (char) (cCharAt - '0');
                                if (c < '\n') {
                                    i27 = (i7 * 10) + c;
                                    if (i27 >= 1000000) {
                                        throw nzb.a(iB, i8, "index too large", str4);
                                    }
                                    i7 = i27;
                                    i6 = i8;
                                    str2 = str5;
                                    str3 = str6;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw nzb.a(iB, i8, "invalid relative parameter", str4);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw nzb.a(iB, i8, "missing index", str4);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw nzb.a(iB, i8, "index has leading zero", str4);
                                }
                                i26 = i7 - 1;
                                if (i8 == str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i8 = i9 + 2;
                                i = i26;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            x9d x9dVar2 = x9d.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        x9dVar = new x9d(i13, -1, -1);
                                        cybVar2 = nadVar;
                                        i15 = i12;
                                        sb4 = sb;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    cybVar2 = nadVar;
                                    sb4 = sb;
                                    if (cCharAt3 < ' ') {
                                    }
                                    if (cCharAt3 > '9') {
                                        throw nzb.b(i5, "invalid flag", str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            x9dVar = new x9d(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            x9dVar = new x9d(i13, i16, x9d.e(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw nzb.b(i14, "invalid width character", str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw nzb.a(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 = i18 | i19;
                                    i5 = i14;
                                    i12 = i15;
                                    nadVar = cybVar2;
                                    sb = sb4;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        x9dVar = new x9d(i13, -1, -1);
                                        cybVar2 = nadVar;
                                        i15 = i12;
                                        sb4 = sb;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    cybVar2 = nadVar;
                                    sb4 = sb;
                                    if (cCharAt3 < ' ') {
                                    }
                                    if (cCharAt3 > '9') {
                                        throw nzb.b(i5, "invalid flag", str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            x9dVar = new x9d(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            x9dVar = new x9d(i13, i16, x9d.e(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw nzb.b(i14, "invalid width character", str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw nzb.a(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 = i18 | i19;
                                    i5 = i14;
                                    i12 = i15;
                                    nadVar = cybVar2;
                                    sb = sb4;
                                }
                            }
                            r9dVar = r9d.y[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                r9dVar = null;
                            }
                            i20 = i11 + 1;
                            if (r9dVar != null) {
                                x9dVar.getClass();
                                i24 = r9dVar.v;
                                i25 = r9dVar.u;
                                if (i25 == 1) {
                                    z4 = true;
                                } else {
                                    if (i25 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (x9dVar.b(i24, z4)) {
                                    throw nzb.a(iB, i20, "invalid format specifier", str4);
                                }
                                if (i < 10) {
                                    Map map = kzb.d;
                                    if (x9dVar.a()) {
                                        jzb[] jzbVarArr = (kzb[]) kzb.d.get(r9dVar);
                                        qzb.a(jzbVarArr, "default parameter");
                                        izbVar = jzbVarArr[i];
                                    }
                                }
                                lzbVar = new kzb(i, r9dVar, x9dVar);
                                izbVar = lzbVar;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (x9dVar.b(160, false)) {
                                    throw nzb.a(iB, i20, "invalid format specification", str4);
                                }
                                i21 = i11 + 2;
                                if (i21 <= str4.length()) {
                                    throw nzb.b(iB, "truncated format specifier", str4);
                                }
                                hzbVar = (hzb) hzb.u.get(Character.valueOf(str4.charAt(i20)));
                                if (hzbVar != null) {
                                    throw nzb.b(i20, "illegal date/time conversion", str4);
                                }
                                izbVar = new izb(x9dVar, i, hzbVar);
                                i20 = i21;
                            }
                            i22 = izbVar.a;
                            if (i22 < 32) {
                                q9dVar.a |= 1 << i22;
                            }
                            q9dVar.b = Math.max(q9dVar.b, i22);
                            gybVar2.a.a(q9dVar.f, iB, gybVar2.b, sb3);
                            i23 = izbVar.a;
                            objArr3 = q9dVar.d;
                            if (i23 < objArr3.length) {
                                obj = objArr3[i23];
                                if (obj != null) {
                                    izbVar.a(q9dVar, obj);
                                } else {
                                    sb3.append("null");
                                }
                            } else {
                                sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            q9dVar.f = i20;
                            iB = ozb.b(i20, str4);
                            level3 = level4;
                            str2 = str5;
                            str3 = str6;
                            nadVar = cybVar2;
                            sb = sb4;
                        }
                    } else {
                        cybVar = nadVar;
                        level2 = level3;
                        if (gybVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            aa0.c("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = p8dVar2.g;
                        if (objArr == null) {
                            aa0.c("cannot get literal argument before calling log()");
                            return;
                        } else {
                            sb2 = sb;
                            sb2.append(z9d.a(objArr[0]));
                        }
                    }
                    Set set2 = fyb.a;
                    y9dVar = new y9d(sb2);
                    cybVar.a(eadVar, y9dVar);
                    if (y9dVar.b) {
                        sb2.append(" ]");
                    }
                } else {
                    gybVar = p8dVar2.f;
                    if (gybVar != null) {
                        if (gybVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            aa0.c("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = p8dVar2.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            aa0.c("cannot get arguments before calling log()");
                            return;
                        }
                        q9dVar = new q9d(gybVar, objArr2, sb);
                        Object obj3 = q9dVar.c;
                        gyb gybVar4 = (gyb) obj3;
                        gybVar4.a.getClass();
                        gybVar2 = (gyb) obj3;
                        str4 = gybVar2.b;
                        iB = ozb.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (true) {
                            i3 = 3;
                            sb3 = q9dVar.e;
                            if (iB < 0) {
                                cybVar = nadVar;
                                level2 = level3;
                                StringBuilder sb6 = sb;
                                String str9 = str2;
                                String str10 = str3;
                                i4 = q9dVar.a;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new nzb(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                            }
                            i5 = iB + 1;
                            Level level5 = level3;
                            i6 = i5;
                            i7 = 0;
                            while (true) {
                                str5 = str2;
                                if (i6 >= str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                i8 = i6 + 1;
                                str6 = str3;
                                cCharAt = str4.charAt(i6);
                                i9 = i6;
                                c = (char) (cCharAt - '0');
                                if (c < '\n') {
                                    i27 = (i7 * 10) + c;
                                    if (i27 >= 1000000) {
                                        throw nzb.a(iB, i8, "index too large", str4);
                                    }
                                    i7 = i27;
                                    i6 = i8;
                                    str2 = str5;
                                    str3 = str6;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw nzb.a(iB, i8, "invalid relative parameter", str4);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw nzb.a(iB, i8, "missing index", str4);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw nzb.a(iB, i8, "index has leading zero", str4);
                                }
                                i26 = i7 - 1;
                                if (i8 == str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i8 = i9 + 2;
                                i = i26;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            x9d x9dVar3 = x9d.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        x9dVar = new x9d(i13, -1, -1);
                                        cybVar2 = nadVar;
                                        i15 = i12;
                                        sb4 = sb;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    cybVar2 = nadVar;
                                    sb4 = sb;
                                    if (cCharAt3 < ' ') {
                                    }
                                    if (cCharAt3 > '9') {
                                        throw nzb.b(i5, "invalid flag", str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            x9dVar = new x9d(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            x9dVar = new x9d(i13, i16, x9d.e(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw nzb.b(i14, "invalid width character", str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw nzb.a(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 = i18 | i19;
                                    i5 = i14;
                                    i12 = i15;
                                    nadVar = cybVar2;
                                    sb = sb4;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        x9dVar = new x9d(i13, -1, -1);
                                        cybVar2 = nadVar;
                                        i15 = i12;
                                        sb4 = sb;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    cybVar2 = nadVar;
                                    sb4 = sb;
                                    if (cCharAt3 < ' ') {
                                    }
                                    if (cCharAt3 > '9') {
                                        throw nzb.b(i5, "invalid flag", str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            x9dVar = new x9d(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            x9dVar = new x9d(i13, i16, x9d.e(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw nzb.b(i14, "invalid width character", str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw nzb.a(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 = i18 | i19;
                                    i5 = i14;
                                    i12 = i15;
                                    nadVar = cybVar2;
                                    sb = sb4;
                                }
                            }
                            r9dVar = r9d.y[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                r9dVar = null;
                            }
                            i20 = i11 + 1;
                            if (r9dVar != null) {
                                x9dVar.getClass();
                                i24 = r9dVar.v;
                                i25 = r9dVar.u;
                                if (i25 == 1) {
                                    z4 = true;
                                } else {
                                    if (i25 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (x9dVar.b(i24, z4)) {
                                    throw nzb.a(iB, i20, "invalid format specifier", str4);
                                }
                                if (i < 10) {
                                    Map map2 = kzb.d;
                                    if (x9dVar.a()) {
                                        jzb[] jzbVarArr2 = (kzb[]) kzb.d.get(r9dVar);
                                        qzb.a(jzbVarArr2, "default parameter");
                                        izbVar = jzbVarArr2[i];
                                    }
                                }
                                lzbVar = new kzb(i, r9dVar, x9dVar);
                                izbVar = lzbVar;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (x9dVar.b(160, false)) {
                                    throw nzb.a(iB, i20, "invalid format specification", str4);
                                }
                                i21 = i11 + 2;
                                if (i21 <= str4.length()) {
                                    throw nzb.b(iB, "truncated format specifier", str4);
                                }
                                hzbVar = (hzb) hzb.u.get(Character.valueOf(str4.charAt(i20)));
                                if (hzbVar != null) {
                                    throw nzb.b(i20, "illegal date/time conversion", str4);
                                }
                                izbVar = new izb(x9dVar, i, hzbVar);
                                i20 = i21;
                            }
                            i22 = izbVar.a;
                            if (i22 < 32) {
                                q9dVar.a |= 1 << i22;
                            }
                            q9dVar.b = Math.max(q9dVar.b, i22);
                            gybVar2.a.a(q9dVar.f, iB, gybVar2.b, sb3);
                            i23 = izbVar.a;
                            objArr3 = q9dVar.d;
                            if (i23 < objArr3.length) {
                                obj = objArr3[i23];
                                if (obj != null) {
                                    izbVar.a(q9dVar, obj);
                                } else {
                                    sb3.append("null");
                                }
                            } else {
                                sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            q9dVar.f = i20;
                            iB = ozb.b(i20, str4);
                            level3 = level5;
                            str2 = str5;
                            str3 = str6;
                            nadVar = cybVar2;
                            sb = sb4;
                        }
                    } else {
                        cybVar = nadVar;
                        level2 = level3;
                        if (gybVar == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            aa0.c("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = p8dVar2.g;
                        if (objArr == null) {
                            aa0.c("cannot get literal argument before calling log()");
                            return;
                        } else {
                            sb2 = sb;
                            sb2.append(z9d.a(objArr[0]));
                        }
                    }
                    Set set3 = fyb.a;
                    y9dVar = new y9d(sb2);
                    cybVar.a(eadVar, y9dVar);
                    if (y9dVar.b) {
                        sb2.append(" ]");
                    }
                }
                string = sb2.toString();
            } else {
                Set set4 = fyb.a;
                if (p8dVar2.f == null && nadVar.b() <= set.size() && set.containsAll(nadVar.c())) {
                    if (!(p8dVar2.f == null)) {
                        aa0.c("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = p8dVar2.g;
                    if (objArr4 == null) {
                        aa0.c("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = z9d.a(objArr4[0]);
                        level2 = level3;
                    }
                } else {
                    sb = new StringBuilder();
                    x8dVar = p8dVar2.d;
                    if (x8dVar != null) {
                        aa0.c("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (pu9.c(2, x8dVar, sb)) {
                        sb.append(" ");
                    }
                    if (z5 || p8dVar2.f == null) {
                        gybVar = p8dVar2.f;
                        if (gybVar != null) {
                            if (gybVar != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                aa0.c("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = p8dVar2.g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                aa0.c("cannot get arguments before calling log()");
                                return;
                            }
                            q9dVar = new q9d(gybVar, objArr2, sb);
                            Object obj4 = q9dVar.c;
                            gyb gybVar5 = (gyb) obj4;
                            gybVar5.a.getClass();
                            gybVar2 = (gyb) obj4;
                            str4 = gybVar2.b;
                            iB = ozb.b(0, str4);
                            i = -1;
                            i2 = 0;
                            while (true) {
                                i3 = 3;
                                sb3 = q9dVar.e;
                                if (iB < 0) {
                                    cybVar = nadVar;
                                    level2 = level3;
                                    StringBuilder sb7 = sb;
                                    String str11 = str2;
                                    String str12 = str3;
                                    i4 = q9dVar.a;
                                    if (((i4 + 1) & i4) == 0 || (q9dVar.b > 31 && i4 != -1)) {
                                        throw new nzb(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                                    }
                                    ozb ozbVar = gybVar5.a;
                                    String str13 = gybVar5.b;
                                    ozbVar.a(q9dVar.f, str13.length(), str13, sb3);
                                    p8dVar2 = p8dVar;
                                    if (!(p8dVar2.f != null)) {
                                        aa0.c(str11);
                                        return;
                                    }
                                    Object[] objArr5 = p8dVar2.g;
                                    if (objArr5 == null) {
                                        aa0.c(str12);
                                        return;
                                    }
                                    if (objArr5.length > q9dVar.b + 1) {
                                        sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                    }
                                    sb2 = sb7;
                                    break;
                                }
                                i5 = iB + 1;
                                Level level6 = level3;
                                i6 = i5;
                                i7 = 0;
                                while (true) {
                                    str5 = str2;
                                    if (i6 >= str4.length()) {
                                        throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                    }
                                    i8 = i6 + 1;
                                    str6 = str3;
                                    cCharAt = str4.charAt(i6);
                                    i9 = i6;
                                    c = (char) (cCharAt - '0');
                                    if (c < '\n') {
                                        i27 = (i7 * 10) + c;
                                        if (i27 >= 1000000) {
                                            throw nzb.a(iB, i8, "index too large", str4);
                                        }
                                        i7 = i27;
                                        i6 = i8;
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i10 = -1;
                                    if (cCharAt != '<') {
                                        i = i2;
                                        i2++;
                                    } else {
                                        if (i == -1) {
                                            throw nzb.a(iB, i8, "invalid relative parameter", str4);
                                        }
                                        if (i8 == str4.length()) {
                                            throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                        }
                                        str4.charAt(i8);
                                        i5 = i8;
                                        i8 = i9 + 2;
                                    }
                                } else {
                                    if (i9 - i5 == 0) {
                                        throw nzb.a(iB, i8, "missing index", str4);
                                    }
                                    if (str4.charAt(i5) == '0') {
                                        throw nzb.a(iB, i8, "index has leading zero", str4);
                                    }
                                    i26 = i7 - 1;
                                    if (i8 == str4.length()) {
                                        throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                    i = i26;
                                    i10 = -1;
                                }
                                i11 = i8 + i10;
                                while (true) {
                                    if (i11 >= str4.length()) {
                                        throw new nzb(nzb.c(iB, -1, "unterminated parameter", str4));
                                    }
                                    if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i11++;
                                    i3 = 3;
                                }
                                cCharAt2 = str4.charAt(i11);
                                i12 = cCharAt2 & ' ';
                                if (i12 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                x9d x9dVar4 = x9d.e;
                                if (i5 == i11 || z3) {
                                    if (true != z3) {
                                        i13 = 0;
                                    } else {
                                        i13 = 128;
                                    }
                                    while (true) {
                                        if (i5 == i11) {
                                            x9dVar = new x9d(i13, -1, -1);
                                        } else {
                                            i14 = i5 + 1;
                                            i15 = i12;
                                            cCharAt3 = str4.charAt(i5);
                                            cybVar2 = nadVar;
                                            sb4 = sb;
                                            if (cCharAt3 < ' ' && cCharAt3 <= '0') {
                                                i18 = i13;
                                                int i28 = ((int) ((x9d.d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i28 < 0) {
                                                    if (cCharAt3 != '.') {
                                                        throw nzb.b(i5, "invalid flag", str4);
                                                    }
                                                    x9dVar = new x9d(i18, -1, x9d.e(i14, i11, str4));
                                                    break;
                                                }
                                                i19 = 1 << i28;
                                                if ((i18 & i19) != 0) {
                                                    throw nzb.b(i5, "repeated flag", str4);
                                                }
                                                i13 = i18 | i19;
                                                i5 = i14;
                                                i12 = i15;
                                                nadVar = cybVar2;
                                                sb = sb4;
                                            } else {
                                                if (cCharAt3 > '9') {
                                                    throw nzb.b(i5, "invalid flag", str4);
                                                }
                                                i16 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i14 == i11) {
                                                        x9dVar = new x9d(i13, i16, -1);
                                                        break;
                                                    }
                                                    i17 = i14 + 1;
                                                    cCharAt4 = str4.charAt(i14);
                                                    if (cCharAt4 == '.') {
                                                        x9dVar = new x9d(i13, i16, x9d.e(i17, i11, str4));
                                                        break;
                                                    }
                                                    c2 = (char) (cCharAt4 - '0');
                                                    if (c2 >= '\n') {
                                                        throw nzb.b(i14, "invalid width character", str4);
                                                    }
                                                    i16 = (i16 * 10) + c2;
                                                    if (i16 > 999999) {
                                                        throw nzb.a(i5, i11, "width too large", str4);
                                                    }
                                                    i14 = i17;
                                                    i3 = 3;
                                                }
                                            }
                                        }
                                    }
                                    r9dVar = r9d.y[(cCharAt2 | ' ') - 97];
                                    if (i15 == 0 && (r9dVar == null || (r9dVar.v & 128) == 0)) {
                                        r9dVar = null;
                                    }
                                    i20 = i11 + 1;
                                    if (r9dVar != null) {
                                        x9dVar.getClass();
                                        i24 = r9dVar.v;
                                        i25 = r9dVar.u;
                                        if (i25 == 1) {
                                            z4 = true;
                                        } else if (i25 != 2 || i25 == i3 || i25 == 4) {
                                            z4 = false;
                                        } else {
                                            if (i25 != 5) {
                                                throw null;
                                            }
                                            z4 = true;
                                        }
                                        if (x9dVar.b(i24, z4)) {
                                            throw nzb.a(iB, i20, "invalid format specifier", str4);
                                        }
                                        if (i < 10) {
                                            Map map3 = kzb.d;
                                            if (x9dVar.a()) {
                                                jzb[] jzbVarArr3 = (kzb[]) kzb.d.get(r9dVar);
                                                qzb.a(jzbVarArr3, "default parameter");
                                                izbVar = jzbVarArr3[i];
                                            }
                                        }
                                        lzbVar = new kzb(i, r9dVar, x9dVar);
                                        izbVar = lzbVar;
                                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                        if (x9dVar.b(160, false)) {
                                            throw nzb.a(iB, i20, "invalid format specification", str4);
                                        }
                                        i21 = i11 + 2;
                                        if (i21 <= str4.length()) {
                                            throw nzb.b(iB, "truncated format specifier", str4);
                                        }
                                        hzbVar = (hzb) hzb.u.get(Character.valueOf(str4.charAt(i20)));
                                        if (hzbVar != null) {
                                            throw nzb.b(i20, "illegal date/time conversion", str4);
                                        }
                                        izbVar = new izb(x9dVar, i, hzbVar);
                                        i20 = i21;
                                    } else {
                                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                            throw nzb.a(iB, i20, "invalid format specification", str4);
                                        }
                                        if (!x9dVar.b(160, false)) {
                                            throw nzb.a(iB, i20, "invalid format specification", str4);
                                        }
                                        lzbVar = new lzb(x9dVar, i);
                                        izbVar = lzbVar;
                                    }
                                    i22 = izbVar.a;
                                    if (i22 < 32) {
                                        q9dVar.a |= 1 << i22;
                                    }
                                    q9dVar.b = Math.max(q9dVar.b, i22);
                                    gybVar2.a.a(q9dVar.f, iB, gybVar2.b, sb3);
                                    i23 = izbVar.a;
                                    objArr3 = q9dVar.d;
                                    if (i23 < objArr3.length) {
                                        obj = objArr3[i23];
                                        if (obj != null) {
                                            izbVar.a(q9dVar, obj);
                                        } else {
                                            sb3.append("null");
                                        }
                                    } else {
                                        sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                                    }
                                    q9dVar.f = i20;
                                    iB = ozb.b(i20, str4);
                                    level3 = level6;
                                    str2 = str5;
                                    str3 = str6;
                                    nadVar = cybVar2;
                                    sb = sb4;
                                } else {
                                    x9dVar = x9d.e;
                                }
                                cybVar2 = nadVar;
                                i15 = i12;
                                sb4 = sb;
                                r9dVar = r9d.y[(cCharAt2 | ' ') - 97];
                                if (i15 == 0) {
                                    r9dVar = null;
                                }
                                i20 = i11 + 1;
                                if (r9dVar != null) {
                                    x9dVar.getClass();
                                    i24 = r9dVar.v;
                                    i25 = r9dVar.u;
                                    if (i25 == 1) {
                                        z4 = true;
                                    } else {
                                        if (i25 != 2) {
                                        }
                                        z4 = false;
                                    }
                                    if (x9dVar.b(i24, z4)) {
                                        throw nzb.a(iB, i20, "invalid format specifier", str4);
                                    }
                                    if (i < 10) {
                                        Map map4 = kzb.d;
                                        if (x9dVar.a()) {
                                            jzb[] jzbVarArr4 = (kzb[]) kzb.d.get(r9dVar);
                                            qzb.a(jzbVarArr4, "default parameter");
                                            izbVar = jzbVarArr4[i];
                                        }
                                    }
                                    lzbVar = new kzb(i, r9dVar, x9dVar);
                                    izbVar = lzbVar;
                                } else {
                                    if (cCharAt2 != 't') {
                                    }
                                    if (x9dVar.b(160, false)) {
                                        throw nzb.a(iB, i20, "invalid format specification", str4);
                                    }
                                    i21 = i11 + 2;
                                    if (i21 <= str4.length()) {
                                        throw nzb.b(iB, "truncated format specifier", str4);
                                    }
                                    hzbVar = (hzb) hzb.u.get(Character.valueOf(str4.charAt(i20)));
                                    if (hzbVar != null) {
                                        throw nzb.b(i20, "illegal date/time conversion", str4);
                                    }
                                    izbVar = new izb(x9dVar, i, hzbVar);
                                    i20 = i21;
                                }
                                i22 = izbVar.a;
                                if (i22 < 32) {
                                    q9dVar.a |= 1 << i22;
                                }
                                q9dVar.b = Math.max(q9dVar.b, i22);
                                gybVar2.a.a(q9dVar.f, iB, gybVar2.b, sb3);
                                i23 = izbVar.a;
                                objArr3 = q9dVar.d;
                                if (i23 < objArr3.length) {
                                    obj = objArr3[i23];
                                    if (obj != null) {
                                        izbVar.a(q9dVar, obj);
                                    } else {
                                        sb3.append("null");
                                    }
                                } else {
                                    sb3.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                q9dVar.f = i20;
                                iB = ozb.b(i20, str4);
                                level3 = level6;
                                str2 = str5;
                                str3 = str6;
                                nadVar = cybVar2;
                                sb = sb4;
                            }
                        } else {
                            cybVar = nadVar;
                            level2 = level3;
                            if (gybVar == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                aa0.c("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = p8dVar2.g;
                            if (objArr == null) {
                                aa0.c("cannot get literal argument before calling log()");
                                return;
                            } else {
                                sb2 = sb;
                                sb2.append(z9d.a(objArr[0]));
                            }
                        }
                        Set set5 = fyb.a;
                        y9dVar = new y9d(sb2);
                        cybVar.a(eadVar, y9dVar);
                        if (y9dVar.b) {
                            sb2.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(p8dVar2.f.b);
                        level2 = level3;
                        sb2 = sb;
                    }
                    string = sb2.toString();
                }
            }
            Throwable th = (Throwable) p8dVar2.g().g1(n8d.a);
            int iB2 = lyb.b(level2);
            if (iB2 == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iB2 == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iB2 == 4) {
                Log.i(str, string, th);
            } else if (iB2 != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.l4c
    public final boolean m(Level level) {
        int iB = lyb.b(level);
        return Log.isLoggable(this.b, iB) || Log.isLoggable("all", iB);
    }

    @Override // defpackage.l4c
    public final void o(p8d p8dVar) {
        u(p8dVar, this.b, this.c, this.d, this.e);
    }
}
