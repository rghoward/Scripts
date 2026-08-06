package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n16 {
    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final int c(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x054f  */
    /* JADX WARN: Code duplicated, block: B:281:0x056c A[LOOP:23: B:280:0x056a->B:281:0x056c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:284:0x0578  */
    /* JADX WARN: Code duplicated, block: B:286:0x057b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0586  */
    /* JADX WARN: Code duplicated, block: B:290:0x059c  */
    /* JADX WARN: Code duplicated, block: B:291:0x059e  */
    /* JADX WARN: Code duplicated, block: B:302:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:304:0x05de  */
    /* JADX WARN: Code duplicated, block: B:306:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:308:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:310:0x0602  */
    /* JADX WARN: Code duplicated, block: B:311:0x0605  */
    /* JADX WARN: Code duplicated, block: B:314:0x061e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0656  */
    /* JADX WARN: Code duplicated, block: B:327:0x0659  */
    /* JADX WARN: Code duplicated, block: B:329:0x0663  */
    /* JADX WARN: Code duplicated, block: B:330:0x0666  */
    /* JADX WARN: Code duplicated, block: B:332:0x0669 A[LOOP:43: B:326:0x0657->B:332:0x0669, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:336:0x0679  */
    /* JADX WARN: Code duplicated, block: B:340:0x0695 A[LOOP:26: B:315:0x0622->B:340:0x0695, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:343:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:344:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:347:0x06bb A[LOOP:27: B:346:0x06b9->B:347:0x06bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:351:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:355:0x06db  */
    /* JADX WARN: Code duplicated, block: B:357:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:358:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:360:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:367:0x072a  */
    /* JADX WARN: Code duplicated, block: B:369:0x072e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0740 A[LOOP:31: B:372:0x073e->B:373:0x0740, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:375:0x0754 A[LOOP:29: B:350:0x06c9->B:375:0x0754, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:378:0x0778  */
    /* JADX WARN: Code duplicated, block: B:379:0x077b  */
    /* JADX WARN: Code duplicated, block: B:430:0x0856 A[LOOP:33: B:401:0x07db->B:430:0x0856, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:431:0x0862  */
    /* JADX WARN: Code duplicated, block: B:434:0x0875  */
    /* JADX WARN: Code duplicated, block: B:436:0x0883  */
    /* JADX WARN: Code duplicated, block: B:438:0x088a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:439:0x088c  */
    /* JADX WARN: Code duplicated, block: B:441:0x0893  */
    /* JADX WARN: Code duplicated, block: B:444:0x089e A[LOOP:36: B:440:0x0891->B:444:0x089e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:453:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:457:0x08c8 A[LOOP:37: B:454:0x08c0->B:457:0x08c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:461:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:466:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:469:0x090c  */
    /* JADX WARN: Code duplicated, block: B:472:0x0930  */
    /* JADX WARN: Code duplicated, block: B:474:0x0940  */
    /* JADX WARN: Code duplicated, block: B:477:0x0948  */
    /* JADX WARN: Code duplicated, block: B:479:0x094b A[LOOP:38: B:475:0x0944->B:479:0x094b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x0951  */
    /* JADX WARN: Code duplicated, block: B:484:0x097a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0988 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:487:0x098a  */
    /* JADX WARN: Code duplicated, block: B:489:0x098e  */
    /* JADX WARN: Code duplicated, block: B:492:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:493:0x09af  */
    /* JADX WARN: Code duplicated, block: B:495:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:497:0x09ba A[LOOP:39: B:496:0x09b8->B:497:0x09ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:499:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:502:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:505:0x09df A[LOOP:40: B:501:0x09d6->B:505:0x09df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:508:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:510:0x09ee A[LOOP:41: B:507:0x09e6->B:510:0x09ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:515:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:615:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x06b0 A[EDGE_INSN: B:616:0x06b0->B:342:0x06b0 BREAK  A[LOOP:26: B:315:0x0622->B:340:0x0695], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0764 A[EDGE_INSN: B:619:0x0764->B:376:0x0764 BREAK  A[LOOP:28: B:349:0x06c8->B:621:0x06c8, LOOP_LABEL: LOOP:28: B:349:0x06c8->B:621:0x06c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0702 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x086c A[EDGE_INSN: B:634:0x086c->B:432:0x086c BREAK  A[LOOP:33: B:401:0x07db->B:430:0x0856], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x08a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0883 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x08cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x094e A[EDGE_INSN: B:644:0x094e->B:480:0x094e BREAK  A[LOOP:38: B:475:0x0944->B:479:0x094b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x09e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x09f4 A[EDGE_INSN: B:647:0x09f4->B:512:0x09f4 BREAK  A[LOOP:40: B:501:0x09d6->B:505:0x09df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x09f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x066c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final q16 d(k16 k16Var, int i, int[] iArr, int[] iArr2, boolean z) {
        long j;
        c26 c26Var;
        boolean z2;
        h30[] h30VarArr;
        int iA;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        k16 k16Var2;
        int i8;
        int i9;
        int[] iArr4;
        int i10;
        c26 c26Var2;
        float fFloatValue;
        final tw5 tw5Var;
        float f;
        float f2;
        float f3;
        int[] iArrCopyOf;
        int length;
        int i11;
        int i12;
        int i13;
        long j2;
        int iG;
        int i14;
        int iG2;
        int i15;
        int i16;
        int iMin;
        int i17;
        int size;
        int i18;
        List<Integer> list;
        x06 x06Var;
        int[] iArr5;
        List arrayList;
        List list2;
        int i19;
        int i20;
        ArrayList arrayList2;
        int i21;
        int i22;
        float f4;
        int i23;
        s16 s16Var;
        int i24;
        int[] iArr6;
        c26 c26Var3;
        h16 h16Var;
        ArrayList arrayList3;
        int size2;
        List arrayList4;
        int i25;
        int i26;
        int[] iArr7;
        final ArrayList arrayList5;
        ArrayList arrayList6;
        c26 c26Var4;
        vv5<s16> vv5Var;
        int i27;
        kw5 kw5VarA;
        j16 j16Var;
        boolean z3;
        int i28;
        boolean zP0;
        boolean z4;
        int[] iArr8;
        int i29;
        int length2;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z5;
        int i36;
        long jB;
        int i37;
        int iG3;
        int iF;
        int i38;
        int size3;
        int i39;
        int i40;
        int i41;
        int i42;
        int iIntValue;
        int i43;
        h16 h16Var2;
        int iF2;
        int[] iArr9;
        int length3;
        int i44;
        int i45;
        int i46;
        int size4;
        int i47;
        List<w06> list3;
        w06 w06Var;
        int index;
        int iMin2;
        w06 w06Var2;
        int i48;
        int i49;
        int i50;
        s16 s16Var2;
        int i51;
        int iC;
        int[] iArr10;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        s16 s16Var3;
        int i58;
        int i59;
        int i60;
        int iIntValue2;
        int i61;
        int iF3;
        int i62;
        s16 s16Var4;
        int i63;
        int i64;
        int i65;
        h30 h30Var;
        int iD;
        int i66;
        int i67;
        int i68;
        int[] iArrE;
        int i69;
        int i70;
        int i71;
        int i72;
        int[] iArrE2;
        int[] iArr11;
        k16Var = k16Var;
        x16 x16Var = k16Var.d;
        List<Integer> list4 = k16Var.b;
        int i73 = k16Var.k;
        List<w06> list5 = k16Var.o;
        int i74 = k16Var.l;
        boolean z6 = k16Var.f;
        c26 c26Var5 = k16Var.a;
        int i75 = k16Var.s;
        int i76 = k16Var.h;
        int i77 = k16Var.j;
        j16 j16Var2 = k16Var.q;
        List<w06> list6 = list5;
        long j3 = k16Var.e;
        h16 h16Var3 = k16Var.r;
        tw5 tw5Var2 = k16Var.g;
        x16 x16Var2 = x16Var;
        x06 x06Var2 = k16Var.c;
        List<Integer> list7 = list4;
        int iB = x06Var2.b();
        if3 if3Var = if3.t;
        List list8 = hf3.t;
        if (iB <= 0 || i75 == 0) {
            int iJ = xx1.j(j3);
            int i78 = xx1.i(j3);
            c26Var5.t.d(0, iJ, i78, new ArrayList(), j16Var2.c.a(), k16Var.q, k16Var.f, tw5Var2.u.P0(), k16Var.s, k16Var.n, 0, 0, k16Var.m, k16Var.p);
            if (tw5Var2.u.P0()) {
                j = j3;
            } else {
                long jB2 = c26Var5.t.b();
                if (kg5.b(jB2, 0L)) {
                    j = j3;
                } else {
                    j = j3;
                    iJ = zx1.g((int) (jB2 >> 32), j);
                    i78 = zx1.f((int) (jB2 & 4294967295L), j);
                }
            }
            gl6 gl6VarY0 = tw5Var2.y0(iJ, i78, if3Var, new mn1(2));
            boolean z7 = k16Var.f;
            long j4 = (((long) xx1.j(j)) << 32) | (((long) xx1.i(j)) & 4294967295L);
            int i79 = k16Var.j;
            int i80 = k16Var.k;
            return new q16(iArr, iArr2, 0.0f, gl6VarY0, 0.0f, false, z7, false, k16Var.d, x06Var2.h(), tw5Var2, iB, list8, j4, -i79, i80 + i76, i79, i80, k16Var.l, k16Var.m);
        }
        int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length);
        int[] iArrCopyOf3 = Arrays.copyOf(iArr2, iArr2.length);
        int length4 = iArrCopyOf2.length - 1;
        if (length4 >= 0) {
            while (true) {
                int i81 = length4 - 1;
                while (true) {
                    int i82 = iArrCopyOf2[length4];
                    if (i82 < iB && h16Var3.a(i82, length4)) {
                        break;
                    }
                    c26 c26Var6 = c26Var5;
                    tw5 tw5Var3 = tw5Var2;
                    iArrCopyOf2[length4] = h16Var3.d(iArrCopyOf2[length4], length4);
                    c26Var5 = c26Var6;
                    tw5Var2 = tw5Var3;
                }
                int i83 = iArrCopyOf2[length4];
                c26Var = c26Var5;
                if (i83 >= 0) {
                    x06Var2.h().a(i83);
                    if (h16Var3.f(i83) == -2) {
                        int length5 = iArrCopyOf2.length;
                        int i84 = 0;
                        while (true) {
                            if (i84 >= length5) {
                                i84 = -1;
                                break;
                            }
                            int i85 = length5;
                            if (iArrCopyOf2[i84] == i83) {
                                break;
                            }
                            i84++;
                            length5 = i85;
                        }
                        int i86 = i84 + 1;
                        int i87 = i84;
                        if (i86 <= length4) {
                            while (true) {
                                if (iArrCopyOf2[i86] == i83) {
                                    iArrCopyOf2[i86] = h16Var3.d(i83, i86);
                                }
                                if (i86 == length4) {
                                    break;
                                }
                                i86++;
                            }
                        }
                        length4 = i87;
                    }
                    h16Var3.i(i83, length4);
                }
                if (i81 < 0) {
                    break;
                }
                length4 = i81;
                c26Var5 = c26Var;
                tw5Var2 = tw5Var2;
            }
        } else {
            c26Var = c26Var5;
            tw5Var2 = tw5Var2;
        }
        f(iArrCopyOf3, -i);
        h30[] h30VarArr2 = new h30[i75];
        for (int i88 = 0; i88 < i75; i88++) {
            h30VarArr2[i88] = new h30(16);
        }
        f(iArrCopyOf3, -i77);
        boolean z8 = false;
        loop5: while (true) {
            int length6 = iArrCopyOf2.length;
            int i89 = 0;
            while (true) {
                if (i89 >= length6) {
                    z2 = z8;
                    h30VarArr = h30VarArr2;
                    iA = -1;
                    break loop5;
                }
                int i90 = iArrCopyOf2[i89];
                z2 = z8;
                h30VarArr = h30VarArr2;
                if (iArrCopyOf3[i89] >= Math.max(-i74, 0) || i90 <= 0) {
                    i89++;
                    z8 = z2;
                    i75 = i75;
                    iB = iB;
                    h30VarArr2 = h30VarArr;
                    i76 = i76;
                }
            }
            iA = a(iArrCopyOf2);
            int i91 = iArrCopyOf2[iA];
            int length7 = iArrCopyOf3.length;
            int i92 = 0;
            while (i92 < length7) {
                int i93 = length7;
                if (iArrCopyOf2[i92] != iArrCopyOf2[iA]) {
                    int i94 = iArrCopyOf3[i92];
                    int i95 = iArrCopyOf3[iA];
                    if (i94 < i95) {
                        iArrCopyOf3[i92] = i95;
                    }
                }
                i92++;
                length7 = i93;
            }
            int iD2 = h16Var3.d(i91, iA);
            if (iD2 < 0) {
                break;
            }
            int i96 = iB;
            long jA = k16Var.a(x06Var2, iD2, iA);
            int i97 = i75;
            int i98 = (int) (jA & 4294967295L);
            int i99 = i76;
            int i100 = (int) (jA >> 32);
            int i101 = i98 - i100;
            h16Var3.i(iD2, i101 != 1 ? -2 : i100);
            s16 s16VarV = j16Var2.v(iD2, jA);
            int iC2 = c(iArrCopyOf3, jA);
            int[] iArrE3 = i101 != 1 ? h16Var3.e(iD2) : null;
            boolean z9 = z2;
            while (i100 < i98) {
                iArrCopyOf2[i100] = iD2;
                int i102 = i97;
                int i103 = s16VarV.n + iC2 + (iArrE3 == null ? 0 : iArrE3[i100]);
                iArrCopyOf3[i100] = i103;
                if (i99 + i103 <= 0) {
                    z9 = true;
                }
                i100++;
                i97 = i102;
            }
            i75 = i97;
            z8 = z9;
            iB = i96;
            h30VarArr2 = h30VarArr;
            i76 = i99;
        }
        int i104 = iB;
        int i105 = i75;
        int i106 = i76;
        int i107 = -i77;
        int i108 = iArrCopyOf3[0];
        if (i108 < i107) {
            int i109 = i107 - i108;
            f(iArrCopyOf3, i109);
            i2 = i - i109;
        } else {
            i2 = i;
        }
        f(iArrCopyOf3, i77);
        int i110 = -1;
        if (iA == -1) {
            int length8 = iArrCopyOf2.length;
            int i111 = 0;
            while (true) {
                if (i111 >= length8) {
                    i111 = -1;
                    break;
                }
                if (iArrCopyOf2[i111] == 0) {
                    break;
                }
                i111++;
            }
            iA = i111;
            i110 = -1;
        }
        if (iA != i110 && e(iArrCopyOf2, k16Var, iArrCopyOf3, iA) && z) {
            h16Var3.g();
            int length9 = iArrCopyOf2.length;
            int[] iArr12 = new int[length9];
            int i112 = 0;
            while (i112 < length9) {
                iArr12[i112] = i110;
                i112++;
                i110 = -1;
            }
            int length10 = iArrCopyOf3.length;
            int[] iArr13 = new int[length10];
            for (int i113 = 0; i113 < length10; i113++) {
                iArr13[i113] = iArrCopyOf3[iA];
            }
            return d(k16Var, i2, iArr12, iArr13, false);
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArrCopyOf2, iArrCopyOf2.length);
        int length11 = iArrCopyOf3.length;
        int[] iArr14 = new int[length11];
        for (int i114 = 0; i114 < length11; i114++) {
            iArr14[i114] = -iArrCopyOf3[i114];
        }
        int i115 = i74 + i107;
        int i116 = i73 + i106;
        int i117 = i116 < 0 ? 0 : i116;
        int iB2 = b(iArrCopyOf4);
        boolean z10 = z2;
        int i118 = i107;
        int i119 = 0;
        while (true) {
            i3 = i2;
            if (iB2 == -1) {
                i4 = i105;
                break;
            }
            i4 = i105;
            if (i119 >= i4) {
                break;
            }
            int i120 = i119;
            int i121 = iArrCopyOf4[iB2];
            iArrCopyOf2 = iArrCopyOf2;
            int length12 = iArrCopyOf4.length;
            iArrCopyOf3 = iArrCopyOf3;
            i77 = i77;
            int i122 = Integer.MAX_VALUE;
            int i123 = 0;
            iB2 = -1;
            while (i123 < length12) {
                int i124 = length12;
                int i125 = i121 + 1;
                int i126 = i123;
                int i127 = iArrCopyOf4[i126];
                if (i125 <= i127 && i127 < i122) {
                    i122 = i127;
                    iB2 = i126;
                }
                i123 = i126 + 1;
                length12 = i124;
            }
            int i128 = i120 + 1;
            if (i121 >= 0) {
                long jA2 = k16Var.a(x06Var2, i121, iB2);
                s16 s16VarV2 = j16Var2.v(i121, jA2);
                j16 j16Var3 = j16Var2;
                int i129 = (int) (jA2 & 4294967295L);
                int[] iArr15 = iArrCopyOf4;
                int i130 = (int) (jA2 >> 32);
                int i131 = i129 - i130;
                h16Var3.i(i121, i131 != 1 ? -2 : i130);
                int iC3 = c(iArr14, jA2);
                for (int i132 = i130; i132 < i129; i132++) {
                    iArr14[i132] = s16VarV2.n + iC3;
                    iArr15[i132] = i121;
                    h30VarArr[i132].addLast(s16VarV2);
                }
                if (iC3 < i115 && iArr14[i130] <= i115) {
                    s16VarV2.l = false;
                    z10 = true;
                }
                if (i131 != 1) {
                    i105 = i4;
                    i119 = i105;
                } else {
                    i119 = i128;
                    i105 = i4;
                }
                iArrCopyOf4 = iArr15;
                j16Var2 = j16Var3;
            } else {
                k16Var = k16Var;
                i119 = i128;
                iArrCopyOf3 = iArrCopyOf3;
                i105 = i4;
            }
            i2 = i3;
        }
        int[] iArr16 = iArrCopyOf3;
        int[] iArr17 = iArrCopyOf2;
        int i133 = i77;
        j16 j16Var4 = j16Var2;
        int[] iArr18 = iArrCopyOf4;
        loop16: while (true) {
            int i134 = 0;
            while (true) {
                if (i134 >= length11) {
                    for (int i135 = 0; i135 < i4; i135++) {
                        if (!h30VarArr[i135].isEmpty()) {
                            i5 = i104;
                            i6 = 1;
                            break loop16;
                        }
                    }
                    break;
                }
                int i136 = iArr14[i134];
                if (i136 < i117 || i136 <= 0) {
                    break;
                }
                i134++;
            }
            int iB3 = b(iArr14);
            i6 = 1;
            int iB4 = u30.B(iArr18) + 1;
            i5 = i104;
            if (iB4 >= i5) {
                break;
            }
            x06 x06Var3 = x06Var2;
            int i137 = i4;
            if3 if3Var2 = if3Var;
            c26 c26Var7 = c26Var;
            tw5 tw5Var4 = tw5Var2;
            int i138 = i106;
            int i139 = i133;
            j16 j16Var5 = j16Var4;
            int i140 = length11;
            int[] iArr19 = iArr14;
            int[] iArr20 = iArr18;
            int i141 = i117;
            List<w06> list9 = list6;
            List<Integer> list10 = list7;
            int i142 = i3;
            int[] iArr21 = iArr16;
            h16 h16Var4 = h16Var3;
            long jA3 = k16Var.a(x06Var3, iB4, iB3);
            int i143 = i74;
            int i144 = (int) (jA3 & 4294967295L);
            int i145 = (int) (jA3 >> 32);
            int i146 = i144 - i145;
            h16Var4.i(iB4, i146 != 1 ? -2 : i145);
            s16 s16VarV3 = j16Var5.v(iB4, jA3);
            int iC4 = c(iArr19, jA3);
            if (i146 != 1) {
                iArrE2 = h16Var4.e(iB4);
                i72 = i137;
                if (iArrE2 == null) {
                    iArrE2 = new int[i72];
                }
            } else {
                i72 = i137;
                iArrE2 = null;
            }
            int i147 = i72;
            int i148 = i145;
            while (i148 < i144) {
                if (iArrE2 != null) {
                    iArrE2[i148] = iC4 - iArr19[i148];
                }
                iArr20[i148] = iB4;
                int i149 = i148;
                iArr19[i149] = s16VarV3.n + iC4;
                h30VarArr[i149].addLast(s16VarV3);
                i148 = i149 + 1;
            }
            h30<h16.a> h30Var2 = h16Var4.c;
            int iH = h16.h(iB4, h30Var2);
            if (iH < 0) {
                if (iArrE2 != null) {
                    h30Var2.add(-(iH + 1), new h16.a(iArrE2, iB4));
                }
            } else if (iArrE2 == null) {
                h30Var2.e(iH);
            } else {
                h30Var2.get(iH).b = iArrE2;
            }
            if (iC4 < i115) {
                iArr11 = iArr19;
                iArr11 = iArr19;
                iArr11 = iArr19;
                if (iArr11[i145] <= i115) {
                    iArr11 = iArr19;
                    s16VarV3.l = false;
                } else {
                    iArr11 = iArr19;
                }
            } else {
                iArr11 = iArr19;
                iArr11 = iArr19;
                iArr11 = iArr19;
                iArr11 = iArr19;
            }
            h16Var3 = h16Var4;
            iArr16 = iArr21;
            i74 = i143;
            length11 = i140;
            iArr14 = iArr11;
            j16Var4 = j16Var5;
            c26Var = c26Var7;
            list6 = list9;
            i106 = i138;
            iArr18 = iArr20;
            x06Var2 = x06Var3;
            i4 = i147;
            if3Var = if3Var2;
            i133 = i139;
            i104 = i5;
            i3 = i142;
            list7 = list10;
            i117 = i141;
            tw5Var2 = tw5Var4;
        }
        int i150 = 0;
        while (i150 < i4) {
            h30 h30Var3 = h30VarArr[i150];
            while (h30Var3.d() > i6 && !((s16) h30Var3.first()).l) {
                s16 s16Var5 = (s16) h30Var3.removeFirst();
                int[] iArrE4 = s16Var5.f != i6 ? h16Var3.e(s16Var5.a) : null;
                iArr16[i150] = iArr16[i150] - (s16Var5.n + (iArrE4 == null ? 0 : iArrE4[i150]));
                i6 = 1;
            }
            s16 s16Var6 = (s16) h30Var3.j();
            iArr17[i150] = s16Var6 != null ? s16Var6.a : -1;
            i150++;
            i6 = 1;
        }
        for (int i151 : iArr18) {
            if (i151 == i5 - 1) {
                f(iArr14, -i74);
                break;
            }
        }
        int i152 = 0;
        while (true) {
            if (i152 >= length11) {
                i7 = i106;
                int i153 = i7 - iArr14[a(iArr14)];
                iArr3 = iArr16;
                f(iArr3, -i153);
                f(iArr14, i153);
                boolean z11 = false;
                loop44: while (true) {
                    int length13 = iArr3.length;
                    int i154 = 0;
                    while (true) {
                        if (i154 >= length13) {
                            k16Var2 = k16Var;
                            i8 = i133;
                            i9 = i3;
                            iArr4 = iArr17;
                            break loop44;
                        }
                        int i155 = length13;
                        i8 = i133;
                        if (iArr3[i154] < i8) {
                            break;
                        }
                        i154++;
                        x06Var2 = x06Var2;
                        i133 = i8;
                        iArr17 = iArr17;
                        length13 = i155;
                        i153 = i153;
                        i3 = i3;
                        length11 = length11;
                    }
                    int iB5 = b(iArr3);
                    int iA2 = a(iArr17);
                    boolean z12 = z11;
                    if (iB5 != iA2) {
                        if (iArr3[iB5] == iArr3[iA2]) {
                            z11 = z12;
                            iB5 = iA2;
                        } else {
                            iB5 = iB5;
                            z11 = true;
                        }
                    }
                    int i156 = iArr17[iB5];
                    boolean z13 = z11;
                    if (i156 == -1) {
                        i156 = i5;
                    }
                    int iD3 = h16Var3.d(i156, iB5);
                    if (iD3 < 0) {
                        k16Var2 = k16Var;
                        int[] iArr22 = iArr17;
                        if ((!z13 && !e(iArr22, k16Var2, iArr3, iB5)) || !z) {
                            i9 = i3;
                            iArr4 = iArr22;
                            z11 = z13;
                            break;
                        }
                        h16Var3.g();
                        int length14 = iArr22.length;
                        int[] iArr23 = new int[length14];
                        for (int i157 = 0; i157 < length14; i157++) {
                            iArr23[i157] = -1;
                        }
                        int length15 = iArr3.length;
                        int[] iArr24 = new int[length15];
                        for (int i158 = 0; i158 < length15; i158++) {
                            iArr24[i158] = iArr3[iB5];
                        }
                        return d(k16Var2, i3, iArr23, iArr24, false);
                    }
                    int i159 = length11;
                    int[] iArr25 = iArr18;
                    int i160 = i3;
                    int i161 = i153;
                    int[] iArr26 = iArr17;
                    int i162 = i117;
                    long jA4 = k16Var.a(x06Var2, iD3, iB5);
                    int i163 = i5;
                    x06 x06Var4 = x06Var2;
                    int i164 = (int) (jA4 & 4294967295L);
                    int i165 = i4;
                    int i166 = (int) (jA4 >> 32);
                    int i167 = i164 - i166;
                    h16Var3.i(iD3, i167 != 1 ? -2 : i166);
                    j16 j16Var6 = j16Var4;
                    s16 s16VarV4 = j16Var6.v(iD3, jA4);
                    int iC5 = c(iArr3, jA4);
                    int[] iArrE5 = i167 != 1 ? h16Var3.e(iD3) : null;
                    boolean z14 = z13;
                    int i168 = i166;
                    while (i168 < i164) {
                        int i169 = i168;
                        if (iArr3[i169] != iC5) {
                            z14 = true;
                        }
                        h30VarArr[i169].addFirst(s16VarV4);
                        iArr26[i169] = iD3;
                        iArr3[i169] = s16VarV4.n + iC5 + (iArrE5 == null ? 0 : iArrE5[i169]);
                        i168 = i169 + 1;
                    }
                    i5 = i163;
                    j16Var4 = j16Var6;
                    z11 = z14;
                    i117 = i162;
                    iArr18 = iArr25;
                    x06Var2 = x06Var4;
                    i4 = i165;
                    i133 = i8;
                    iArr17 = iArr26;
                    i153 = i161;
                    i3 = i160;
                    length11 = i159;
                }
                if (!z11 || !z) {
                    i10 = i9 + i153;
                    int i170 = iArr3[b(iArr3)];
                    if (i170 < 0) {
                        i10 += i170;
                        f(iArr14, i170);
                        f(iArr3, -i170);
                    }
                    break;
                }
                h16Var3.g();
                return d(k16Var2, i9, iArr4, iArr3, false);
            }
            i7 = i106;
            if (iArr14[i152] >= i7) {
                k16Var2 = k16Var;
                i10 = i3;
                iArr3 = iArr16;
                i5 = i5;
                x06Var2 = x06Var2;
                i4 = i4;
                length11 = length11;
                iArr4 = iArr17;
                i8 = i133;
                j16Var4 = j16Var4;
                i9 = i10;
                iArr18 = iArr18;
                i117 = i117;
                break;
            }
            i152++;
            i106 = i7;
        }
        g4a g4aVar = tw5Var2.u;
        g4a g4aVar2 = tw5Var2.u;
        if (!g4aVar.P0()) {
            c26Var2 = c26Var;
            if (c26Var2.a) {
                fFloatValue = ((Number) c26Var2.w.b.u.getValue()).floatValue();
            }
            tw5Var = tw5Var2;
            if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10) || Math.abs(Math.round(fFloatValue)) < Math.abs(i10)) {
                f = fFloatValue;
            } else {
                f = i10;
            }
            f2 = fFloatValue - f;
            f3 = 0.0f;
            if (g4aVar2.P0() && i10 > i9 && f2 <= 0.0f) {
                f3 = (i10 - i9) + f2;
            }
            iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
            length = iArrCopyOf.length;
            for (i11 = 0; i11 < length; i11++) {
                iArrCopyOf[i11] = -iArrCopyOf[i11];
            }
            i12 = i4;
            if (i8 > i74) {
                i65 = 0;
                while (i65 < i12) {
                    h30Var = h30VarArr[i65];
                    iD = h30Var.d();
                    int i171 = i8;
                    i66 = 0;
                    while (true) {
                        if (i66 < iD) {
                            i67 = i65;
                            break;
                        }
                        i67 = i65;
                        s16 s16Var7 = (s16) h30Var.get(i66);
                        i68 = iD;
                        iArrE = h16Var3.e(s16Var7.a);
                        int i172 = s16Var7.n;
                        if (iArrE == null) {
                            i69 = 0;
                        } else {
                            i69 = iArrE[i67];
                        }
                        i70 = i172 + i69;
                        if (i66 == h30Var.size() - 1 || (i71 = iArr3[i67]) == 0 || i71 < i70) {
                            break;
                        }
                        iArr3[i67] = i71 - i70;
                        i66++;
                        iArr4[i67] = ((s16) h30Var.get(i66)).a;
                        iD = i68;
                        i65 = i67;
                    }
                    i65 = i67 + 1;
                    i8 = i171;
                }
            }
            int i173 = i8;
            i13 = i73 + i173;
            if (z6) {
                iG = xx1.h(j3);
                j2 = j3;
            } else {
                j2 = j3;
                iG = zx1.g(u30.B(iArr14) + i13, j2);
            }
            i14 = iG;
            if (z6) {
                iG2 = zx1.f(u30.B(iArr14) + i13, j2);
            } else {
                iG2 = xx1.g(j2);
            }
            i15 = iG2;
            if (z6) {
                i16 = i15;
            } else {
                i16 = i14;
            }
            iMin = i73 + (Math.min(i16, i7) - i173);
            i17 = iArrCopyOf[0];
            size = list7.size() - 1;
            if (size >= 0) {
                i59 = size;
                arrayList = null;
                while (true) {
                    i60 = i59 - 1;
                    i18 = i13;
                    list = list7;
                    iIntValue2 = list.get(i59).intValue();
                    i61 = i17;
                    iF3 = h16Var3.f(iIntValue2);
                    iArr5 = iArr4;
                    if (iF3 != -2 || iF3 == -1) {
                        i62 = 0;
                        while (true) {
                            if (i62 >= i12) {
                                x06Var = x06Var2;
                                long jA5 = k16Var2.a(x06Var, iIntValue2, 0);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                List list11 = arrayList;
                                s16 s16VarV5 = j16Var4.v(iIntValue2, jA5);
                                i64 = i61 - s16VarV5.n;
                                s16VarV5.p(i64, 0, iMin);
                                list11.add(s16VarV5);
                                arrayList = list11;
                            } else {
                                s16Var4 = (s16) h30VarArr[i62].j();
                                if (s16Var4 != null) {
                                    i63 = s16Var4.a;
                                } else {
                                    i63 = -1;
                                }
                                if (i63 > iIntValue2) {
                                    i62++;
                                } else {
                                    x06Var = x06Var2;
                                    i64 = i61;
                                }
                            }
                        }
                    } else {
                        s16 s16Var8 = (s16) h30VarArr[iF3].j();
                        if ((s16Var8 != null ? s16Var8.a : -1) > iIntValue2) {
                            x06Var = x06Var2;
                            long jA6 = k16Var2.a(x06Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list12 = arrayList;
                            s16 s16VarV6 = j16Var4.v(iIntValue2, jA6);
                            i64 = i61 - s16VarV6.n;
                            s16VarV6.p(i64, 0, iMin);
                            list12.add(s16VarV6);
                            arrayList = list12;
                        } else {
                            x06Var = x06Var2;
                            i64 = i61;
                        }
                    }
                    if (i60 < 0) {
                        break;
                    }
                    x06Var2 = x06Var;
                    i17 = i64;
                    iArr4 = iArr5;
                    i59 = i60;
                    j2 = j2;
                    list7 = list;
                    i13 = i18;
                }
            } else {
                i18 = i13;
                j2 = j2;
                list = list7;
                x06Var = x06Var2;
                iArr5 = iArr4;
                arrayList = null;
            }
            if (arrayList == null) {
                list2 = list8;
            } else {
                list2 = arrayList;
            }
            i20 = 0;
            for (i19 = 0; i19 < i12; i19++) {
                i20 += h30VarArr[i19].v;
            }
            arrayList2 = new ArrayList(i20);
            loop28: while (true) {
                i21 = 0;
                while (true) {
                    if (i21 < i12) {
                        break loop28;
                    }
                    i7 = i7;
                    if (!h30VarArr[i21].isEmpty()) {
                        break;
                    }
                    i21++;
                    x16Var2 = x16Var2;
                    f = f;
                }
                i48 = Integer.MAX_VALUE;
                i49 = -1;
                i50 = 0;
                while (i50 < i12) {
                    i57 = i50;
                    s16Var3 = (s16) h30VarArr[i50].j();
                    if (s16Var3 != null) {
                        i58 = s16Var3.a;
                    } else {
                        i58 = Integer.MAX_VALUE;
                    }
                    if (i48 > i58) {
                        i48 = i58;
                        i49 = i57;
                    }
                    i50 = i57 + 1;
                }
                s16Var2 = (s16) h30VarArr[i49].removeFirst();
                i51 = s16Var2.e;
                if (i51 != i49) {
                    int i174 = i49;
                    int i175 = i12;
                    float f5 = f;
                    long j5 = (((long) (s16Var2.f + i51)) & 4294967295L) | (((long) i51) << 32);
                    iC = c(iArrCopyOf, j5);
                    x16 x16Var3 = x16Var2;
                    iArr10 = iArrCopyOf;
                    i52 = x16Var3.a[i174];
                    i53 = i118;
                    if (s16Var2.m + iC >= i53) {
                        i56 = i117;
                        if (iC <= i56) {
                            s16Var2.p(iC, i52, iMin);
                            arrayList2.add(s16Var2);
                        }
                        i117 = i56;
                    }
                    i118 = i53;
                    i55 = (int) (j5 & 4294967295L);
                    for (i54 = (int) (j5 >> 32); i54 < i55; i54++) {
                        iArr10[i54] = s16Var2.n + iC;
                    }
                    iArrCopyOf = iArr10;
                    i12 = i175;
                    x16Var2 = x16Var3;
                    f = f5;
                }
            }
            i22 = i7;
            f4 = f;
            x16 x16Var4 = x16Var2;
            i23 = iArrCopyOf[0];
            s16Var = (s16) th1.H(arrayList2);
            if (s16Var != null) {
                i24 = s16Var.a;
            } else {
                i24 = -1;
            }
            if (g4aVar2.P0() || list6 == null || list6.isEmpty()) {
                iArr6 = iArr3;
                c26Var3 = c26Var2;
                h16Var = h16Var3;
                arrayList2 = arrayList2;
                arrayList3 = null;
            } else {
                int size5 = list6.size() - 1;
                while (true) {
                    list3 = list6;
                    if (-1 >= size5) {
                        w06Var = null;
                        break;
                    }
                    if (list3.get(size5).getIndex() > i24 && (size5 == 0 || list3.get(size5 - 1).getIndex() <= i24)) {
                        w06Var = list3.get(size5);
                        break;
                    }
                    size5--;
                    list6 = list3;
                }
                w06 w06Var3 = (w06) th1.G(list3);
                if (w06Var != null && (index = w06Var.getIndex()) <= (iMin2 = Math.min(w06Var3.getIndex(), i5 - 1))) {
                    arrayList3 = null;
                    while (true) {
                        iArr6 = iArr3;
                        if (arrayList3 != null) {
                            int size6 = arrayList3.size();
                            c26Var3 = c26Var2;
                            int i176 = 0;
                            while (true) {
                                if (i176 < size6) {
                                    int i177 = size6;
                                    if (((s16) arrayList3.get(i176)).a == index) {
                                        h16Var = h16Var3;
                                    } else {
                                        i176++;
                                        size6 = i177;
                                    }
                                }
                                if (index != iMin2) {
                                    break;
                                }
                                index++;
                                arrayList2 = arrayList2;
                                iArr3 = iArr6;
                                h16Var3 = h16Var;
                                c26Var2 = c26Var3;
                            }
                        } else {
                            c26Var3 = c26Var2;
                        }
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        int size7 = list3.size();
                        int i178 = 0;
                        while (true) {
                            if (i178 >= size7) {
                                w06Var2 = null;
                                break;
                            }
                            w06Var2 = list3.get(i178);
                            int i179 = size7;
                            if (w06Var2.getIndex() == index) {
                                break;
                            }
                            i178++;
                            size7 = i179;
                        }
                        w06 w06Var4 = w06Var2;
                        int iD4 = w06Var4 != null ? w06Var4.d() : 0;
                        h16 h16Var5 = h16Var3;
                        s16 s16VarV7 = j16Var4.v(index, k16Var2.a(x06Var, index, iD4));
                        arrayList3.add(s16VarV7);
                        int[] iArr27 = x16Var4.a;
                        h16Var = h16Var5;
                        s16VarV7.p(i23, iArr27.length > iD4 ? iArr27[iD4] : 0, iMin);
                        i23 = s16VarV7.n + i23;
                        if (index != iMin2) {
                            break;
                            break;
                        }
                        index++;
                        arrayList2 = arrayList2;
                        iArr3 = iArr6;
                        h16Var3 = h16Var;
                        c26Var2 = c26Var3;
                    }
                } else {
                    iArr6 = iArr3;
                    c26Var3 = c26Var2;
                    h16Var = h16Var3;
                    arrayList2 = arrayList2;
                    arrayList3 = null;
                }
            }
            size2 = list.size();
            arrayList4 = null;
            i25 = 0;
            while (i25 < size2) {
                iIntValue = list.get(i25).intValue();
                i43 = i5;
                if (iIntValue < i43) {
                    if (arrayList3 != null) {
                        size4 = arrayList3.size();
                        i47 = 0;
                        while (true) {
                            if (i47 < size4) {
                                if (((s16) arrayList3.get(i47)).a == iIntValue) {
                                    i44 = size2;
                                    h16Var2 = h16Var;
                                    iArr9 = iArr18;
                                } else {
                                    i47++;
                                }
                            }
                        }
                    }
                    h16Var2 = h16Var;
                    iF2 = h16Var2.f(iIntValue);
                    if (iF2 != -2 || iF2 == -1) {
                        iArr9 = iArr18;
                        length3 = iArr9.length;
                        i44 = size2;
                        i45 = 0;
                        while (true) {
                            if (i45 < length3) {
                                i46 = i45;
                                if (iArr9[i46] < iIntValue) {
                                    i45 = i46 + 1;
                                }
                            }
                        }
                    } else {
                        i44 = size2;
                        if (iArr18[iF2] < iIntValue) {
                            iArr9 = iArr18;
                        }
                        iArr9 = iArr18;
                    }
                    long jA7 = k16Var2.a(x06Var, iIntValue, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    s16 s16VarV8 = j16Var4.v(iIntValue, jA7);
                    s16VarV8.p(i23, 0, iMin);
                    int i180 = s16VarV8.n + i23;
                    arrayList4.add(s16VarV8);
                    i23 = i180;
                } else {
                    i44 = size2;
                    h16Var2 = h16Var;
                    iArr9 = iArr18;
                }
                i25++;
                size2 = i44;
                i5 = i43;
                h16Var = h16Var2;
                iArr18 = iArr9;
                list = list;
            }
            i26 = i5;
            iArr7 = iArr18;
            if (arrayList4 == null) {
                arrayList4 = list8;
            }
            arrayList5 = new ArrayList();
            arrayList5.addAll(list2);
            arrayList6 = arrayList2;
            arrayList5.addAll(arrayList6);
            if (arrayList3 != null) {
                arrayList5.addAll(arrayList3);
            }
            arrayList5.addAll(arrayList4);
            c26Var4 = c26Var3;
            vv5Var = c26Var4.t;
            i27 = (int) f4;
            kw5VarA = j16Var4.c.a();
            j16Var = k16Var2.q;
            z3 = k16Var2.f;
            i28 = k16Var2.s;
            zP0 = g4aVar2.P0();
            z4 = k16Var2.n;
            iArr8 = iArr6;
            if (iArr8.length != 0) {
                vl.b();
                return null;
            }
            i29 = iArr8[0];
            length2 = iArr8.length - 1;
            if (1 <= length2) {
                i40 = i29;
                i41 = 1;
                while (true) {
                    i42 = iArr8[i41];
                    if (i40 > i42) {
                        i40 = i42;
                    }
                    if (i41 != length2) {
                        break;
                    }
                    i41++;
                }
                i30 = i40;
            } else {
                i30 = i29;
            }
            vv5Var.d(i27, i14, i15, arrayList5, kw5VarA, j16Var, z3, zP0, i28, z4, i30, u30.B(iArr14) + i18, k16Var2.m, k16Var2.p);
            if (g4aVar2.P0()) {
                i31 = i15;
                i32 = i14;
            } else {
                jB = c26Var4.t.b();
                if (kg5.b(jB, 0L)) {
                    i31 = i15;
                    i32 = i14;
                } else {
                    if (z6) {
                        i37 = i15;
                    } else {
                        i37 = i14;
                    }
                    int iMax = Math.max(i14, (int) (jB >> 32));
                    long j6 = j2;
                    iG3 = zx1.g(iMax, j6);
                    iF = zx1.f(Math.max(i15, (int) (jB & 4294967295L)), j6);
                    if (z6) {
                        i38 = iF;
                    } else {
                        i38 = iG3;
                    }
                    if (i38 != i37) {
                        size3 = arrayList5.size();
                        for (i39 = 0; i39 < size3; i39++) {
                            s16 s16Var9 = (s16) arrayList5.get(i39);
                            s16Var9.o = i38;
                            s16Var9.q = s16Var9.h + i38;
                        }
                    }
                    i32 = iG3;
                    i31 = iF;
                }
            }
            i33 = length11;
            i34 = 0;
            while (true) {
                if (i34 >= i33) {
                    for (int i181 : iArr7) {
                        if (i181 < i26 - 1) {
                            z5 = false;
                            final long j7 = k16Var2.i;
                            final boolean z15 = false;
                            final k16 k16Var3 = k16Var2;
                            return new q16(iArr5, iArr8, f4, tw5Var.y0(i32, i31, if3Var, new oh4() { // from class: l16
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    jz7.a aVar = (jz7.a) obj;
                                    final ArrayList arrayList7 = arrayList5;
                                    final boolean z16 = z15;
                                    final long j8 = j7;
                                    final sw5 sw5Var = tw5Var;
                                    oh4 oh4Var = new oh4() { // from class: m16
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj2) {
                                            ko4 ko4Var;
                                            int i182;
                                            int i183;
                                            jz7.a aVar2 = (jz7.a) obj2;
                                            ArrayList arrayList8 = arrayList7;
                                            int size8 = arrayList8.size();
                                            int i184 = 0;
                                            while (i184 < size8) {
                                                s16 s16Var10 = (s16) arrayList8.get(i184);
                                                boolean zP1 = sw5Var.P0();
                                                boolean z17 = s16Var10.d;
                                                if (s16Var10.o == Integer.MIN_VALUE) {
                                                    xc5.a("position() should be called first");
                                                }
                                                List<jz7> list13 = s16Var10.c;
                                                int size9 = list13.size();
                                                int i185 = 0;
                                                while (i185 < size9) {
                                                    jz7 jz7Var = list13.get(i185);
                                                    int i186 = s16Var10.p - (z17 ? jz7Var.u : jz7Var.t);
                                                    int i187 = s16Var10.q;
                                                    int i188 = i184;
                                                    long j9 = s16Var10.t;
                                                    ArrayList arrayList9 = arrayList8;
                                                    int i189 = size8;
                                                    sv5 sv5VarA = s16Var10.j.a(i185, s16Var10.b);
                                                    if (sv5VarA != null) {
                                                        if (zP1) {
                                                            sv5VarA.q = j9;
                                                        } else {
                                                            long jD = bg5.d(!bg5.b(sv5VarA.q, 9223372034707292159L) ? sv5VarA.q : j9, ((bg5) sv5VarA.p.getValue()).a);
                                                            if ((s16Var10.k(j9) <= i186 && s16Var10.k(jD) <= i186) || (s16Var10.k(j9) >= i187 && s16Var10.k(jD) >= i187)) {
                                                                sv5VarA.b();
                                                            }
                                                            j9 = jD;
                                                        }
                                                        ko4Var = sv5VarA.m;
                                                    } else {
                                                        zP1 = zP1;
                                                        z17 = z17;
                                                        list13 = list13;
                                                        size9 = size9;
                                                        ko4Var = null;
                                                    }
                                                    if (z16) {
                                                        if (z17) {
                                                            i182 = (int) (j9 >> 32);
                                                        } else {
                                                            i182 = (s16Var10.o - ((int) (j9 >> 32))) - (z17 ? jz7Var.u : jz7Var.t);
                                                        }
                                                        if (z17) {
                                                            i183 = (s16Var10.o - ((int) (j9 & 4294967295L))) - (z17 ? jz7Var.u : jz7Var.t);
                                                        } else {
                                                            i183 = (int) (j9 & 4294967295L);
                                                        }
                                                        j9 = (((long) i183) & 4294967295L) | (((long) i182) << 32);
                                                    }
                                                    long jD2 = bg5.d(j9, j8);
                                                    if (!zP1 && sv5VarA != null) {
                                                        sv5VarA.l = jD2;
                                                    }
                                                    if (ko4Var != null) {
                                                        jz7.a.y(aVar2, jz7Var, jD2, ko4Var);
                                                    } else {
                                                        jz7.a.x(aVar2, jz7Var, jD2);
                                                    }
                                                    i185++;
                                                    zP1 = zP1;
                                                    i184 = i188;
                                                    arrayList8 = arrayList9;
                                                    size8 = i189;
                                                    z17 = z17;
                                                    list13 = list13;
                                                    size9 = size9;
                                                }
                                                i184++;
                                            }
                                            return g2b.a;
                                        }
                                    };
                                    aVar.t = true;
                                    oh4Var.invoke(aVar);
                                    aVar.t = false;
                                    k16Var3.a.u.getValue();
                                    return g2b.a;
                                }
                            }), f3, z5, k16Var3.f, z10, k16Var3.d, x06Var.h(), tw5Var, i26, arrayList6, (((long) i32) << 32) | (((long) i31) & 4294967295L), i118, i117, k16Var3.j, k16Var3.k, k16Var3.l, k16Var3.m);
                        }
                    }
                    break;
                }
                i36 = i22;
                if (iArr14[i34] > i36) {
                    break;
                }
                i34++;
                i22 = i36;
            }
            z5 = true;
            final long j8 = k16Var2.i;
            final boolean z16 = false;
            final k16 k16Var4 = k16Var2;
            return new q16(iArr5, iArr8, f4, tw5Var.y0(i32, i31, if3Var, new oh4() { // from class: l16
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    jz7.a aVar = (jz7.a) obj;
                    final ArrayList arrayList7 = arrayList5;
                    final boolean z17 = z16;
                    final long j9 = j8;
                    final sw5 sw5Var = tw5Var;
                    oh4 oh4Var = new oh4() { // from class: m16
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            ko4 ko4Var;
                            int i182;
                            int i183;
                            jz7.a aVar2 = (jz7.a) obj2;
                            ArrayList arrayList8 = arrayList7;
                            int size8 = arrayList8.size();
                            int i184 = 0;
                            while (i184 < size8) {
                                s16 s16Var10 = (s16) arrayList8.get(i184);
                                boolean zP1 = sw5Var.P0();
                                boolean z18 = s16Var10.d;
                                if (s16Var10.o == Integer.MIN_VALUE) {
                                    xc5.a("position() should be called first");
                                }
                                List<jz7> list13 = s16Var10.c;
                                int size9 = list13.size();
                                int i185 = 0;
                                while (i185 < size9) {
                                    jz7 jz7Var = list13.get(i185);
                                    int i186 = s16Var10.p - (z18 ? jz7Var.u : jz7Var.t);
                                    int i187 = s16Var10.q;
                                    int i188 = i184;
                                    long j10 = s16Var10.t;
                                    ArrayList arrayList9 = arrayList8;
                                    int i189 = size8;
                                    sv5 sv5VarA = s16Var10.j.a(i185, s16Var10.b);
                                    if (sv5VarA != null) {
                                        if (zP1) {
                                            sv5VarA.q = j10;
                                        } else {
                                            long jD = bg5.d(!bg5.b(sv5VarA.q, 9223372034707292159L) ? sv5VarA.q : j10, ((bg5) sv5VarA.p.getValue()).a);
                                            if ((s16Var10.k(j10) <= i186 && s16Var10.k(jD) <= i186) || (s16Var10.k(j10) >= i187 && s16Var10.k(jD) >= i187)) {
                                                sv5VarA.b();
                                            }
                                            j10 = jD;
                                        }
                                        ko4Var = sv5VarA.m;
                                    } else {
                                        zP1 = zP1;
                                        z18 = z18;
                                        list13 = list13;
                                        size9 = size9;
                                        ko4Var = null;
                                    }
                                    if (z17) {
                                        if (z18) {
                                            i182 = (int) (j10 >> 32);
                                        } else {
                                            i182 = (s16Var10.o - ((int) (j10 >> 32))) - (z18 ? jz7Var.u : jz7Var.t);
                                        }
                                        if (z18) {
                                            i183 = (s16Var10.o - ((int) (j10 & 4294967295L))) - (z18 ? jz7Var.u : jz7Var.t);
                                        } else {
                                            i183 = (int) (j10 & 4294967295L);
                                        }
                                        j10 = (((long) i183) & 4294967295L) | (((long) i182) << 32);
                                    }
                                    long jD2 = bg5.d(j10, j9);
                                    if (!zP1 && sv5VarA != null) {
                                        sv5VarA.l = jD2;
                                    }
                                    if (ko4Var != null) {
                                        jz7.a.y(aVar2, jz7Var, jD2, ko4Var);
                                    } else {
                                        jz7.a.x(aVar2, jz7Var, jD2);
                                    }
                                    i185++;
                                    zP1 = zP1;
                                    i184 = i188;
                                    arrayList8 = arrayList9;
                                    size8 = i189;
                                    z18 = z18;
                                    list13 = list13;
                                    size9 = size9;
                                }
                                i184++;
                            }
                            return g2b.a;
                        }
                    };
                    aVar.t = true;
                    oh4Var.invoke(aVar);
                    aVar.t = false;
                    k16Var4.a.u.getValue();
                    return g2b.a;
                }
            }), f3, z5, k16Var4.f, z10, k16Var4.d, x06Var.h(), tw5Var, i26, arrayList6, (((long) i32) << 32) | (((long) i31) & 4294967295L), i118, i117, k16Var4.j, k16Var4.k, k16Var4.l, k16Var4.m);
        }
        c26Var2 = c26Var;
        fFloatValue = c26Var2.o;
        tw5Var = tw5Var2;
        if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10)) {
            f = fFloatValue;
        } else {
            f = fFloatValue;
        }
        f2 = fFloatValue - f;
        f3 = 0.0f;
        if (g4aVar2.P0()) {
            f3 = (i10 - i9) + f2;
        }
        iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
        length = iArrCopyOf.length;
        while (i11 < length) {
            iArrCopyOf[i11] = -iArrCopyOf[i11];
        }
        i12 = i4;
        if (i8 > i74) {
            i65 = 0;
            while (i65 < i12) {
                h30Var = h30VarArr[i65];
                iD = h30Var.d();
                int i1710 = i8;
                i66 = 0;
                while (true) {
                    if (i66 < iD) {
                        i67 = i65;
                        break;
                        break;
                    }
                    i67 = i65;
                    s16 s16Var10 = (s16) h30Var.get(i66);
                    i68 = iD;
                    iArrE = h16Var3.e(s16Var10.a);
                    int i1711 = s16Var10.n;
                    if (iArrE == null) {
                        i69 = 0;
                    } else {
                        i69 = iArrE[i67];
                    }
                    i70 = i1711 + i69;
                    if (i66 == h30Var.size() - 1) {
                        break;
                    }
                    break;
                    iArr3[i67] = i71 - i70;
                    i66++;
                    iArr4[i67] = ((s16) h30Var.get(i66)).a;
                    iD = i68;
                    i65 = i67;
                }
                i65 = i67 + 1;
                i8 = i1710;
            }
        }
        int i1712 = i8;
        i13 = i73 + i1712;
        if (z6) {
            iG = xx1.h(j3);
            j2 = j3;
        } else {
            j2 = j3;
            iG = zx1.g(u30.B(iArr14) + i13, j2);
        }
        i14 = iG;
        if (z6) {
            iG2 = zx1.f(u30.B(iArr14) + i13, j2);
        } else {
            iG2 = xx1.g(j2);
        }
        i15 = iG2;
        if (z6) {
            i16 = i15;
        } else {
            i16 = i14;
        }
        iMin = i73 + (Math.min(i16, i7) - i1712);
        i17 = iArrCopyOf[0];
        size = list7.size() - 1;
        if (size >= 0) {
            i59 = size;
            arrayList = null;
            while (true) {
                i60 = i59 - 1;
                i18 = i13;
                list = list7;
                iIntValue2 = list.get(i59).intValue();
                i61 = i17;
                iF3 = h16Var3.f(iIntValue2);
                iArr5 = iArr4;
                if (iF3 != -2) {
                    i62 = 0;
                    while (true) {
                        if (i62 >= i12) {
                            x06Var = x06Var2;
                            long jA8 = k16Var2.a(x06Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list13 = arrayList;
                            s16 s16VarV9 = j16Var4.v(iIntValue2, jA8);
                            i64 = i61 - s16VarV9.n;
                            s16VarV9.p(i64, 0, iMin);
                            list13.add(s16VarV9);
                            arrayList = list13;
                            if (i60 < 0) {
                                break;
                                break;
                            }
                            x06Var2 = x06Var;
                            i17 = i64;
                            iArr4 = iArr5;
                            i59 = i60;
                            j2 = j2;
                            list7 = list;
                            i13 = i18;
                        } else {
                            s16Var4 = (s16) h30VarArr[i62].j();
                            if (s16Var4 != null) {
                                i63 = s16Var4.a;
                            } else {
                                i63 = -1;
                            }
                            if (i63 > iIntValue2) {
                                i62++;
                            } else {
                                x06Var = x06Var2;
                                i64 = i61;
                                if (i60 < 0) {
                                    break;
                                    break;
                                }
                                x06Var2 = x06Var;
                                i17 = i64;
                                iArr4 = iArr5;
                                i59 = i60;
                                j2 = j2;
                                list7 = list;
                                i13 = i18;
                            }
                        }
                    }
                } else {
                    i62 = 0;
                    while (true) {
                        if (i62 >= i12) {
                            x06Var = x06Var2;
                            long jA9 = k16Var2.a(x06Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list14 = arrayList;
                            s16 s16VarV10 = j16Var4.v(iIntValue2, jA9);
                            i64 = i61 - s16VarV10.n;
                            s16VarV10.p(i64, 0, iMin);
                            list14.add(s16VarV10);
                            arrayList = list14;
                            if (i60 < 0) {
                                break;
                                break;
                            }
                            x06Var2 = x06Var;
                            i17 = i64;
                            iArr4 = iArr5;
                            i59 = i60;
                            j2 = j2;
                            list7 = list;
                            i13 = i18;
                        } else {
                            s16Var4 = (s16) h30VarArr[i62].j();
                            if (s16Var4 != null) {
                                i63 = s16Var4.a;
                            } else {
                                i63 = -1;
                            }
                            if (i63 > iIntValue2) {
                                i62++;
                            } else {
                                x06Var = x06Var2;
                                i64 = i61;
                                if (i60 < 0) {
                                    break;
                                    break;
                                }
                                x06Var2 = x06Var;
                                i17 = i64;
                                iArr4 = iArr5;
                                i59 = i60;
                                j2 = j2;
                                list7 = list;
                                i13 = i18;
                            }
                        }
                    }
                }
            }
        } else {
            i18 = i13;
            j2 = j2;
            list = list7;
            x06Var = x06Var2;
            iArr5 = iArr4;
            arrayList = null;
        }
        if (arrayList == null) {
            list2 = list8;
        } else {
            list2 = arrayList;
        }
        i20 = 0;
        while (i19 < i12) {
            i20 += h30VarArr[i19].v;
        }
        arrayList2 = new ArrayList(i20);
        loop28: while (true) {
            i21 = 0;
            while (true) {
                if (i21 < i12) {
                    break loop28;
                    break loop28;
                }
                i7 = i7;
                if (!h30VarArr[i21].isEmpty()) {
                    break;
                }
                i21++;
                x16Var2 = x16Var2;
                f = f;
            }
            i48 = Integer.MAX_VALUE;
            i49 = -1;
            i50 = 0;
            while (i50 < i12) {
                i57 = i50;
                s16Var3 = (s16) h30VarArr[i50].j();
                if (s16Var3 != null) {
                    i58 = s16Var3.a;
                } else {
                    i58 = Integer.MAX_VALUE;
                }
                if (i48 > i58) {
                    i48 = i58;
                    i49 = i57;
                }
                i50 = i57 + 1;
            }
            s16Var2 = (s16) h30VarArr[i49].removeFirst();
            i51 = s16Var2.e;
            if (i51 != i49) {
                int i1713 = i49;
                int i1714 = i12;
                float f6 = f;
                long j9 = (((long) (s16Var2.f + i51)) & 4294967295L) | (((long) i51) << 32);
                iC = c(iArrCopyOf, j9);
                x16 x16Var5 = x16Var2;
                iArr10 = iArrCopyOf;
                i52 = x16Var5.a[i1713];
                i53 = i118;
                if (s16Var2.m + iC >= i53) {
                    i56 = i117;
                    if (iC <= i56) {
                        s16Var2.p(iC, i52, iMin);
                        arrayList2.add(s16Var2);
                    }
                    i117 = i56;
                }
                i118 = i53;
                i55 = (int) (j9 & 4294967295L);
                while (i54 < i55) {
                    iArr10[i54] = s16Var2.n + iC;
                }
                iArrCopyOf = iArr10;
                i12 = i1714;
                x16Var2 = x16Var5;
                f = f6;
            }
        }
        i22 = i7;
        f4 = f;
        x16 x16Var6 = x16Var2;
        i23 = iArrCopyOf[0];
        s16Var = (s16) th1.H(arrayList2);
        if (s16Var != null) {
            i24 = s16Var.a;
        } else {
            i24 = -1;
        }
        if (g4aVar2.P0()) {
            iArr6 = iArr3;
            c26Var3 = c26Var2;
            h16Var = h16Var3;
            arrayList2 = arrayList2;
            arrayList3 = null;
        } else {
            iArr6 = iArr3;
            c26Var3 = c26Var2;
            h16Var = h16Var3;
            arrayList2 = arrayList2;
            arrayList3 = null;
        }
        size2 = list.size();
        arrayList4 = null;
        i25 = 0;
        while (i25 < size2) {
            iIntValue = list.get(i25).intValue();
            i43 = i5;
            if (iIntValue < i43) {
                if (arrayList3 != null) {
                    size4 = arrayList3.size();
                    i47 = 0;
                    while (true) {
                        if (i47 < size4) {
                            if (((s16) arrayList3.get(i47)).a == iIntValue) {
                                i44 = size2;
                                h16Var2 = h16Var;
                                iArr9 = iArr18;
                            } else {
                                i47++;
                            }
                        }
                    }
                }
                h16Var2 = h16Var;
                iF2 = h16Var2.f(iIntValue);
                if (iF2 != -2) {
                    iArr9 = iArr18;
                    length3 = iArr9.length;
                    i44 = size2;
                    i45 = 0;
                    while (true) {
                        if (i45 < length3) {
                            i46 = i45;
                            if (iArr9[i46] < iIntValue) {
                                i45 = i46 + 1;
                            }
                        } else {
                            long jA10 = k16Var2.a(x06Var, iIntValue, 0);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            s16 s16VarV11 = j16Var4.v(iIntValue, jA10);
                            s16VarV11.p(i23, 0, iMin);
                            int i182 = s16VarV11.n + i23;
                            arrayList4.add(s16VarV11);
                            i23 = i182;
                        }
                    }
                } else {
                    iArr9 = iArr18;
                    length3 = iArr9.length;
                    i44 = size2;
                    i45 = 0;
                    while (true) {
                        if (i45 < length3) {
                            i46 = i45;
                            if (iArr9[i46] < iIntValue) {
                                i45 = i46 + 1;
                            }
                        } else {
                            long jA11 = k16Var2.a(x06Var, iIntValue, 0);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            s16 s16VarV12 = j16Var4.v(iIntValue, jA11);
                            s16VarV12.p(i23, 0, iMin);
                            int i183 = s16VarV12.n + i23;
                            arrayList4.add(s16VarV12);
                            i23 = i183;
                        }
                    }
                }
            } else {
                i44 = size2;
                h16Var2 = h16Var;
                iArr9 = iArr18;
            }
            i25++;
            size2 = i44;
            i5 = i43;
            h16Var = h16Var2;
            iArr18 = iArr9;
            list = list;
        }
        i26 = i5;
        iArr7 = iArr18;
        if (arrayList4 == null) {
            arrayList4 = list8;
        }
        arrayList5 = new ArrayList();
        arrayList5.addAll(list2);
        arrayList6 = arrayList2;
        arrayList5.addAll(arrayList6);
        if (arrayList3 != null) {
            arrayList5.addAll(arrayList3);
        }
        arrayList5.addAll(arrayList4);
        c26Var4 = c26Var3;
        vv5Var = c26Var4.t;
        i27 = (int) f4;
        kw5VarA = j16Var4.c.a();
        j16Var = k16Var2.q;
        z3 = k16Var2.f;
        i28 = k16Var2.s;
        zP0 = g4aVar2.P0();
        z4 = k16Var2.n;
        iArr8 = iArr6;
        if (iArr8.length != 0) {
            vl.b();
            return null;
        }
        i29 = iArr8[0];
        length2 = iArr8.length - 1;
        if (1 <= length2) {
            i40 = i29;
            i41 = 1;
            while (true) {
                i42 = iArr8[i41];
                if (i40 > i42) {
                    i40 = i42;
                }
                if (i41 != length2) {
                    break;
                    break;
                }
                i41++;
            }
            i30 = i40;
        } else {
            i30 = i29;
        }
        vv5Var.d(i27, i14, i15, arrayList5, kw5VarA, j16Var, z3, zP0, i28, z4, i30, u30.B(iArr14) + i18, k16Var2.m, k16Var2.p);
        if (g4aVar2.P0()) {
            jB = c26Var4.t.b();
            if (kg5.b(jB, 0L)) {
                if (z6) {
                    i37 = i15;
                } else {
                    i37 = i14;
                }
                int iMax2 = Math.max(i14, (int) (jB >> 32));
                long j10 = j2;
                iG3 = zx1.g(iMax2, j10);
                iF = zx1.f(Math.max(i15, (int) (jB & 4294967295L)), j10);
                if (z6) {
                    i38 = iF;
                } else {
                    i38 = iG3;
                }
                if (i38 != i37) {
                    size3 = arrayList5.size();
                    while (i39 < size3) {
                        s16 s16Var11 = (s16) arrayList5.get(i39);
                        s16Var11.o = i38;
                        s16Var11.q = s16Var11.h + i38;
                    }
                }
                i32 = iG3;
                i31 = iF;
            } else {
                i31 = i15;
                i32 = i14;
            }
        } else {
            i31 = i15;
            i32 = i14;
        }
        i33 = length11;
        i34 = 0;
        while (true) {
            if (i34 >= i33) {
                while (i35 < r0) {
                    if (i181 < i26 - 1) {
                        z5 = false;
                        final long j11 = k16Var2.i;
                        final boolean z17 = false;
                        final k16 k16Var5 = k16Var2;
                        return new q16(iArr5, iArr8, f4, tw5Var.y0(i32, i31, if3Var, new oh4() { // from class: l16
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                jz7.a aVar = (jz7.a) obj;
                                final ArrayList arrayList7 = arrayList5;
                                final boolean z18 = z17;
                                final long j12 = j11;
                                final sw5 sw5Var = tw5Var;
                                oh4 oh4Var = new oh4() { // from class: m16
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        ko4 ko4Var;
                                        int i184;
                                        int i185;
                                        jz7.a aVar2 = (jz7.a) obj2;
                                        ArrayList arrayList8 = arrayList7;
                                        int size8 = arrayList8.size();
                                        int i186 = 0;
                                        while (i186 < size8) {
                                            s16 s16Var12 = (s16) arrayList8.get(i186);
                                            boolean zP1 = sw5Var.P0();
                                            boolean z19 = s16Var12.d;
                                            if (s16Var12.o == Integer.MIN_VALUE) {
                                                xc5.a("position() should be called first");
                                            }
                                            List<jz7> list15 = s16Var12.c;
                                            int size9 = list15.size();
                                            int i187 = 0;
                                            while (i187 < size9) {
                                                jz7 jz7Var = list15.get(i187);
                                                int i188 = s16Var12.p - (z19 ? jz7Var.u : jz7Var.t);
                                                int i189 = s16Var12.q;
                                                int i1810 = i186;
                                                long j13 = s16Var12.t;
                                                ArrayList arrayList9 = arrayList8;
                                                int i1811 = size8;
                                                sv5 sv5VarA = s16Var12.j.a(i187, s16Var12.b);
                                                if (sv5VarA != null) {
                                                    if (zP1) {
                                                        sv5VarA.q = j13;
                                                    } else {
                                                        long jD = bg5.d(!bg5.b(sv5VarA.q, 9223372034707292159L) ? sv5VarA.q : j13, ((bg5) sv5VarA.p.getValue()).a);
                                                        if ((s16Var12.k(j13) <= i188 && s16Var12.k(jD) <= i188) || (s16Var12.k(j13) >= i189 && s16Var12.k(jD) >= i189)) {
                                                            sv5VarA.b();
                                                        }
                                                        j13 = jD;
                                                    }
                                                    ko4Var = sv5VarA.m;
                                                } else {
                                                    zP1 = zP1;
                                                    z19 = z19;
                                                    list15 = list15;
                                                    size9 = size9;
                                                    ko4Var = null;
                                                }
                                                if (z18) {
                                                    if (z19) {
                                                        i184 = (int) (j13 >> 32);
                                                    } else {
                                                        i184 = (s16Var12.o - ((int) (j13 >> 32))) - (z19 ? jz7Var.u : jz7Var.t);
                                                    }
                                                    if (z19) {
                                                        i185 = (s16Var12.o - ((int) (j13 & 4294967295L))) - (z19 ? jz7Var.u : jz7Var.t);
                                                    } else {
                                                        i185 = (int) (j13 & 4294967295L);
                                                    }
                                                    j13 = (((long) i185) & 4294967295L) | (((long) i184) << 32);
                                                }
                                                long jD2 = bg5.d(j13, j12);
                                                if (!zP1 && sv5VarA != null) {
                                                    sv5VarA.l = jD2;
                                                }
                                                if (ko4Var != null) {
                                                    jz7.a.y(aVar2, jz7Var, jD2, ko4Var);
                                                } else {
                                                    jz7.a.x(aVar2, jz7Var, jD2);
                                                }
                                                i187++;
                                                zP1 = zP1;
                                                i186 = i1810;
                                                arrayList8 = arrayList9;
                                                size8 = i1811;
                                                z19 = z19;
                                                list15 = list15;
                                                size9 = size9;
                                            }
                                            i186++;
                                        }
                                        return g2b.a;
                                    }
                                };
                                aVar.t = true;
                                oh4Var.invoke(aVar);
                                aVar.t = false;
                                k16Var5.a.u.getValue();
                                return g2b.a;
                            }
                        }), f3, z5, k16Var5.f, z10, k16Var5.d, x06Var.h(), tw5Var, i26, arrayList6, (((long) i32) << 32) | (((long) i31) & 4294967295L), i118, i117, k16Var5.j, k16Var5.k, k16Var5.l, k16Var5.m);
                    }
                }
                break;
                break;
            }
            i36 = i22;
            if (iArr14[i34] > i36) {
                break;
                break;
            }
            i34++;
            i22 = i36;
        }
        z5 = true;
        final long j12 = k16Var2.i;
        final boolean z18 = false;
        final k16 k16Var6 = k16Var2;
        return new q16(iArr5, iArr8, f4, tw5Var.y0(i32, i31, if3Var, new oh4() { // from class: l16
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                final ArrayList arrayList7 = arrayList5;
                final boolean z19 = z18;
                final long j13 = j12;
                final sw5 sw5Var = tw5Var;
                oh4 oh4Var = new oh4() { // from class: m16
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ko4 ko4Var;
                        int i184;
                        int i185;
                        jz7.a aVar2 = (jz7.a) obj2;
                        ArrayList arrayList8 = arrayList7;
                        int size8 = arrayList8.size();
                        int i186 = 0;
                        while (i186 < size8) {
                            s16 s16Var12 = (s16) arrayList8.get(i186);
                            boolean zP1 = sw5Var.P0();
                            boolean z110 = s16Var12.d;
                            if (s16Var12.o == Integer.MIN_VALUE) {
                                xc5.a("position() should be called first");
                            }
                            List<jz7> list15 = s16Var12.c;
                            int size9 = list15.size();
                            int i187 = 0;
                            while (i187 < size9) {
                                jz7 jz7Var = list15.get(i187);
                                int i188 = s16Var12.p - (z110 ? jz7Var.u : jz7Var.t);
                                int i189 = s16Var12.q;
                                int i1810 = i186;
                                long j14 = s16Var12.t;
                                ArrayList arrayList9 = arrayList8;
                                int i1811 = size8;
                                sv5 sv5VarA = s16Var12.j.a(i187, s16Var12.b);
                                if (sv5VarA != null) {
                                    if (zP1) {
                                        sv5VarA.q = j14;
                                    } else {
                                        long jD = bg5.d(!bg5.b(sv5VarA.q, 9223372034707292159L) ? sv5VarA.q : j14, ((bg5) sv5VarA.p.getValue()).a);
                                        if ((s16Var12.k(j14) <= i188 && s16Var12.k(jD) <= i188) || (s16Var12.k(j14) >= i189 && s16Var12.k(jD) >= i189)) {
                                            sv5VarA.b();
                                        }
                                        j14 = jD;
                                    }
                                    ko4Var = sv5VarA.m;
                                } else {
                                    zP1 = zP1;
                                    z110 = z110;
                                    list15 = list15;
                                    size9 = size9;
                                    ko4Var = null;
                                }
                                if (z19) {
                                    if (z110) {
                                        i184 = (int) (j14 >> 32);
                                    } else {
                                        i184 = (s16Var12.o - ((int) (j14 >> 32))) - (z110 ? jz7Var.u : jz7Var.t);
                                    }
                                    if (z110) {
                                        i185 = (s16Var12.o - ((int) (j14 & 4294967295L))) - (z110 ? jz7Var.u : jz7Var.t);
                                    } else {
                                        i185 = (int) (j14 & 4294967295L);
                                    }
                                    j14 = (((long) i185) & 4294967295L) | (((long) i184) << 32);
                                }
                                long jD2 = bg5.d(j14, j13);
                                if (!zP1 && sv5VarA != null) {
                                    sv5VarA.l = jD2;
                                }
                                if (ko4Var != null) {
                                    jz7.a.y(aVar2, jz7Var, jD2, ko4Var);
                                } else {
                                    jz7.a.x(aVar2, jz7Var, jD2);
                                }
                                i187++;
                                zP1 = zP1;
                                i186 = i1810;
                                arrayList8 = arrayList9;
                                size8 = i1811;
                                z110 = z110;
                                list15 = list15;
                                size9 = size9;
                            }
                            i186++;
                        }
                        return g2b.a;
                    }
                };
                aVar.t = true;
                oh4Var.invoke(aVar);
                aVar.t = false;
                k16Var6.a.u.getValue();
                return g2b.a;
            }
        }), f3, z5, k16Var6.f, z10, k16Var6.d, x06Var.h(), tw5Var, i26, arrayList6, (((long) i32) << 32) | (((long) i31) & 4294967295L), i118, i117, k16Var6.j, k16Var6.k, k16Var6.l, k16Var6.m);
    }

    public static final boolean e(int[] iArr, k16 k16Var, int[] iArr2, int i) {
        h16 h16Var = k16Var.r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (h16Var.d(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (h16Var.d(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iF = h16Var.f(0);
        return (iF == 0 || iF == -1 || iF == -2) ? false : true;
    }

    public static final void f(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }
}
