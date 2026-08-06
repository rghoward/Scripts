package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pz6 implements js3 {
    public final long a;
    public final pt7 b;
    public final a07.a c;
    public final lj4 d;
    public final w65 e;
    public final g13 f;
    public ls3 g;
    public hsa h;
    public hsa i;
    public int j;
    public su6 k;
    public su6 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public d99 r;
    public boolean s;
    public boolean t;
    public long u;

    public pz6(long j) {
        this.a = j;
        this.b = new pt7(10);
        this.c = new a07.a();
        this.d = new lj4();
        this.m = -9223372036854775807L;
        this.e = new w65();
        g13 g13Var = new g13();
        this.f = g13Var;
        this.i = g13Var;
        this.p = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:108:0x0264  */
    /* JADX WARN: Code duplicated, block: B:110:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x027c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x0286  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x028a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:146:0x032b  */
    /* JADX WARN: Code duplicated, block: B:147:0x032f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0336  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0344  */
    /* JADX WARN: Code duplicated, block: B:154:0x0353  */
    /* JADX WARN: Code duplicated, block: B:157:0x0358 A[LOOP:0: B:148:0x0334->B:157:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x0362  */
    /* JADX WARN: Code duplicated, block: B:164:0x036a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0378  */
    /* JADX WARN: Code duplicated, block: B:169:0x038c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0391 A[LOOP:1: B:163:0x0368->B:172:0x0391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x039a  */
    /* JADX WARN: Code duplicated, block: B:177:0x039e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03bf A[LOOP:2: B:179:0x03bd->B:180:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:188:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0407  */
    /* JADX WARN: Code duplicated, block: B:192:0x040b  */
    /* JADX WARN: Code duplicated, block: B:193:0x043c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0461 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0463  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:202:0x049e  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x055b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0566  */
    /* JADX WARN: Code duplicated, block: B:234:0x0569  */
    /* JADX WARN: Code duplicated, block: B:237:0x0571  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:249:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x035d A[EDGE_INSN: B:250:0x035d->B:159:0x035d BREAK  A[LOOP:0: B:148:0x0334->B:157:0x0358], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0396 A[EDGE_INSN: B:252:0x0396->B:174:0x0396 BREAK  A[LOOP:1: B:163:0x0368->B:172:0x0391], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[LOOP:4: B:77:0x01b9->B:78:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws Throwable {
        a07.a aVar;
        Throwable th;
        int i;
        long j;
        d99 d99Var;
        pt7 pt7Var;
        boolean z;
        long j2;
        long j3;
        long position;
        long j4;
        ?? r4;
        int iF;
        int i2;
        int iM;
        pt7 pt7Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM2;
        lj4 lj4Var;
        a07.a aVar2;
        int i7;
        int iM3;
        int iD;
        long jMin;
        long[] jArr;
        qz6 qz6Var;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        qz6 qz6Var2;
        su6 su6Var;
        long position2;
        long jA;
        long jS;
        long j6;
        long j7;
        d99 ox1Var;
        long jA2;
        long jS2;
        float fIntBitsToFloat;
        qz6.a aVarA;
        qz6.a aVarA2;
        int i14;
        long[] jArr2;
        int i15;
        su6 su6Var2;
        long position3;
        su6.a[] aVarArr;
        int length;
        int i16;
        su6.a aVar3;
        nv6 nv6Var;
        int[] iArr;
        su6.a[] aVarArr2;
        int length2;
        int i17;
        su6.a aVar4;
        rha rhaVar;
        char c;
        long jN;
        int length3;
        long[] jArr3;
        long[] jArr4;
        long j8;
        int i18;
        ov6 ov6Var;
        su6.a aVar5;
        su6.a aVar6;
        boolean z2;
        d99 aVar7;
        boolean z3;
        su6 su6VarB;
        su6 su6Var3;
        id4.a aVar8;
        long jA3;
        long position4;
        long j9;
        long j10;
        int iM4;
        long jS3;
        int iG;
        int iG2;
        int iG3;
        long[] jArr5;
        long[] jArr6;
        a07.a aVar9;
        long j11;
        int i19;
        long j12;
        long jMax;
        a07.a aVar10;
        int iZ;
        this.h.getClass();
        String str = n6b.a;
        int i20 = this.j;
        int i21 = 0;
        a07.a aVar11 = this.c;
        if (i20 == 0) {
            try {
                j(ks3Var, false);
                d99Var = this.r;
                pt7Var = this.b;
                if (d99Var == null) {
                    pt7Var2 = new pt7(aVar11.c);
                    th = null;
                    ks3Var.n(pt7Var2.a, 0, aVar11.c);
                    i3 = aVar11.a & 1;
                    i4 = aVar11.e;
                    i5 = 21;
                    j = 1000000;
                    if (i3 != 0) {
                        if (i4 != 1) {
                            i6 = 36;
                        }
                        j2 = -9223372036854775807L;
                        if (pt7Var2.c >= i6 + 4) {
                            pt7Var2.M(i6);
                            iM2 = pt7Var2.m();
                            if (iM2 != 1483304551 && iM2 != 1231971951) {
                                if (pt7Var2.c >= 40) {
                                    pt7Var2.M(36);
                                    if (pt7Var2.m() == 1447187017) {
                                        iM2 = 1447187017;
                                    } else {
                                        iM2 = 0;
                                    }
                                } else {
                                    iM2 = 0;
                                }
                            }
                        } else if (pt7Var2.c >= 40) {
                            pt7Var2.M(36);
                            if (pt7Var2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                        lj4Var = this.d;
                        if (iM2 == 1231971951) {
                            aVar2 = aVar11;
                            i7 = 0;
                            iM3 = pt7Var2.m();
                            if ((iM3 & 1) != 0) {
                                iD = pt7Var2.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jMin = pt7Var2.B();
                            } else {
                                jMin = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                for (i14 = 100; i15 < i14; i14 = 100) {
                                    jArr2[i15] = pt7Var2.z();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                pt7Var2.N(4);
                            }
                            if (pt7Var2.a() >= 24) {
                                pt7Var2.N(11);
                                fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                                int iG4 = pt7Var2.G();
                                int iG5 = pt7Var2.G();
                                aVarA = qz6.a.a(iG4);
                                aVarA2 = qz6.a.a(iG5);
                                if (fIntBitsToFloat > 0.0f && aVarA == null && aVarA2 == null) {
                                    qz6Var = null;
                                } else {
                                    qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                                }
                                pt7Var2.N(2);
                                int iC = pt7Var2.C();
                                i9 = (16773120 & iC) >> 12;
                                i8 = iC & 4095;
                            } else {
                                qz6Var = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iD;
                            i10 = aVar2.c;
                            i11 = aVar2.d;
                            i12 = aVar2.f;
                            i13 = aVar2.g;
                            qz6Var2 = qz6Var;
                            if ((lj4Var.a != -1 || lj4Var.b == -1) && i9 != -1 && i8 != -1) {
                                lj4Var.a = i9;
                                lj4Var.b = i8;
                            }
                            if (qz6Var2 != null) {
                                su6Var = new su6(qz6Var2);
                            } else {
                                su6Var = null;
                            }
                            this.l = su6Var;
                            position2 = ks3Var.getPosition();
                            ks3Var.m(aVar2.c);
                            if (iM2 == 1483304551) {
                                jA2 = ks3Var.a();
                                if (j5 != -1 || j5 == 0) {
                                    jS2 = -9223372036854775807L;
                                } else {
                                    jS2 = n6b.S(i11, (j5 * ((long) i13)) - 1);
                                }
                                if (jS2 == -9223372036854775807L) {
                                    ox1Var = null;
                                } else {
                                    if (jMin != -1 && jA2 != -1 && position2 + jMin != jA2) {
                                        long j13 = jA2 - position2;
                                        StringBuilder sbB = ao3.b("Data size mismatch between stream (", j13, ") and Xing frame (");
                                        sbB.append(jMin);
                                        sbB.append("), using smaller value.");
                                        md6.f("XingSeeker", sbB.toString());
                                        jMin = Math.min(jMin, j13);
                                    }
                                    ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                                }
                            } else {
                                jA = ks3Var.a();
                                jS = (j5 != -1 || j5 == 0) ? -9223372036854775807L : n6b.S(i11, (((long) i13) * j5) - 1);
                                if (jS != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        long j14 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                        j7 = j14;
                                    } else if (jA != -1) {
                                        j6 = (jA - position2) - ((long) i10);
                                        j7 = jA;
                                    } else {
                                        ox1Var = null;
                                    }
                                    long j15 = j6;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j15, 8000000L, jS, roundingMode)), ek5.i1(le6.b(j15, j5, roundingMode)), false, true);
                                } else {
                                    ox1Var = null;
                                }
                            }
                        } else if (iM2 != 1447187017) {
                            jA3 = ks3Var.a();
                            position4 = ks3Var.getPosition();
                            pt7Var2.N(6);
                            int iM5 = pt7Var2.m();
                            i7 = 0;
                            j9 = position4 + ((long) aVar11.c);
                            j10 = j9 + ((long) iM5);
                            iM4 = pt7Var2.m();
                            if (iM4 <= 0) {
                                jS3 = n6b.S(aVar11.d, (((long) iM4) * ((long) aVar11.g)) - 1);
                                iG = pt7Var2.G();
                                iG2 = pt7Var2.G();
                                iG3 = pt7Var2.G();
                                pt7Var2.N(2);
                                jArr5 = new long[iG];
                                jArr6 = new long[iG];
                                aVar9 = aVar11;
                                j11 = position4 + ((long) aVar11.c);
                                i19 = 0;
                                while (true) {
                                    if (i19 < iG) {
                                        long[] jArr7 = jArr5;
                                        long[] jArr8 = jArr6;
                                        a07.a aVar12 = aVar9;
                                        if (jA3 != -1 || jA3 == j10) {
                                            j12 = j10;
                                        } else {
                                            StringBuilder sbB2 = ao3.b("VBRI data size mismatch: ", jA3, ", ");
                                            j12 = j10;
                                            sbB2.append(j12);
                                            md6.g("VbriSeeker", sbB2.toString());
                                        }
                                        if (j12 != j11) {
                                            StringBuilder sbB3 = ao3.b("VBRI bytes and ToC mismatch (using max): ", j12, ", ");
                                            sbB3.append(j11);
                                            sbB3.append("\nSeeking will be inaccurate.");
                                            md6.g("VbriSeeker", sbB3.toString());
                                            jMax = Math.max(j12, j11);
                                        } else {
                                            jMax = j12;
                                        }
                                        aVar2 = aVar12;
                                        ox1Var = new ncb(jArr7, jArr8, jS3, j9, jMax, aVar2.f);
                                        break;
                                    }
                                    long[] jArr9 = jArr6;
                                    aVar10 = aVar9;
                                    int i22 = i19;
                                    long[] jArr10 = jArr5;
                                    jArr10[i22] = (((long) i19) * jS3) / ((long) iG);
                                    jArr9[i22] = j11;
                                    if (iG3 != 1) {
                                        iZ = pt7Var2.z();
                                    } else if (iG3 != 2) {
                                        iZ = pt7Var2.G();
                                    } else if (iG3 != 3) {
                                        iZ = pt7Var2.C();
                                    } else {
                                        if (iG3 != 4) {
                                            ox1Var = null;
                                            aVar2 = aVar10;
                                            break;
                                        }
                                        iZ = pt7Var2.D();
                                    }
                                    j11 += ((long) iZ) * ((long) iG2);
                                    i19 = i22 + 1;
                                    jArr6 = jArr9;
                                    aVar9 = aVar10;
                                    jArr5 = jArr10;
                                }
                            } else {
                                ox1Var = null;
                                aVar2 = aVar11;
                            }
                            ks3Var.m(aVar2.c);
                        } else if (iM2 != 1483304551) {
                            ks3Var.l();
                            ox1Var = null;
                            aVar2 = aVar11;
                            i7 = 0;
                        } else {
                            aVar2 = aVar11;
                            i7 = 0;
                            iM3 = pt7Var2.m();
                            if ((iM3 & 1) != 0) {
                                iD = pt7Var2.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jMin = pt7Var2.B();
                            } else {
                                jMin = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                while (i15 < i14) {
                                    jArr2[i15] = pt7Var2.z();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iM3 & 8) != 0) {
                                pt7Var2.N(4);
                            }
                            if (pt7Var2.a() >= 24) {
                                pt7Var2.N(11);
                                fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                                int iG6 = pt7Var2.G();
                                int iG7 = pt7Var2.G();
                                aVarA = qz6.a.a(iG6);
                                aVarA2 = qz6.a.a(iG7);
                                if (fIntBitsToFloat > 0.0f) {
                                    qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                                } else {
                                    qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                                }
                                pt7Var2.N(2);
                                int iC2 = pt7Var2.C();
                                i9 = (16773120 & iC2) >> 12;
                                i8 = iC2 & 4095;
                            } else {
                                qz6Var = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iD;
                            i10 = aVar2.c;
                            i11 = aVar2.d;
                            i12 = aVar2.f;
                            i13 = aVar2.g;
                            qz6Var2 = qz6Var;
                            if (lj4Var.a != -1) {
                                lj4Var.a = i9;
                                lj4Var.b = i8;
                            } else {
                                lj4Var.a = i9;
                                lj4Var.b = i8;
                            }
                            if (qz6Var2 != null) {
                                su6Var = new su6(qz6Var2);
                            } else {
                                su6Var = null;
                            }
                            this.l = su6Var;
                            position2 = ks3Var.getPosition();
                            ks3Var.m(aVar2.c);
                            if (iM2 == 1483304551) {
                                jA2 = ks3Var.a();
                                if (j5 != -1) {
                                    jS2 = -9223372036854775807L;
                                } else {
                                    jS2 = -9223372036854775807L;
                                }
                                if (jS2 == -9223372036854775807L) {
                                    ox1Var = null;
                                } else {
                                    if (jMin != -1) {
                                        long j16 = jA2 - position2;
                                        StringBuilder sbB4 = ao3.b("Data size mismatch between stream (", j16, ") and Xing frame (");
                                        sbB4.append(jMin);
                                        sbB4.append("), using smaller value.");
                                        md6.f("XingSeeker", sbB4.toString());
                                        jMin = Math.min(jMin, j16);
                                    }
                                    ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                                }
                            } else {
                                jA = ks3Var.a();
                                if (j5 != -1) {
                                }
                                if (jS != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        long j17 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                        j7 = j17;
                                    } else if (jA != -1) {
                                        j6 = (jA - position2) - ((long) i10);
                                        j7 = jA;
                                    } else {
                                        ox1Var = null;
                                    }
                                    long j18 = j6;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j18, 8000000L, jS, roundingMode2)), ek5.i1(le6.b(j18, j5, roundingMode2)), false, true);
                                } else {
                                    ox1Var = null;
                                }
                            }
                        }
                        su6Var2 = this.k;
                        position3 = ks3Var.getPosition();
                        if (su6Var2 == null) {
                            ov6Var = null;
                        } else {
                            aVarArr = su6Var2.a;
                            length = aVarArr.length;
                            i16 = i7;
                            while (true) {
                                if (i16 < length) {
                                    aVar3 = null;
                                    break;
                                }
                                aVar6 = aVarArr[i16];
                                if (nv6.class.isAssignableFrom(aVar6.getClass())) {
                                    aVar3 = (su6.a) nv6.class.cast(aVar6);
                                    if (!h78.t.apply(aVar3)) {
                                        aVar3 = null;
                                    }
                                } else {
                                    aVar3 = null;
                                }
                                if (aVar3 != null) {
                                    break;
                                }
                                i16++;
                            }
                            nv6Var = (nv6) aVar3;
                            if (nv6Var == null) {
                                ov6Var = null;
                            } else {
                                iArr = nv6Var.e;
                                aVarArr2 = su6Var2.a;
                                length2 = aVarArr2.length;
                                i17 = 0;
                                while (true) {
                                    if (i17 < length2) {
                                        aVar4 = null;
                                        break;
                                    }
                                    aVar5 = aVarArr2[i17];
                                    if (rha.class.isAssignableFrom(aVar5.getClass())) {
                                        aVar4 = (su6.a) rha.class.cast(aVar5);
                                        if (!((rha) aVar4).a.equals("TLEN")) {
                                            aVar4 = null;
                                        }
                                    } else {
                                        aVar4 = null;
                                    }
                                    if (aVar4 != null) {
                                        break;
                                    }
                                    i17++;
                                }
                                rhaVar = (rha) aVar4;
                                if (rhaVar == null) {
                                    jN = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    jN = n6b.N(Long.parseLong(rhaVar.c.get(0)));
                                }
                                length3 = iArr.length;
                                int i23 = length3 + 1;
                                jArr3 = new long[i23];
                                jArr4 = new long[i23];
                                jArr3[c] = position3;
                                jArr4[c] = 0;
                                j8 = 0;
                                i18 = 1;
                                while (i18 <= length3) {
                                    int i24 = i18 - 1;
                                    long j19 = position3 + ((long) (nv6Var.c + iArr[i24]));
                                    j8 += (long) (nv6Var.d + nv6Var.f[i24]);
                                    jArr3[i18] = j19;
                                    jArr4[i18] = j8;
                                    i18++;
                                    length3 = length3;
                                    position3 = j19;
                                }
                                ov6Var = new ov6(jN, jArr3, jArr4);
                            }
                        }
                        if (this.s) {
                            aVar7 = new d99.a(-9223372036854775807L);
                            pt7Var = pt7Var;
                            lj4Var = lj4Var;
                            aVar = aVar2;
                            z3 = true;
                            i21 = 0;
                        } else {
                            j2 = -9223372036854775807L;
                            if (ov6Var != null) {
                                ox1Var = ov6Var;
                            } else if (ox1Var == null) {
                                ox1Var = null;
                            }
                            if (ox1Var == null) {
                                int i25 = i7;
                                ks3Var.n(pt7Var.a, i25, 4);
                                pt7Var.M(i25);
                                aVar2.a(pt7Var.m());
                                aVar = aVar2;
                                z2 = true;
                                i21 = 0;
                                ox1Var = new ox1(ks3Var.a(), ks3Var.getPosition(), aVar2.f, aVar2.c, false, true);
                            } else {
                                aVar = aVar2;
                                z2 = true;
                                i21 = 0;
                            }
                            ox1Var.b();
                            ox1Var.b();
                            this.h.d(ox1Var.g());
                            aVar7 = ox1Var;
                            z3 = z2;
                        }
                        this.r = aVar7;
                        this.g.t(aVar7);
                        su6VarB = this.k;
                        su6Var3 = this.l;
                        if (su6VarB != null) {
                            if (su6Var3 != null) {
                                su6VarB = su6VarB.b(su6Var3);
                            }
                            su6Var3 = su6VarB;
                        }
                        aVar8 = new id4.a();
                        aVar8.m = fv6.n("audio/mpeg");
                        aVar8.n = fv6.n(aVar.b);
                        aVar8.o = 4096;
                        aVar8.F = aVar.e;
                        aVar8.G = aVar.d;
                        aVar8.I = lj4Var.a;
                        aVar8.J = lj4Var.b;
                        aVar8.k = su6Var3;
                        if (this.r.f() != -2147483647) {
                            aVar8.h = this.r.f();
                        }
                        this.i.g(new id4(aVar8));
                        this.o = ks3Var.getPosition();
                        j3 = 0;
                        r4 = z3;
                    } else if (i4 == 1) {
                        i5 = 13;
                    }
                    i6 = i5;
                    j2 = -9223372036854775807L;
                    if (pt7Var2.c >= i6 + 4) {
                        pt7Var2.M(i6);
                        iM2 = pt7Var2.m();
                        if (iM2 != 1483304551) {
                            if (pt7Var2.c >= 40) {
                                pt7Var2.M(36);
                                if (pt7Var2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (pt7Var2.c >= 40) {
                        pt7Var2.M(36);
                        if (pt7Var2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    lj4Var = this.d;
                    if (iM2 == 1231971951) {
                        aVar2 = aVar11;
                        i7 = 0;
                        iM3 = pt7Var2.m();
                        if ((iM3 & 1) != 0) {
                            iD = pt7Var2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = pt7Var2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = pt7Var2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            pt7Var2.N(4);
                        }
                        if (pt7Var2.a() >= 24) {
                            pt7Var2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                            int iG8 = pt7Var2.G();
                            int iG9 = pt7Var2.G();
                            aVarA = qz6.a.a(iG8);
                            aVarA2 = qz6.a.a(iG9);
                            if (fIntBitsToFloat > 0.0f) {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            } else {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            }
                            pt7Var2.N(2);
                            int iC3 = pt7Var2.C();
                            i9 = (16773120 & iC3) >> 12;
                            i8 = iC3 & 4095;
                        } else {
                            qz6Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = aVar2.c;
                        i11 = aVar2.d;
                        i12 = aVar2.f;
                        i13 = aVar2.g;
                        qz6Var2 = qz6Var;
                        if (lj4Var.a != -1) {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        } else {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        }
                        if (qz6Var2 != null) {
                            su6Var = new su6(qz6Var2);
                        } else {
                            su6Var = null;
                        }
                        this.l = su6Var;
                        position2 = ks3Var.getPosition();
                        ks3Var.m(aVar2.c);
                        if (iM2 == 1483304551) {
                            jA2 = ks3Var.a();
                            if (j5 != -1) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = -9223372036854775807L;
                            }
                            if (jS2 == -9223372036854775807L) {
                                ox1Var = null;
                            } else {
                                if (jMin != -1) {
                                    long j110 = jA2 - position2;
                                    StringBuilder sbB5 = ao3.b("Data size mismatch between stream (", j110, ") and Xing frame (");
                                    sbB5.append(jMin);
                                    sbB5.append("), using smaller value.");
                                    md6.f("XingSeeker", sbB5.toString());
                                    jMin = Math.min(jMin, j110);
                                }
                                ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                            }
                        } else {
                            jA = ks3Var.a();
                            if (j5 != -1) {
                            }
                            if (jS != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j111 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j111;
                                } else if (jA != -1) {
                                    j6 = (jA - position2) - ((long) i10);
                                    j7 = jA;
                                } else {
                                    ox1Var = null;
                                }
                                long j112 = j6;
                                RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j112, 8000000L, jS, roundingMode3)), ek5.i1(le6.b(j112, j5, roundingMode3)), false, true);
                            } else {
                                ox1Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        jA3 = ks3Var.a();
                        position4 = ks3Var.getPosition();
                        pt7Var2.N(6);
                        int iM6 = pt7Var2.m();
                        i7 = 0;
                        j9 = position4 + ((long) aVar11.c);
                        j10 = j9 + ((long) iM6);
                        iM4 = pt7Var2.m();
                        if (iM4 <= 0) {
                            jS3 = n6b.S(aVar11.d, (((long) iM4) * ((long) aVar11.g)) - 1);
                            iG = pt7Var2.G();
                            iG2 = pt7Var2.G();
                            iG3 = pt7Var2.G();
                            pt7Var2.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            aVar9 = aVar11;
                            j11 = position4 + ((long) aVar11.c);
                            i19 = 0;
                            while (true) {
                                if (i19 < iG) {
                                    long[] jArr11 = jArr5;
                                    long[] jArr12 = jArr6;
                                    a07.a aVar13 = aVar9;
                                    if (jA3 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbB6 = ao3.b("VBRI bytes and ToC mismatch (using max): ", j12, ", ");
                                        sbB6.append(j11);
                                        sbB6.append("\nSeeking will be inaccurate.");
                                        md6.g("VbriSeeker", sbB6.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    aVar2 = aVar13;
                                    ox1Var = new ncb(jArr11, jArr12, jS3, j9, jMax, aVar2.f);
                                    break;
                                }
                                long[] jArr13 = jArr6;
                                aVar10 = aVar9;
                                int i26 = i19;
                                long[] jArr14 = jArr5;
                                jArr14[i26] = (((long) i19) * jS3) / ((long) iG);
                                jArr13[i26] = j11;
                                if (iG3 != 1) {
                                    iZ = pt7Var2.z();
                                } else if (iG3 != 2) {
                                    iZ = pt7Var2.G();
                                } else if (iG3 != 3) {
                                    iZ = pt7Var2.C();
                                } else {
                                    if (iG3 != 4) {
                                        ox1Var = null;
                                        aVar2 = aVar10;
                                        break;
                                    }
                                    iZ = pt7Var2.D();
                                }
                                j11 += ((long) iZ) * ((long) iG2);
                                i19 = i26 + 1;
                                jArr6 = jArr13;
                                aVar9 = aVar10;
                                jArr5 = jArr14;
                            }
                        } else {
                            ox1Var = null;
                            aVar2 = aVar11;
                        }
                        ks3Var.m(aVar2.c);
                    } else if (iM2 != 1483304551) {
                        ks3Var.l();
                        ox1Var = null;
                        aVar2 = aVar11;
                        i7 = 0;
                    } else {
                        aVar2 = aVar11;
                        i7 = 0;
                        iM3 = pt7Var2.m();
                        if ((iM3 & 1) != 0) {
                            iD = pt7Var2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = pt7Var2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = pt7Var2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            pt7Var2.N(4);
                        }
                        if (pt7Var2.a() >= 24) {
                            pt7Var2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                            int iG10 = pt7Var2.G();
                            int iG11 = pt7Var2.G();
                            aVarA = qz6.a.a(iG10);
                            aVarA2 = qz6.a.a(iG11);
                            if (fIntBitsToFloat > 0.0f) {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            } else {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            }
                            pt7Var2.N(2);
                            int iC4 = pt7Var2.C();
                            i9 = (16773120 & iC4) >> 12;
                            i8 = iC4 & 4095;
                        } else {
                            qz6Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = aVar2.c;
                        i11 = aVar2.d;
                        i12 = aVar2.f;
                        i13 = aVar2.g;
                        qz6Var2 = qz6Var;
                        if (lj4Var.a != -1) {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        } else {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        }
                        if (qz6Var2 != null) {
                            su6Var = new su6(qz6Var2);
                        } else {
                            su6Var = null;
                        }
                        this.l = su6Var;
                        position2 = ks3Var.getPosition();
                        ks3Var.m(aVar2.c);
                        if (iM2 == 1483304551) {
                            jA2 = ks3Var.a();
                            if (j5 != -1) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = -9223372036854775807L;
                            }
                            if (jS2 == -9223372036854775807L) {
                                ox1Var = null;
                            } else {
                                if (jMin != -1) {
                                    long j113 = jA2 - position2;
                                    StringBuilder sbB7 = ao3.b("Data size mismatch between stream (", j113, ") and Xing frame (");
                                    sbB7.append(jMin);
                                    sbB7.append("), using smaller value.");
                                    md6.f("XingSeeker", sbB7.toString());
                                    jMin = Math.min(jMin, j113);
                                }
                                ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                            }
                        } else {
                            jA = ks3Var.a();
                            if (j5 != -1) {
                            }
                            if (jS != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j114 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j114;
                                } else if (jA != -1) {
                                    j6 = (jA - position2) - ((long) i10);
                                    j7 = jA;
                                } else {
                                    ox1Var = null;
                                }
                                long j115 = j6;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j115, 8000000L, jS, roundingMode4)), ek5.i1(le6.b(j115, j5, roundingMode4)), false, true);
                            } else {
                                ox1Var = null;
                            }
                        }
                    }
                    su6Var2 = this.k;
                    position3 = ks3Var.getPosition();
                    if (su6Var2 == null) {
                        ov6Var = null;
                    } else {
                        aVarArr = su6Var2.a;
                        length = aVarArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length) {
                                aVar3 = null;
                                break;
                            }
                            aVar6 = aVarArr[i16];
                            if (nv6.class.isAssignableFrom(aVar6.getClass())) {
                                aVar3 = (su6.a) nv6.class.cast(aVar6);
                                if (!h78.t.apply(aVar3)) {
                                    aVar3 = null;
                                }
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        nv6Var = (nv6) aVar3;
                        if (nv6Var == null) {
                            ov6Var = null;
                        } else {
                            iArr = nv6Var.e;
                            aVarArr2 = su6Var2.a;
                            length2 = aVarArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length2) {
                                    aVar4 = null;
                                    break;
                                }
                                aVar5 = aVarArr2[i17];
                                if (rha.class.isAssignableFrom(aVar5.getClass())) {
                                    aVar4 = (su6.a) rha.class.cast(aVar5);
                                    if (!((rha) aVar4).a.equals("TLEN")) {
                                        aVar4 = null;
                                    }
                                } else {
                                    aVar4 = null;
                                }
                                if (aVar4 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            rhaVar = (rha) aVar4;
                            if (rhaVar == null) {
                                jN = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jN = n6b.N(Long.parseLong(rhaVar.c.get(0)));
                            }
                            length3 = iArr.length;
                            int i27 = length3 + 1;
                            jArr3 = new long[i27];
                            jArr4 = new long[i27];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length3) {
                                int i28 = i18 - 1;
                                long j116 = position3 + ((long) (nv6Var.c + iArr[i28]));
                                j8 += (long) (nv6Var.d + nv6Var.f[i28]);
                                jArr3[i18] = j116;
                                jArr4[i18] = j8;
                                i18++;
                                length3 = length3;
                                position3 = j116;
                            }
                            ov6Var = new ov6(jN, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        aVar7 = new d99.a(-9223372036854775807L);
                        pt7Var = pt7Var;
                        lj4Var = lj4Var;
                        aVar = aVar2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (ov6Var != null) {
                            ox1Var = ov6Var;
                        } else if (ox1Var == null) {
                            ox1Var = null;
                        }
                        if (ox1Var == null) {
                            int i29 = i7;
                            ks3Var.n(pt7Var.a, i29, 4);
                            pt7Var.M(i29);
                            aVar2.a(pt7Var.m());
                            aVar = aVar2;
                            z2 = true;
                            i21 = 0;
                            ox1Var = new ox1(ks3Var.a(), ks3Var.getPosition(), aVar2.f, aVar2.c, false, true);
                        } else {
                            aVar = aVar2;
                            z2 = true;
                            i21 = 0;
                        }
                        ox1Var.b();
                        ox1Var.b();
                        this.h.d(ox1Var.g());
                        aVar7 = ox1Var;
                        z3 = z2;
                    }
                    this.r = aVar7;
                    this.g.t(aVar7);
                    su6VarB = this.k;
                    su6Var3 = this.l;
                    if (su6VarB != null) {
                        if (su6Var3 != null) {
                            su6VarB = su6VarB.b(su6Var3);
                        }
                        su6Var3 = su6VarB;
                    }
                    aVar8 = new id4.a();
                    aVar8.m = fv6.n("audio/mpeg");
                    aVar8.n = fv6.n(aVar.b);
                    aVar8.o = 4096;
                    aVar8.F = aVar.e;
                    aVar8.G = aVar.d;
                    aVar8.I = lj4Var.a;
                    aVar8.J = lj4Var.b;
                    aVar8.k = su6Var3;
                    if (this.r.f() != -2147483647) {
                        aVar8.h = this.r.f();
                    }
                    this.i.g(new id4(aVar8));
                    this.o = ks3Var.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else {
                    aVar = aVar11;
                    pt7Var = pt7Var;
                    z = true;
                    th = null;
                    j = 1000000;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (this.o != 0) {
                        position = ks3Var.getPosition();
                        j4 = this.o;
                        if (position < j4) {
                            r4 = z;
                            r4 = z;
                            ks3Var.m((int) (j4 - position));
                            r4 = z;
                        }
                    }
                }
                r4 = z;
                r4 = z;
                r4 = z;
                if (this.q == 0) {
                    ks3Var.l();
                    if (i(ks3Var)) {
                        i = -1;
                        i21 = -1;
                    } else {
                        pt7Var.M(i21);
                        iM = pt7Var.m();
                        if (((-128000) & iM) == (((long) this.j) & (-128000)) || a07.a(iM) == -1) {
                            ks3Var.m(r4);
                            this.j = i21;
                        } else {
                            aVar.a(iM);
                            if (this.m == j2) {
                                this.m = this.r.c(ks3Var.getPosition());
                                long j20 = this.a;
                                if (j20 != j2) {
                                    this.m = (j20 - this.r.c(j3)) + this.m;
                                }
                            }
                            this.q = aVar.c;
                            this.p = ks3Var.getPosition() + ((long) aVar.c);
                            if (this.r instanceof ra5) {
                                long j21 = ((this.n + ((long) aVar.g)) * j) / ((long) aVar.d);
                                throw th;
                            }
                            iF = this.i.f(ks3Var, this.q, r4);
                            if (iF == -1) {
                                i = -1;
                                i21 = -1;
                            } else {
                                i2 = this.q - iF;
                                this.q = i2;
                                if (i2 <= 0) {
                                    this.i.a(this.m + ((this.n * j) / ((long) aVar.d)), 1, aVar.c, 0, null);
                                    this.n += (long) aVar.g;
                                    this.q = i21;
                                }
                            }
                        }
                        i = -1;
                    }
                } else {
                    iF = this.i.f(ks3Var, this.q, r4);
                    if (iF == -1) {
                        i = -1;
                        i21 = -1;
                    } else {
                        i2 = this.q - iF;
                        this.q = i2;
                        if (i2 <= 0) {
                            this.i.a(this.m + ((this.n * j) / ((long) aVar.d)), 1, aVar.c, 0, null);
                            this.n += (long) aVar.g;
                            this.q = i21;
                        }
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                aVar = aVar11;
                th = null;
                i = -1;
                i21 = -1;
                j = 1000000;
            }
        } else {
            d99Var = this.r;
            pt7Var = this.b;
            if (d99Var == null) {
                pt7Var2 = new pt7(aVar11.c);
                th = null;
                ks3Var.n(pt7Var2.a, 0, aVar11.c);
                i3 = aVar11.a & 1;
                i4 = aVar11.e;
                i5 = 21;
                j = 1000000;
                if (i3 != 0) {
                    if (i4 != 1) {
                        i6 = 36;
                    }
                    j2 = -9223372036854775807L;
                    if (pt7Var2.c >= i6 + 4) {
                        pt7Var2.M(i6);
                        iM2 = pt7Var2.m();
                        if (iM2 != 1483304551) {
                            if (pt7Var2.c >= 40) {
                                pt7Var2.M(36);
                                if (pt7Var2.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (pt7Var2.c >= 40) {
                        pt7Var2.M(36);
                        if (pt7Var2.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    lj4Var = this.d;
                    if (iM2 == 1231971951) {
                        aVar2 = aVar11;
                        i7 = 0;
                        iM3 = pt7Var2.m();
                        if ((iM3 & 1) != 0) {
                            iD = pt7Var2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = pt7Var2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = pt7Var2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            pt7Var2.N(4);
                        }
                        if (pt7Var2.a() >= 24) {
                            pt7Var2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                            int iG12 = pt7Var2.G();
                            int iG13 = pt7Var2.G();
                            aVarA = qz6.a.a(iG12);
                            aVarA2 = qz6.a.a(iG13);
                            if (fIntBitsToFloat > 0.0f) {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            } else {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            }
                            pt7Var2.N(2);
                            int iC5 = pt7Var2.C();
                            i9 = (16773120 & iC5) >> 12;
                            i8 = iC5 & 4095;
                        } else {
                            qz6Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = aVar2.c;
                        i11 = aVar2.d;
                        i12 = aVar2.f;
                        i13 = aVar2.g;
                        qz6Var2 = qz6Var;
                        if (lj4Var.a != -1) {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        } else {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        }
                        if (qz6Var2 != null) {
                            su6Var = new su6(qz6Var2);
                        } else {
                            su6Var = null;
                        }
                        this.l = su6Var;
                        position2 = ks3Var.getPosition();
                        ks3Var.m(aVar2.c);
                        if (iM2 == 1483304551) {
                            jA2 = ks3Var.a();
                            if (j5 != -1) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = -9223372036854775807L;
                            }
                            if (jS2 == -9223372036854775807L) {
                                ox1Var = null;
                            } else {
                                if (jMin != -1) {
                                    long j117 = jA2 - position2;
                                    StringBuilder sbB8 = ao3.b("Data size mismatch between stream (", j117, ") and Xing frame (");
                                    sbB8.append(jMin);
                                    sbB8.append("), using smaller value.");
                                    md6.f("XingSeeker", sbB8.toString());
                                    jMin = Math.min(jMin, j117);
                                }
                                ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                            }
                        } else {
                            jA = ks3Var.a();
                            if (j5 != -1) {
                            }
                            if (jS != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j118 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j118;
                                } else if (jA != -1) {
                                    j6 = (jA - position2) - ((long) i10);
                                    j7 = jA;
                                } else {
                                    ox1Var = null;
                                }
                                long j119 = j6;
                                RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                                ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j119, 8000000L, jS, roundingMode5)), ek5.i1(le6.b(j119, j5, roundingMode5)), false, true);
                            } else {
                                ox1Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        jA3 = ks3Var.a();
                        position4 = ks3Var.getPosition();
                        pt7Var2.N(6);
                        int iM7 = pt7Var2.m();
                        i7 = 0;
                        j9 = position4 + ((long) aVar11.c);
                        j10 = j9 + ((long) iM7);
                        iM4 = pt7Var2.m();
                        if (iM4 <= 0) {
                            jS3 = n6b.S(aVar11.d, (((long) iM4) * ((long) aVar11.g)) - 1);
                            iG = pt7Var2.G();
                            iG2 = pt7Var2.G();
                            iG3 = pt7Var2.G();
                            pt7Var2.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            aVar9 = aVar11;
                            j11 = position4 + ((long) aVar11.c);
                            i19 = 0;
                            while (true) {
                                if (i19 < iG) {
                                    long[] jArr15 = jArr5;
                                    long[] jArr16 = jArr6;
                                    a07.a aVar14 = aVar9;
                                    if (jA3 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbB9 = ao3.b("VBRI bytes and ToC mismatch (using max): ", j12, ", ");
                                        sbB9.append(j11);
                                        sbB9.append("\nSeeking will be inaccurate.");
                                        md6.g("VbriSeeker", sbB9.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    aVar2 = aVar14;
                                    ox1Var = new ncb(jArr15, jArr16, jS3, j9, jMax, aVar2.f);
                                    break;
                                }
                                long[] jArr17 = jArr6;
                                aVar10 = aVar9;
                                int i210 = i19;
                                long[] jArr18 = jArr5;
                                jArr18[i210] = (((long) i19) * jS3) / ((long) iG);
                                jArr17[i210] = j11;
                                if (iG3 != 1) {
                                    iZ = pt7Var2.z();
                                } else if (iG3 != 2) {
                                    iZ = pt7Var2.G();
                                } else if (iG3 != 3) {
                                    iZ = pt7Var2.C();
                                } else {
                                    if (iG3 != 4) {
                                        ox1Var = null;
                                        aVar2 = aVar10;
                                        break;
                                    }
                                    iZ = pt7Var2.D();
                                }
                                j11 += ((long) iZ) * ((long) iG2);
                                i19 = i210 + 1;
                                jArr6 = jArr17;
                                aVar9 = aVar10;
                                jArr5 = jArr18;
                            }
                        } else {
                            ox1Var = null;
                            aVar2 = aVar11;
                        }
                        ks3Var.m(aVar2.c);
                    } else if (iM2 != 1483304551) {
                        ks3Var.l();
                        ox1Var = null;
                        aVar2 = aVar11;
                        i7 = 0;
                    } else {
                        aVar2 = aVar11;
                        i7 = 0;
                        iM3 = pt7Var2.m();
                        if ((iM3 & 1) != 0) {
                            iD = pt7Var2.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jMin = pt7Var2.B();
                        } else {
                            jMin = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = pt7Var2.z();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iM3 & 8) != 0) {
                            pt7Var2.N(4);
                        }
                        if (pt7Var2.a() >= 24) {
                            pt7Var2.N(11);
                            fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                            int iG14 = pt7Var2.G();
                            int iG15 = pt7Var2.G();
                            aVarA = qz6.a.a(iG14);
                            aVarA2 = qz6.a.a(iG15);
                            if (fIntBitsToFloat > 0.0f) {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            } else {
                                qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                            }
                            pt7Var2.N(2);
                            int iC6 = pt7Var2.C();
                            i9 = (16773120 & iC6) >> 12;
                            i8 = iC6 & 4095;
                        } else {
                            qz6Var = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iD;
                        i10 = aVar2.c;
                        i11 = aVar2.d;
                        i12 = aVar2.f;
                        i13 = aVar2.g;
                        qz6Var2 = qz6Var;
                        if (lj4Var.a != -1) {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        } else {
                            lj4Var.a = i9;
                            lj4Var.b = i8;
                        }
                        if (qz6Var2 != null) {
                            su6Var = new su6(qz6Var2);
                        } else {
                            su6Var = null;
                        }
                        this.l = su6Var;
                        position2 = ks3Var.getPosition();
                        ks3Var.m(aVar2.c);
                        if (iM2 == 1483304551) {
                            jA2 = ks3Var.a();
                            if (j5 != -1) {
                                jS2 = -9223372036854775807L;
                            } else {
                                jS2 = -9223372036854775807L;
                            }
                            if (jS2 == -9223372036854775807L) {
                                ox1Var = null;
                            } else {
                                if (jMin != -1) {
                                    long j1110 = jA2 - position2;
                                    StringBuilder sbB10 = ao3.b("Data size mismatch between stream (", j1110, ") and Xing frame (");
                                    sbB10.append(jMin);
                                    sbB10.append("), using smaller value.");
                                    md6.f("XingSeeker", sbB10.toString());
                                    jMin = Math.min(jMin, j1110);
                                }
                                ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                            }
                        } else {
                            jA = ks3Var.a();
                            if (j5 != -1) {
                            }
                            if (jS != -9223372036854775807L) {
                                if (jMin != -1) {
                                    long j1111 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                    j7 = j1111;
                                } else if (jA != -1) {
                                    j6 = (jA - position2) - ((long) i10);
                                    j7 = jA;
                                } else {
                                    ox1Var = null;
                                }
                                long j1112 = j6;
                                RoundingMode roundingMode6 = RoundingMode.HALF_UP;
                                ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j1112, 8000000L, jS, roundingMode6)), ek5.i1(le6.b(j1112, j5, roundingMode6)), false, true);
                            } else {
                                ox1Var = null;
                            }
                        }
                    }
                    su6Var2 = this.k;
                    position3 = ks3Var.getPosition();
                    if (su6Var2 == null) {
                        ov6Var = null;
                    } else {
                        aVarArr = su6Var2.a;
                        length = aVarArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length) {
                                aVar3 = null;
                                break;
                            }
                            aVar6 = aVarArr[i16];
                            if (nv6.class.isAssignableFrom(aVar6.getClass())) {
                                aVar3 = (su6.a) nv6.class.cast(aVar6);
                                if (!h78.t.apply(aVar3)) {
                                    aVar3 = null;
                                }
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        nv6Var = (nv6) aVar3;
                        if (nv6Var == null) {
                            ov6Var = null;
                        } else {
                            iArr = nv6Var.e;
                            aVarArr2 = su6Var2.a;
                            length2 = aVarArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length2) {
                                    aVar4 = null;
                                    break;
                                }
                                aVar5 = aVarArr2[i17];
                                if (rha.class.isAssignableFrom(aVar5.getClass())) {
                                    aVar4 = (su6.a) rha.class.cast(aVar5);
                                    if (!((rha) aVar4).a.equals("TLEN")) {
                                        aVar4 = null;
                                    }
                                } else {
                                    aVar4 = null;
                                }
                                if (aVar4 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            rhaVar = (rha) aVar4;
                            if (rhaVar == null) {
                                jN = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jN = n6b.N(Long.parseLong(rhaVar.c.get(0)));
                            }
                            length3 = iArr.length;
                            int i211 = length3 + 1;
                            jArr3 = new long[i211];
                            jArr4 = new long[i211];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length3) {
                                int i212 = i18 - 1;
                                long j1113 = position3 + ((long) (nv6Var.c + iArr[i212]));
                                j8 += (long) (nv6Var.d + nv6Var.f[i212]);
                                jArr3[i18] = j1113;
                                jArr4[i18] = j8;
                                i18++;
                                length3 = length3;
                                position3 = j1113;
                            }
                            ov6Var = new ov6(jN, jArr3, jArr4);
                        }
                    }
                    if (this.s) {
                        aVar7 = new d99.a(-9223372036854775807L);
                        pt7Var = pt7Var;
                        lj4Var = lj4Var;
                        aVar = aVar2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (ov6Var != null) {
                            ox1Var = ov6Var;
                        } else if (ox1Var == null) {
                            ox1Var = null;
                        }
                        if (ox1Var == null) {
                            int i213 = i7;
                            ks3Var.n(pt7Var.a, i213, 4);
                            pt7Var.M(i213);
                            aVar2.a(pt7Var.m());
                            aVar = aVar2;
                            z2 = true;
                            i21 = 0;
                            ox1Var = new ox1(ks3Var.a(), ks3Var.getPosition(), aVar2.f, aVar2.c, false, true);
                        } else {
                            aVar = aVar2;
                            z2 = true;
                            i21 = 0;
                        }
                        ox1Var.b();
                        ox1Var.b();
                        this.h.d(ox1Var.g());
                        aVar7 = ox1Var;
                        z3 = z2;
                    }
                    this.r = aVar7;
                    this.g.t(aVar7);
                    su6VarB = this.k;
                    su6Var3 = this.l;
                    if (su6VarB != null) {
                        if (su6Var3 != null) {
                            su6VarB = su6VarB.b(su6Var3);
                        }
                        su6Var3 = su6VarB;
                    }
                    aVar8 = new id4.a();
                    aVar8.m = fv6.n("audio/mpeg");
                    aVar8.n = fv6.n(aVar.b);
                    aVar8.o = 4096;
                    aVar8.F = aVar.e;
                    aVar8.G = aVar.d;
                    aVar8.I = lj4Var.a;
                    aVar8.J = lj4Var.b;
                    aVar8.k = su6Var3;
                    if (this.r.f() != -2147483647) {
                        aVar8.h = this.r.f();
                    }
                    this.i.g(new id4(aVar8));
                    this.o = ks3Var.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else if (i4 == 1) {
                    i5 = 13;
                }
                i6 = i5;
                j2 = -9223372036854775807L;
                if (pt7Var2.c >= i6 + 4) {
                    pt7Var2.M(i6);
                    iM2 = pt7Var2.m();
                    if (iM2 != 1483304551) {
                        if (pt7Var2.c >= 40) {
                            pt7Var2.M(36);
                            if (pt7Var2.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (pt7Var2.c >= 40) {
                    pt7Var2.M(36);
                    if (pt7Var2.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                lj4Var = this.d;
                if (iM2 == 1231971951) {
                    aVar2 = aVar11;
                    i7 = 0;
                    iM3 = pt7Var2.m();
                    if ((iM3 & 1) != 0) {
                        iD = pt7Var2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = pt7Var2.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = pt7Var2.z();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        pt7Var2.N(4);
                    }
                    if (pt7Var2.a() >= 24) {
                        pt7Var2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                        int iG16 = pt7Var2.G();
                        int iG17 = pt7Var2.G();
                        aVarA = qz6.a.a(iG16);
                        aVarA2 = qz6.a.a(iG17);
                        if (fIntBitsToFloat > 0.0f) {
                            qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                        } else {
                            qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                        }
                        pt7Var2.N(2);
                        int iC7 = pt7Var2.C();
                        i9 = (16773120 & iC7) >> 12;
                        i8 = iC7 & 4095;
                    } else {
                        qz6Var = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iD;
                    i10 = aVar2.c;
                    i11 = aVar2.d;
                    i12 = aVar2.f;
                    i13 = aVar2.g;
                    qz6Var2 = qz6Var;
                    if (lj4Var.a != -1) {
                        lj4Var.a = i9;
                        lj4Var.b = i8;
                    } else {
                        lj4Var.a = i9;
                        lj4Var.b = i8;
                    }
                    if (qz6Var2 != null) {
                        su6Var = new su6(qz6Var2);
                    } else {
                        su6Var = null;
                    }
                    this.l = su6Var;
                    position2 = ks3Var.getPosition();
                    ks3Var.m(aVar2.c);
                    if (iM2 == 1483304551) {
                        jA2 = ks3Var.a();
                        if (j5 != -1) {
                            jS2 = -9223372036854775807L;
                        } else {
                            jS2 = -9223372036854775807L;
                        }
                        if (jS2 == -9223372036854775807L) {
                            ox1Var = null;
                        } else {
                            if (jMin != -1) {
                                long j1114 = jA2 - position2;
                                StringBuilder sbB11 = ao3.b("Data size mismatch between stream (", j1114, ") and Xing frame (");
                                sbB11.append(jMin);
                                sbB11.append("), using smaller value.");
                                md6.f("XingSeeker", sbB11.toString());
                                jMin = Math.min(jMin, j1114);
                            }
                            ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                        }
                    } else {
                        jA = ks3Var.a();
                        if (j5 != -1) {
                        }
                        if (jS != -9223372036854775807L) {
                            if (jMin != -1) {
                                long j1115 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                                j7 = j1115;
                            } else if (jA != -1) {
                                j6 = (jA - position2) - ((long) i10);
                                j7 = jA;
                            } else {
                                ox1Var = null;
                            }
                            long j1116 = j6;
                            RoundingMode roundingMode7 = RoundingMode.HALF_UP;
                            ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j1116, 8000000L, jS, roundingMode7)), ek5.i1(le6.b(j1116, j5, roundingMode7)), false, true);
                        } else {
                            ox1Var = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    jA3 = ks3Var.a();
                    position4 = ks3Var.getPosition();
                    pt7Var2.N(6);
                    int iM8 = pt7Var2.m();
                    i7 = 0;
                    j9 = position4 + ((long) aVar11.c);
                    j10 = j9 + ((long) iM8);
                    iM4 = pt7Var2.m();
                    if (iM4 <= 0) {
                        jS3 = n6b.S(aVar11.d, (((long) iM4) * ((long) aVar11.g)) - 1);
                        iG = pt7Var2.G();
                        iG2 = pt7Var2.G();
                        iG3 = pt7Var2.G();
                        pt7Var2.N(2);
                        jArr5 = new long[iG];
                        jArr6 = new long[iG];
                        aVar9 = aVar11;
                        j11 = position4 + ((long) aVar11.c);
                        i19 = 0;
                        while (true) {
                            if (i19 < iG) {
                                long[] jArr19 = jArr5;
                                long[] jArr110 = jArr6;
                                a07.a aVar15 = aVar9;
                                if (jA3 != -1) {
                                    j12 = j10;
                                } else {
                                    j12 = j10;
                                }
                                if (j12 != j11) {
                                    StringBuilder sbB12 = ao3.b("VBRI bytes and ToC mismatch (using max): ", j12, ", ");
                                    sbB12.append(j11);
                                    sbB12.append("\nSeeking will be inaccurate.");
                                    md6.g("VbriSeeker", sbB12.toString());
                                    jMax = Math.max(j12, j11);
                                } else {
                                    jMax = j12;
                                }
                                aVar2 = aVar15;
                                ox1Var = new ncb(jArr19, jArr110, jS3, j9, jMax, aVar2.f);
                                break;
                            }
                            long[] jArr111 = jArr6;
                            aVar10 = aVar9;
                            int i214 = i19;
                            long[] jArr112 = jArr5;
                            jArr112[i214] = (((long) i19) * jS3) / ((long) iG);
                            jArr111[i214] = j11;
                            if (iG3 != 1) {
                                iZ = pt7Var2.z();
                            } else if (iG3 != 2) {
                                iZ = pt7Var2.G();
                            } else if (iG3 != 3) {
                                iZ = pt7Var2.C();
                            } else {
                                if (iG3 != 4) {
                                    ox1Var = null;
                                    aVar2 = aVar10;
                                    break;
                                }
                                iZ = pt7Var2.D();
                            }
                            j11 += ((long) iZ) * ((long) iG2);
                            i19 = i214 + 1;
                            jArr6 = jArr111;
                            aVar9 = aVar10;
                            jArr5 = jArr112;
                        }
                    } else {
                        ox1Var = null;
                        aVar2 = aVar11;
                    }
                    ks3Var.m(aVar2.c);
                } else if (iM2 != 1483304551) {
                    ks3Var.l();
                    ox1Var = null;
                    aVar2 = aVar11;
                    i7 = 0;
                } else {
                    aVar2 = aVar11;
                    i7 = 0;
                    iM3 = pt7Var2.m();
                    if ((iM3 & 1) != 0) {
                        iD = pt7Var2.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jMin = pt7Var2.B();
                    } else {
                        jMin = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = pt7Var2.z();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM3 & 8) != 0) {
                        pt7Var2.N(4);
                    }
                    if (pt7Var2.a() >= 24) {
                        pt7Var2.N(11);
                        fIntBitsToFloat = Float.intBitsToFloat(pt7Var2.m());
                        int iG18 = pt7Var2.G();
                        int iG19 = pt7Var2.G();
                        aVarA = qz6.a.a(iG18);
                        aVarA2 = qz6.a.a(iG19);
                        if (fIntBitsToFloat > 0.0f) {
                            qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                        } else {
                            qz6Var = new qz6(fIntBitsToFloat, aVarA, aVarA2);
                        }
                        pt7Var2.N(2);
                        int iC8 = pt7Var2.C();
                        i9 = (16773120 & iC8) >> 12;
                        i8 = iC8 & 4095;
                    } else {
                        qz6Var = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iD;
                    i10 = aVar2.c;
                    i11 = aVar2.d;
                    i12 = aVar2.f;
                    i13 = aVar2.g;
                    qz6Var2 = qz6Var;
                    if (lj4Var.a != -1) {
                        lj4Var.a = i9;
                        lj4Var.b = i8;
                    } else {
                        lj4Var.a = i9;
                        lj4Var.b = i8;
                    }
                    if (qz6Var2 != null) {
                        su6Var = new su6(qz6Var2);
                    } else {
                        su6Var = null;
                    }
                    this.l = su6Var;
                    position2 = ks3Var.getPosition();
                    ks3Var.m(aVar2.c);
                    if (iM2 == 1483304551) {
                        jA2 = ks3Var.a();
                        if (j5 != -1) {
                            jS2 = -9223372036854775807L;
                        } else {
                            jS2 = -9223372036854775807L;
                        }
                        if (jS2 == -9223372036854775807L) {
                            ox1Var = null;
                        } else {
                            if (jMin != -1) {
                                long j1117 = jA2 - position2;
                                StringBuilder sbB13 = ao3.b("Data size mismatch between stream (", j1117, ") and Xing frame (");
                                sbB13.append(jMin);
                                sbB13.append("), using smaller value.");
                                md6.f("XingSeeker", sbB13.toString());
                                jMin = Math.min(jMin, j1117);
                            }
                            ox1Var = new jrb(position2, i10, jS2, i12, jMin, jArr);
                        }
                    } else {
                        jA = ks3Var.a();
                        if (j5 != -1) {
                        }
                        if (jS != -9223372036854775807L) {
                            if (jMin != -1) {
                                long j1118 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                                j7 = j1118;
                            } else if (jA != -1) {
                                j6 = (jA - position2) - ((long) i10);
                                j7 = jA;
                            } else {
                                ox1Var = null;
                            }
                            long j1119 = j6;
                            RoundingMode roundingMode8 = RoundingMode.HALF_UP;
                            ox1Var = new ox1(j7, position2 + ((long) i10), ek5.i1(n6b.U(j1119, 8000000L, jS, roundingMode8)), ek5.i1(le6.b(j1119, j5, roundingMode8)), false, true);
                        } else {
                            ox1Var = null;
                        }
                    }
                }
                su6Var2 = this.k;
                position3 = ks3Var.getPosition();
                if (su6Var2 == null) {
                    ov6Var = null;
                } else {
                    aVarArr = su6Var2.a;
                    length = aVarArr.length;
                    i16 = i7;
                    while (true) {
                        if (i16 < length) {
                            aVar3 = null;
                            break;
                        }
                        aVar6 = aVarArr[i16];
                        if (nv6.class.isAssignableFrom(aVar6.getClass())) {
                            aVar3 = (su6.a) nv6.class.cast(aVar6);
                            if (!h78.t.apply(aVar3)) {
                                aVar3 = null;
                            }
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            break;
                            break;
                        }
                        i16++;
                    }
                    nv6Var = (nv6) aVar3;
                    if (nv6Var == null) {
                        ov6Var = null;
                    } else {
                        iArr = nv6Var.e;
                        aVarArr2 = su6Var2.a;
                        length2 = aVarArr2.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length2) {
                                aVar4 = null;
                                break;
                            }
                            aVar5 = aVarArr2[i17];
                            if (rha.class.isAssignableFrom(aVar5.getClass())) {
                                aVar4 = (su6.a) rha.class.cast(aVar5);
                                if (!((rha) aVar4).a.equals("TLEN")) {
                                    aVar4 = null;
                                }
                            } else {
                                aVar4 = null;
                            }
                            if (aVar4 != null) {
                                break;
                                break;
                            }
                            i17++;
                        }
                        rhaVar = (rha) aVar4;
                        if (rhaVar == null) {
                            jN = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jN = n6b.N(Long.parseLong(rhaVar.c.get(0)));
                        }
                        length3 = iArr.length;
                        int i215 = length3 + 1;
                        jArr3 = new long[i215];
                        jArr4 = new long[i215];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j8 = 0;
                        i18 = 1;
                        while (i18 <= length3) {
                            int i216 = i18 - 1;
                            long j11110 = position3 + ((long) (nv6Var.c + iArr[i216]));
                            j8 += (long) (nv6Var.d + nv6Var.f[i216]);
                            jArr3[i18] = j11110;
                            jArr4[i18] = j8;
                            i18++;
                            length3 = length3;
                            position3 = j11110;
                        }
                        ov6Var = new ov6(jN, jArr3, jArr4);
                    }
                }
                if (this.s) {
                    aVar7 = new d99.a(-9223372036854775807L);
                    pt7Var = pt7Var;
                    lj4Var = lj4Var;
                    aVar = aVar2;
                    z3 = true;
                    i21 = 0;
                } else {
                    j2 = -9223372036854775807L;
                    if (ov6Var != null) {
                        ox1Var = ov6Var;
                    } else if (ox1Var == null) {
                        ox1Var = null;
                    }
                    if (ox1Var == null) {
                        int i217 = i7;
                        ks3Var.n(pt7Var.a, i217, 4);
                        pt7Var.M(i217);
                        aVar2.a(pt7Var.m());
                        aVar = aVar2;
                        z2 = true;
                        i21 = 0;
                        ox1Var = new ox1(ks3Var.a(), ks3Var.getPosition(), aVar2.f, aVar2.c, false, true);
                    } else {
                        aVar = aVar2;
                        z2 = true;
                        i21 = 0;
                    }
                    ox1Var.b();
                    ox1Var.b();
                    this.h.d(ox1Var.g());
                    aVar7 = ox1Var;
                    z3 = z2;
                }
                this.r = aVar7;
                this.g.t(aVar7);
                su6VarB = this.k;
                su6Var3 = this.l;
                if (su6VarB != null) {
                    if (su6Var3 != null) {
                        su6VarB = su6VarB.b(su6Var3);
                    }
                    su6Var3 = su6VarB;
                }
                aVar8 = new id4.a();
                aVar8.m = fv6.n("audio/mpeg");
                aVar8.n = fv6.n(aVar.b);
                aVar8.o = 4096;
                aVar8.F = aVar.e;
                aVar8.G = aVar.d;
                aVar8.I = lj4Var.a;
                aVar8.J = lj4Var.b;
                aVar8.k = su6Var3;
                if (this.r.f() != -2147483647) {
                    aVar8.h = this.r.f();
                }
                this.i.g(new id4(aVar8));
                this.o = ks3Var.getPosition();
                j3 = 0;
                r4 = z3;
            } else {
                aVar = aVar11;
                pt7Var = pt7Var;
                z = true;
                th = null;
                j = 1000000;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (this.o != 0) {
                    position = ks3Var.getPosition();
                    j4 = this.o;
                    if (position < j4) {
                        r4 = z;
                        r4 = z;
                        ks3Var.m((int) (j4 - position));
                        r4 = z;
                    }
                }
            }
            r4 = z;
            r4 = z;
            r4 = z;
            if (this.q == 0) {
                ks3Var.l();
                if (i(ks3Var)) {
                    i = -1;
                    i21 = -1;
                } else {
                    pt7Var.M(i21);
                    iM = pt7Var.m();
                    if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                    }
                    ks3Var.m(r4);
                    this.j = i21;
                    i = -1;
                }
            } else {
                iF = this.i.f(ks3Var, this.q, r4);
                if (iF == -1) {
                    i = -1;
                    i21 = -1;
                } else {
                    i2 = this.q - iF;
                    this.q = i2;
                    if (i2 <= 0) {
                        this.i.a(this.m + ((this.n * j) / ((long) aVar.d)), 1, aVar.c, 0, null);
                        this.n += (long) aVar.g;
                        this.q = i21;
                    }
                    i = -1;
                }
            }
        }
        if (i21 == i) {
            d99 d99Var2 = this.r;
            if (d99Var2 instanceof ra5) {
                if (d99Var2.g() != ((this.n * j) / ((long) aVar.d)) + this.m) {
                    ((ra5) this.r).getClass();
                    throw th;
                }
            }
        }
        return i21;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        return j(ks3Var, true);
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        if (this.r instanceof ra5) {
            throw null;
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.g = ls3Var;
        hsa hsaVarP = ls3Var.p(0, 1);
        this.h = hsaVarP;
        this.i = hsaVarP;
        this.g.k();
    }

    public final void h() {
        t89 t89Var = this.r;
        if ((t89Var instanceof ox1) && ((nx1) t89Var).b()) {
            long j = this.p;
            if (j == -1 || j == this.r.a()) {
                return;
            }
            ox1 ox1Var = (ox1) this.r;
            this.r = new ox1(this.p, ox1Var.i, ox1Var.j, ox1Var.k, ox1Var.l, false);
            ls3 ls3Var = this.g;
            ls3Var.getClass();
            ls3Var.t(this.r);
            hsa hsaVar = this.h;
            hsaVar.getClass();
            hsaVar.d(this.r.g());
        }
    }

    public final boolean i(ks3 ks3Var) {
        d99 d99Var = this.r;
        if (d99Var != null) {
            long jA = d99Var.a();
            if (jA == -1 || ks3Var.g() <= jA - 4) {
            }
            return true;
        }
        try {
            return !ks3Var.f(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean j(ks3 ks3Var, boolean z) throws EOFException {
        int iG;
        int i;
        int iA;
        ks3Var.l();
        if (ks3Var.getPosition() == 0) {
            su6 su6VarA = this.e.a(ks3Var, null, 131072);
            this.k = su6VarA;
            if (su6VarA != null) {
                this.d.b(su6VarA);
            }
            iG = (int) ks3Var.g();
            if (!z) {
                ks3Var.m(iG);
            }
            i = 0;
        } else {
            iG = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (i(ks3Var)) {
                if (i2 > 0) {
                    break;
                }
                h();
                throw new EOFException();
            }
            pt7 pt7Var = this.b;
            pt7Var.M(0);
            int iM = pt7Var.m();
            if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iA = a07.a(iM)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iM);
                    i = iM;
                }
                ks3Var.h(iA - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    h();
                    throw new EOFException();
                }
                if (z) {
                    ks3Var.l();
                    ks3Var.h(iG + i4);
                } else {
                    ks3Var.m(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            ks3Var.m(iG + i3);
        } else {
            ks3Var.l();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.js3
    public final void a() {
    }

    public pz6(int i) {
        this(-9223372036854775807L);
    }
}
