package io.intercom.android.sdk.survey.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.e96;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ob4;
import defpackage.og8;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionHeaderComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void HeaderWithError(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(784176451);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m454QuestionHeadern1tc1qA(ws0.h(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), null, true, new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, 0 == true ? 1 : 0), ob4.y, cka.b(14), null, null, bj4VarO, 221568, 194);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return QuestionHeaderComponentKt.HeaderWithError$lambda$7(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HeaderWithError$lambda$7(int i, jt1 jt1Var, int i2) {
        HeaderWithError(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void HeaderWithoutError(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1382338223);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6VarC = ir9.c(ox6.a.t, 1.0f);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            m454QuestionHeadern1tc1qA(ws0.h(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), new StringProvider.ActualString("Please select a rating"), true, ValidationError.NoValidationError.INSTANCE, ob4.y, cka.b(16), null, null, bj4VarO, (StringProvider.ActualString.$stable << 3) | 224640, 192);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new og8(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HeaderWithoutError$lambda$9(int i, jt1 jt1Var, int i2) {
        HeaderWithoutError(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x0163  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7 A[LOOP:0: B:122:0x01de->B:124:0x01e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x0209  */
    /* JADX WARN: Code duplicated, block: B:129:0x0213  */
    /* JADX WARN: Code duplicated, block: B:131:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x031a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0330  */
    /* JADX WARN: Code duplicated, block: B:150:0x0342  */
    /* JADX WARN: Code duplicated, block: B:152:0x0358  */
    /* JADX WARN: Code duplicated, block: B:154:0x0372  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:162:0x0201 A[EDGE_INSN: B:162:0x0201->B:125:0x0201 BREAK  A[LOOP:0: B:122:0x01de->B:124:0x01e7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX INFO: renamed from: QuestionHeader-n1tc1qA, reason: not valid java name */
    public static final void m454QuestionHeadern1tc1qA(final List<Block.Builder> list, StringProvider stringProvider, final boolean z, final ValidationError validationError, final ob4 ob4Var, final long j, ci4<? super jt1, ? super Integer, g2b> ci4Var, Integer num, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ob4 ob4Var2;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i4;
        final Integer num2;
        int i5;
        g2b g2bVar;
        StringProvider actualString;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6.a aVar;
        ox6 ox6VarC;
        qr5.a aVar2;
        int i6;
        long jM766getError0d7_KjU;
        e96 e96VarF;
        ArrayList arrayList;
        ListIterator listIterator;
        e96.b bVar;
        int size;
        int i7;
        int i8;
        bj4 bj4Var;
        ox6.a aVar3;
        int i9;
        boolean zW;
        final StringProvider stringProvider2;
        Object obj;
        int i10;
        int i11;
        Block block;
        bj4 bj4Var2;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        xj8 xj8VarW;
        int i12;
        list.getClass();
        validationError.getClass();
        ob4Var.getClass();
        bj4 bj4VarO = jt1Var.o(224116790);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) != 0) {
                i12 = 16;
            } else {
                if ((i & 64) == 0 ? bj4VarO.J(stringProvider) : bj4VarO.j(stringProvider)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
            }
            i3 |= i12;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(validationError) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            ob4Var2 = ob4Var;
        } else {
            ob4Var2 = ob4Var;
            if ((i & 24576) == 0) {
                i3 |= bj4VarO.J(ob4Var2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= bj4VarO.i(j) ? 131072 : 65536;
        }
        int i13 = i2 & 64;
        if (i13 == 0) {
            if ((1572864 & i) == 0) {
                ci4Var2 = ci4Var;
                i3 |= bj4VarO.j(ci4Var2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    num2 = num;
                    if (bj4VarO.J(num2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                if ((4793491 & i3) == 4793490 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    g2bVar = null;
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if ((i2 & 2) != 0) {
                            actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                            i3 &= -113;
                        } else {
                            actualString = stringProvider;
                        }
                        if (i13 != 0) {
                            ci4Var2 = null;
                        }
                        if (i4 != 0) {
                            num2 = null;
                        }
                    } else {
                        bj4VarO.u();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        actualString = stringProvider;
                    }
                    bj4VarO.V();
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    i6 = i3;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
                    bj4VarO.K(788845669);
                    e96VarF = ws0.f();
                    e96VarF.addAll(list);
                    if (num2 != null) {
                        e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                        g2b g2bVar2 = g2b.a;
                    }
                    e96 e96VarE = ws0.e(e96VarF);
                    arrayList = new ArrayList(ph1.n(e96VarE, 10));
                    listIterator = e96VarE.listIterator(0);
                    while (true) {
                        bVar = (e96.b) listIterator;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        Block.Builder builder = (Block.Builder) bVar.next();
                        arrayList.add(builder.withText(builder.build().getText()).build());
                    }
                    size = arrayList.size();
                    i7 = 0;
                    i8 = 0;
                    while (i8 < size) {
                        obj = arrayList.get(i8);
                        i10 = i8 + 1;
                        i11 = i7 + 1;
                        if (i7 < 0) {
                            ws0.m();
                            throw null;
                        }
                        block = (Block) obj;
                        if (i7 == 0 || !z) {
                            bj4 bj4Var3 = bj4VarO;
                            bj4Var3.K(670260694);
                            block.getClass();
                            BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var3, 0, 0, 8189);
                            bj4Var2 = bj4Var3;
                            bj4Var2.U(false);
                        } else {
                            bj4VarO.K(669360702);
                            bj4VarO.K(-671143346);
                            long jA = validationError instanceof ValidationError.ValidationStringError ? jM766getError0d7_KjU : gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            bj4VarO.U(false);
                            String strF = nr1.f(bj4VarO, R.string.intercom_surveys_required_response);
                            block.getClass();
                            bj4 bj4Var4 = bj4VarO;
                            BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var2, 0L, null, null, null, 60, null), 14, null), false, new SuffixText(" *", strF, jA, null), false, null, null, 0L, null, null, false, null, null, bj4Var4, 0, 0, 8181);
                            bj4Var2 = bj4Var4;
                            bj4Var2.U(false);
                        }
                        ob4Var2 = ob4Var;
                        aVar = aVar;
                        bj4VarO = bj4Var2;
                        i8 = i10;
                        i7 = i11;
                    }
                    bj4Var = bj4VarO;
                    aVar3 = aVar;
                    bj4Var.U(false);
                    bj4Var.K(788890982);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        bj4Var.K(-1314134166);
                        b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                        bj4Var.K(788894943);
                        if (ci4Var2 != null) {
                            ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                            g2bVar = g2b.a;
                        }
                        bj4Var.U(false);
                        if (g2bVar == null) {
                            ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                    } else {
                        bj4Var.K(788901916);
                        i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                        zW = z2a.w(actualString.getText(bj4Var, i9));
                        bj4Var.U(false);
                        if (!zW) {
                            bj4Var.K(-1313819423);
                            b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                            String text = actualString.getText(bj4Var, i9);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(text, null, uh1.b(0.6f, intercomTheme.getColors(bj4Var, i14).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i14).getType04(), bj4Var, 0, 0, 131066);
                            bj4Var = bj4Var;
                            bj4Var.U(false);
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    stringProvider2 = actualString;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    stringProvider2 = stringProvider;
                }
                ci4Var3 = ci4Var2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ng8
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(list, stringProvider2, z, validationError, ob4Var, j, ci4Var3, num2, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            num2 = num;
            if ((4793491 & i3) == 4793490) {
                bj4VarO.v0();
                g2bVar = null;
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                i6 = i3;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
                bj4VarO.K(788845669);
                e96VarF = ws0.f();
                e96VarF.addAll(list);
                if (num2 != null) {
                    e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                    g2b g2bVar3 = g2b.a;
                }
                e96 e96VarE2 = ws0.e(e96VarF);
                arrayList = new ArrayList(ph1.n(e96VarE2, 10));
                listIterator = e96VarE2.listIterator(0);
                while (true) {
                    bVar = (e96.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                        break;
                    } else {
                        Block.Builder builder2 = (Block.Builder) bVar.next();
                        arrayList.add(builder2.withText(builder2.build().getText()).build());
                    }
                }
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i8 < size) {
                    obj = arrayList.get(i8);
                    i10 = i8 + 1;
                    i11 = i7 + 1;
                    if (i7 < 0) {
                        ws0.m();
                        throw null;
                    }
                    block = (Block) obj;
                    if (i7 == 0) {
                        bj4 bj4Var5 = bj4VarO;
                        bj4Var5.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var5, 0, 0, 8189);
                        bj4Var2 = bj4Var5;
                        bj4Var2.U(false);
                    } else {
                        bj4 bj4Var6 = bj4VarO;
                        bj4Var6.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var6, 0, 0, 8189);
                        bj4Var2 = bj4Var6;
                        bj4Var2.U(false);
                    }
                    ob4Var2 = ob4Var;
                    aVar = aVar;
                    bj4VarO = bj4Var2;
                    i8 = i10;
                    i7 = i11;
                }
                bj4Var = bj4VarO;
                aVar3 = aVar;
                bj4Var.U(false);
                bj4Var.K(788890982);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    bj4Var.K(-1314134166);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    bj4Var.K(788894943);
                    if (ci4Var2 != null) {
                        ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                        g2bVar = g2b.a;
                    }
                    bj4Var.U(false);
                    if (g2bVar == null) {
                        ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                } else {
                    bj4Var.K(788901916);
                    i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                    zW = z2a.w(actualString.getText(bj4Var, i9));
                    bj4Var.U(false);
                    if (!zW) {
                        bj4Var.K(-1313819423);
                        b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                        String text2 = actualString.getText(bj4Var, i9);
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        mia.b(text2, null, uh1.b(0.6f, intercomTheme2.getColors(bj4Var, i15).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(bj4Var, i15).getType04(), bj4Var, 0, 0, 131066);
                        bj4Var = bj4Var;
                        bj4Var.U(false);
                    }
                }
                bj4Var.U(false);
                bj4Var.U(true);
                stringProvider2 = actualString;
            } else {
                bj4VarO.v0();
                g2bVar = null;
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                i6 = i3;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
                bj4VarO.K(788845669);
                e96VarF = ws0.f();
                e96VarF.addAll(list);
                if (num2 != null) {
                    e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                    g2b g2bVar4 = g2b.a;
                }
                e96 e96VarE3 = ws0.e(e96VarF);
                arrayList = new ArrayList(ph1.n(e96VarE3, 10));
                listIterator = e96VarE3.listIterator(0);
                while (true) {
                    bVar = (e96.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                        break;
                    } else {
                        Block.Builder builder3 = (Block.Builder) bVar.next();
                        arrayList.add(builder3.withText(builder3.build().getText()).build());
                    }
                }
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i8 < size) {
                    obj = arrayList.get(i8);
                    i10 = i8 + 1;
                    i11 = i7 + 1;
                    if (i7 < 0) {
                        ws0.m();
                        throw null;
                    }
                    block = (Block) obj;
                    if (i7 == 0) {
                        bj4 bj4Var7 = bj4VarO;
                        bj4Var7.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var7, 0, 0, 8189);
                        bj4Var2 = bj4Var7;
                        bj4Var2.U(false);
                    } else {
                        bj4 bj4Var8 = bj4VarO;
                        bj4Var8.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var8, 0, 0, 8189);
                        bj4Var2 = bj4Var8;
                        bj4Var2.U(false);
                    }
                    ob4Var2 = ob4Var;
                    aVar = aVar;
                    bj4VarO = bj4Var2;
                    i8 = i10;
                    i7 = i11;
                }
                bj4Var = bj4VarO;
                aVar3 = aVar;
                bj4Var.U(false);
                bj4Var.K(788890982);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    bj4Var.K(-1314134166);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    bj4Var.K(788894943);
                    if (ci4Var2 != null) {
                        ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                        g2bVar = g2b.a;
                    }
                    bj4Var.U(false);
                    if (g2bVar == null) {
                        ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                } else {
                    bj4Var.K(788901916);
                    i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                    zW = z2a.w(actualString.getText(bj4Var, i9));
                    bj4Var.U(false);
                    if (!zW) {
                        bj4Var.K(-1313819423);
                        b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                        String text3 = actualString.getText(bj4Var, i9);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        mia.b(text3, null, uh1.b(0.6f, intercomTheme3.getColors(bj4Var, i16).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(bj4Var, i16).getType04(), bj4Var, 0, 0, 131066);
                        bj4Var = bj4Var;
                        bj4Var.U(false);
                    }
                }
                bj4Var.U(false);
                bj4Var.U(true);
                stringProvider2 = actualString;
            }
            ci4Var3 = ci4Var2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ng8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(list, stringProvider2, z, validationError, ob4Var, j, ci4Var3, num2, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        ci4Var2 = ci4Var;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                num2 = num;
                if (bj4VarO.J(num2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4793491 & i3) == 4793490) {
                bj4VarO.v0();
                g2bVar = null;
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                i6 = i3;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
                bj4VarO.K(788845669);
                e96VarF = ws0.f();
                e96VarF.addAll(list);
                if (num2 != null) {
                    e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                    g2b g2bVar5 = g2b.a;
                }
                e96 e96VarE4 = ws0.e(e96VarF);
                arrayList = new ArrayList(ph1.n(e96VarE4, 10));
                listIterator = e96VarE4.listIterator(0);
                while (true) {
                    bVar = (e96.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                        break;
                    } else {
                        Block.Builder builder4 = (Block.Builder) bVar.next();
                        arrayList.add(builder4.withText(builder4.build().getText()).build());
                    }
                }
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i8 < size) {
                    obj = arrayList.get(i8);
                    i10 = i8 + 1;
                    i11 = i7 + 1;
                    if (i7 < 0) {
                        ws0.m();
                        throw null;
                    }
                    block = (Block) obj;
                    if (i7 == 0) {
                        bj4 bj4Var9 = bj4VarO;
                        bj4Var9.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var9, 0, 0, 8189);
                        bj4Var2 = bj4Var9;
                        bj4Var2.U(false);
                    } else {
                        bj4 bj4Var10 = bj4VarO;
                        bj4Var10.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var10, 0, 0, 8189);
                        bj4Var2 = bj4Var10;
                        bj4Var2.U(false);
                    }
                    ob4Var2 = ob4Var;
                    aVar = aVar;
                    bj4VarO = bj4Var2;
                    i8 = i10;
                    i7 = i11;
                }
                bj4Var = bj4VarO;
                aVar3 = aVar;
                bj4Var.U(false);
                bj4Var.K(788890982);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    bj4Var.K(-1314134166);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    bj4Var.K(788894943);
                    if (ci4Var2 != null) {
                        ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                        g2bVar = g2b.a;
                    }
                    bj4Var.U(false);
                    if (g2bVar == null) {
                        ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                } else {
                    bj4Var.K(788901916);
                    i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                    zW = z2a.w(actualString.getText(bj4Var, i9));
                    bj4Var.U(false);
                    if (!zW) {
                        bj4Var.K(-1313819423);
                        b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                        String text4 = actualString.getText(bj4Var, i9);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i17 = IntercomTheme.$stable;
                        mia.b(text4, null, uh1.b(0.6f, intercomTheme4.getColors(bj4Var, i17).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(bj4Var, i17).getType04(), bj4Var, 0, 0, 131066);
                        bj4Var = bj4Var;
                        bj4Var.U(false);
                    }
                }
                bj4Var.U(false);
                bj4Var.U(true);
                stringProvider2 = actualString;
            } else {
                bj4VarO.v0();
                g2bVar = null;
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                        i3 &= -113;
                    } else {
                        actualString = stringProvider;
                    }
                    if (i13 != 0) {
                        ci4Var2 = null;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                }
                bj4VarO.V();
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                i6 = i3;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
                bj4VarO.K(788845669);
                e96VarF = ws0.f();
                e96VarF.addAll(list);
                if (num2 != null) {
                    e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                    g2b g2bVar6 = g2b.a;
                }
                e96 e96VarE5 = ws0.e(e96VarF);
                arrayList = new ArrayList(ph1.n(e96VarE5, 10));
                listIterator = e96VarE5.listIterator(0);
                while (true) {
                    bVar = (e96.b) listIterator;
                    if (!bVar.hasNext()) {
                        break;
                        break;
                    } else {
                        Block.Builder builder5 = (Block.Builder) bVar.next();
                        arrayList.add(builder5.withText(builder5.build().getText()).build());
                    }
                }
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i8 < size) {
                    obj = arrayList.get(i8);
                    i10 = i8 + 1;
                    i11 = i7 + 1;
                    if (i7 < 0) {
                        ws0.m();
                        throw null;
                    }
                    block = (Block) obj;
                    if (i7 == 0) {
                        bj4 bj4Var11 = bj4VarO;
                        bj4Var11.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var11, 0, 0, 8189);
                        bj4Var2 = bj4Var11;
                        bj4Var2.U(false);
                    } else {
                        bj4 bj4Var12 = bj4VarO;
                        bj4Var12.K(670260694);
                        block.getClass();
                        BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var12, 0, 0, 8189);
                        bj4Var2 = bj4Var12;
                        bj4Var2.U(false);
                    }
                    ob4Var2 = ob4Var;
                    aVar = aVar;
                    bj4VarO = bj4Var2;
                    i8 = i10;
                    i7 = i11;
                }
                bj4Var = bj4VarO;
                aVar3 = aVar;
                bj4Var.U(false);
                bj4Var.K(788890982);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    bj4Var.K(-1314134166);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    bj4Var.K(788894943);
                    if (ci4Var2 != null) {
                        ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                        g2bVar = g2b.a;
                    }
                    bj4Var.U(false);
                    if (g2bVar == null) {
                        ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                } else {
                    bj4Var.K(788901916);
                    i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                    zW = z2a.w(actualString.getText(bj4Var, i9));
                    bj4Var.U(false);
                    if (!zW) {
                        bj4Var.K(-1313819423);
                        b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                        String text5 = actualString.getText(bj4Var, i9);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i18 = IntercomTheme.$stable;
                        mia.b(text5, null, uh1.b(0.6f, intercomTheme5.getColors(bj4Var, i18).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(bj4Var, i18).getType04(), bj4Var, 0, 0, 131066);
                        bj4Var = bj4Var;
                        bj4Var.U(false);
                    }
                }
                bj4Var.U(false);
                bj4Var.U(true);
                stringProvider2 = actualString;
            }
            ci4Var3 = ci4Var2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ng8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(list, stringProvider2, z, validationError, ob4Var, j, ci4Var3, num2, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 12582912;
        num2 = num;
        if ((4793491 & i3) == 4793490) {
            bj4VarO.v0();
            g2bVar = null;
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                    i3 &= -113;
                } else {
                    actualString = stringProvider;
                }
                if (i13 != 0) {
                    ci4Var2 = null;
                }
                if (i4 != 0) {
                    num2 = null;
                }
            } else {
                if ((i2 & 2) != 0) {
                    actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                    i3 &= -113;
                } else {
                    actualString = stringProvider;
                }
                if (i13 != 0) {
                    ci4Var2 = null;
                }
                if (i4 != 0) {
                    num2 = null;
                }
            }
            bj4VarO.V();
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            i6 = i3;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
            bj4VarO.K(788845669);
            e96VarF = ws0.f();
            e96VarF.addAll(list);
            if (num2 != null) {
                e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                g2b g2bVar7 = g2b.a;
            }
            e96 e96VarE6 = ws0.e(e96VarF);
            arrayList = new ArrayList(ph1.n(e96VarE6, 10));
            listIterator = e96VarE6.listIterator(0);
            while (true) {
                bVar = (e96.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                    break;
                } else {
                    Block.Builder builder6 = (Block.Builder) bVar.next();
                    arrayList.add(builder6.withText(builder6.build().getText()).build());
                }
            }
            size = arrayList.size();
            i7 = 0;
            i8 = 0;
            while (i8 < size) {
                obj = arrayList.get(i8);
                i10 = i8 + 1;
                i11 = i7 + 1;
                if (i7 < 0) {
                    ws0.m();
                    throw null;
                }
                block = (Block) obj;
                if (i7 == 0) {
                    bj4 bj4Var13 = bj4VarO;
                    bj4Var13.K(670260694);
                    block.getClass();
                    BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var13, 0, 0, 8189);
                    bj4Var2 = bj4Var13;
                    bj4Var2.U(false);
                } else {
                    bj4 bj4Var14 = bj4VarO;
                    bj4Var14.K(670260694);
                    block.getClass();
                    BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var14, 0, 0, 8189);
                    bj4Var2 = bj4Var14;
                    bj4Var2.U(false);
                }
                ob4Var2 = ob4Var;
                aVar = aVar;
                bj4VarO = bj4Var2;
                i8 = i10;
                i7 = i11;
            }
            bj4Var = bj4VarO;
            aVar3 = aVar;
            bj4Var.U(false);
            bj4Var.K(788890982);
            if (validationError instanceof ValidationError.ValidationStringError) {
                bj4Var.K(-1314134166);
                b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                bj4Var.K(788894943);
                if (ci4Var2 != null) {
                    ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                    g2bVar = g2b.a;
                }
                bj4Var.U(false);
                if (g2bVar == null) {
                    ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
            } else {
                bj4Var.K(788901916);
                i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                zW = z2a.w(actualString.getText(bj4Var, i9));
                bj4Var.U(false);
                if (!zW) {
                    bj4Var.K(-1313819423);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    String text6 = actualString.getText(bj4Var, i9);
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i19 = IntercomTheme.$stable;
                    mia.b(text6, null, uh1.b(0.6f, intercomTheme6.getColors(bj4Var, i19).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(bj4Var, i19).getType04(), bj4Var, 0, 0, 131066);
                    bj4Var = bj4Var;
                    bj4Var.U(false);
                }
            }
            bj4Var.U(false);
            bj4Var.U(true);
            stringProvider2 = actualString;
        } else {
            bj4VarO.v0();
            g2bVar = null;
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                    i3 &= -113;
                } else {
                    actualString = stringProvider;
                }
                if (i13 != 0) {
                    ci4Var2 = null;
                }
                if (i4 != 0) {
                    num2 = null;
                }
            } else {
                if ((i2 & 2) != 0) {
                    actualString = new StringProvider.ActualString(BuildConfig.FLAVOR);
                    i3 &= -113;
                } else {
                    actualString = stringProvider;
                }
                if (i13 != 0) {
                    ci4Var2 = null;
                }
                if (i4 != 0) {
                    num2 = null;
                }
            }
            bj4VarO.V();
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            i6 = i3;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            jM766getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m766getError0d7_KjU();
            bj4VarO.K(788845669);
            e96VarF = ws0.f();
            e96VarF.addAll(list);
            if (num2 != null) {
                e96VarF.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(nr1.f(bj4VarO, num2.intValue())));
                g2b g2bVar8 = g2b.a;
            }
            e96 e96VarE7 = ws0.e(e96VarF);
            arrayList = new ArrayList(ph1.n(e96VarE7, 10));
            listIterator = e96VarE7.listIterator(0);
            while (true) {
                bVar = (e96.b) listIterator;
                if (!bVar.hasNext()) {
                    break;
                    break;
                } else {
                    Block.Builder builder7 = (Block.Builder) bVar.next();
                    arrayList.add(builder7.withText(builder7.build().getText()).build());
                }
            }
            size = arrayList.size();
            i7 = 0;
            i8 = 0;
            while (i8 < size) {
                obj = arrayList.get(i8);
                i10 = i8 + 1;
                i11 = i7 + 1;
                if (i7 < 0) {
                    ws0.m();
                    throw null;
                }
                block = (Block) obj;
                if (i7 == 0) {
                    bj4 bj4Var15 = bj4VarO;
                    bj4Var15.K(670260694);
                    block.getClass();
                    BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var15, 0, 0, 8189);
                    bj4Var2 = bj4Var15;
                    bj4Var2.U(false);
                } else {
                    bj4 bj4Var16 = bj4VarO;
                    bj4Var16.K(670260694);
                    block.getClass();
                    BlockViewKt.m426BlockViewOkTjGUA(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, ob4Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, 0L, null, null, false, null, null, bj4Var16, 0, 0, 8189);
                    bj4Var2 = bj4Var16;
                    bj4Var2.U(false);
                }
                ob4Var2 = ob4Var;
                aVar = aVar;
                bj4VarO = bj4Var2;
                i8 = i10;
                i7 = i11;
            }
            bj4Var = bj4VarO;
            aVar3 = aVar;
            bj4Var.U(false);
            bj4Var.K(788890982);
            if (validationError instanceof ValidationError.ValidationStringError) {
                bj4Var.K(-1314134166);
                b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                bj4Var.K(788894943);
                if (ci4Var2 != null) {
                    ci4Var2.invoke(bj4Var, Integer.valueOf((i6 >> 18) & 14));
                    g2bVar = g2b.a;
                }
                bj4Var.U(false);
                if (g2bVar == null) {
                    ValidationErrorComponentKt.m456ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM766getError0d7_KjU, bj4Var, 0, 1);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
            } else {
                bj4Var.K(788901916);
                i9 = StringProvider.$stable | ((i6 >> 3) & 14);
                zW = z2a.w(actualString.getText(bj4Var, i9));
                bj4Var.U(false);
                if (!zW) {
                    bj4Var.K(-1313819423);
                    b47.b(bj4Var, ir9.d(aVar3, 4.0f));
                    String text7 = actualString.getText(bj4Var, i9);
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i110 = IntercomTheme.$stable;
                    mia.b(text7, null, uh1.b(0.6f, intercomTheme7.getColors(bj4Var, i110).getText().m824getDefault0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(bj4Var, i110).getType04(), bj4Var, 0, 0, 131066);
                    bj4Var = bj4Var;
                    bj4Var.U(false);
                }
            }
            bj4Var.U(false);
            bj4Var.U(true);
            stringProvider2 = actualString;
        }
        ci4Var3 = ci4Var2;
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ng8
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(list, stringProvider2, z, validationError, ob4Var, j, ci4Var3, num2, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuestionHeader_n1tc1qA$lambda$6(List list, StringProvider stringProvider, boolean z, ValidationError validationError, ob4 ob4Var, long j, ci4 ci4Var, Integer num, int i, int i2, jt1 jt1Var, int i3) {
        m454QuestionHeadern1tc1qA(list, stringProvider, z, validationError, ob4Var, j, ci4Var, num, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
