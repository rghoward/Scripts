package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.a0;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cj1;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gi4;
import defpackage.go7;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qf1;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.t6a;
import defpackage.th1;
import defpackage.xj8;
import defpackage.ye1;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClickableMessageRowKt {
    private static final Twig TWIG;

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        TWIG = logger;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0159  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x0173  */
    /* JADX WARN: Code duplicated, block: B:115:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01da  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:125:0x0229  */
    /* JADX WARN: Code duplicated, block: B:127:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0100  */
    public static final void ClickableMessageRow(final Part part, ox6 ox6Var, final BottomMetadata bottomMetadata, di.b bVar, go7 go7Var, mh4<g2b> mh4Var, final gi4<? super bj1, ? super Part, ? super mh4<g2b>, ? super jt1, ? super Integer, g2b> gi4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        int i5;
        di.b bVar2;
        int i6;
        int i7;
        go7 go7Var2;
        int i8;
        int i9;
        mh4<g2b> mh4Var2;
        int i10;
        gi4<? super bj1, ? super Part, ? super mh4<g2b>, ? super jt1, ? super Integer, g2b> gi4Var2;
        int i11;
        ox6.a aVar;
        di.b bVar3;
        go7 go7VarB;
        mh4<g2b> mh4Var3;
        Object objF;
        jt1.a.C0187a c0187a;
        h37 h37Var;
        int i12;
        final qf1 qf1Var;
        boolean zJ;
        Object objF2;
        mh4 mh4Var4;
        mh4<g2b> mh4Var5;
        int i13;
        boolean zJ2;
        Object objF3;
        aj1 aj1VarA;
        di.b bVar4;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        boolean z;
        final go7 go7Var3;
        final mh4<g2b> mh4Var6;
        final di.b bVar5;
        String attribution;
        Object objF4;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        part.getClass();
        gi4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-932954058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(part) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.J(bottomMetadata)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    bVar2 = bVar;
                    if (bj4VarO.J(bVar2)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        go7Var2 = go7Var;
                        if (bj4VarO.J(go7Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            mh4Var2 = mh4Var;
                            if (bj4VarO.j(mh4Var2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((i2 & 64) != 0) {
                            if ((i & 1572864) == 0) {
                                gi4Var2 = gi4Var;
                                if (bj4VarO.j(gi4Var2)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            if ((599187 & i3) == 599186 || !bj4VarO.r()) {
                                aVar = ox6.a.t;
                                if (i14 != 0) {
                                    ox6Var2 = aVar;
                                } else {
                                    ox6Var2 = ox6Var2;
                                }
                                if (i5 != 0) {
                                    bVar3 = di.a.m;
                                } else {
                                    bVar3 = bVar2;
                                }
                                if (i7 != 0) {
                                    go7VarB = eo7.b(3);
                                } else {
                                    go7VarB = go7Var2;
                                }
                                if (i9 != 0) {
                                    mh4Var3 = null;
                                } else {
                                    mh4Var3 = mh4Var2;
                                }
                                bj4VarO.K(1099063116);
                                objF = bj4VarO.f();
                                c0187a = jt1.a.a;
                                if (objF == c0187a) {
                                    objF = bl7.i(Boolean.FALSE);
                                    bj4VarO.C(objF);
                                }
                                h37Var = (h37) objF;
                                i12 = 0;
                                bj4VarO.U(false);
                                qf1Var = (qf1) bj4VarO.F(qu1.e);
                                bj4VarO.K(1099068212);
                                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                                objF2 = bj4VarO.f();
                                if (zJ || objF2 == c0187a) {
                                    objF2 = new mh4() { // from class: xe1
                                        @Override // defpackage.mh4
                                        public final Object invoke() {
                                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                        }
                                    };
                                    bj4VarO.C(objF2);
                                }
                                mh4Var4 = (mh4) objF2;
                                bj4VarO.U(false);
                                bj4VarO.K(1099094981);
                                if (mh4Var3 == null) {
                                    bj4VarO.K(1099095756);
                                    objF4 = bj4VarO.f();
                                    if (objF4 == c0187a) {
                                        objF4 = new ye1(i12, h37Var);
                                        bj4VarO.C(objF4);
                                    }
                                    mh4Var5 = (mh4) objF4;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var5 = mh4Var3;
                                }
                                bj4VarO.U(false);
                                ox6 ox6VarC2 = ir9.c(ox6Var2, 1.0f);
                                g2b g2bVar = g2b.a;
                                i13 = i3;
                                bj4VarO.K(1099100252);
                                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                                objF3 = bj4VarO.f();
                                if (zJ2 || objF3 == c0187a) {
                                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                    bj4VarO.C(objF3);
                                }
                                bj4VarO.U(false);
                                ox6 ox6VarH = eo7.h(t6a.b(ox6VarC2, g2bVar, (PointerInputEventHandler) objF3), go7VarB);
                                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                                bVar4 = bVar3;
                                iHashCode = Long.hashCode(bj4VarO.T);
                                kw7VarP = bj4VarO.P();
                                ox6VarC = it1.c(bj4VarO, ox6VarH);
                                bt1.c.getClass();
                                aVar2 = bt1.a.b;
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
                                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                                bj4VarO.K(-1990916379);
                                if ((bottomMetadata == null && ClickableMessageRow$lambda$1(h37Var)) || (bottomMetadata != null && bottomMetadata.getAlwaysShow())) {
                                    b47.b(bj4VarO, ir9.d(aVar, bottomMetadata.m199getPaddingD9Ej5fM()));
                                    String text = bottomMetadata.getText();
                                    bj4VarO.K(-1990906701);
                                    boolean zShouldShowAttribution = BubbleMessageRowKt.shouldShowAttribution(part);
                                    String string = BuildConfig.FLAVOR;
                                    if (zShouldShowAttribution) {
                                        Phrase phraseFrom = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_gif_attribution);
                                        List<Block> blocks = part.getBlocks();
                                        blocks.getClass();
                                        Block block = (Block) th1.A(blocks);
                                        if (block != null && (attribution = block.getAttribution()) != null) {
                                            string = attribution;
                                        }
                                        string = phraseFrom.put("providername", string).format().toString();
                                    }
                                    z = false;
                                    bj4VarO.U(false);
                                    BubbleMessageRowKt.MessageMeta(null, text, string, true, bj4VarO, 3072, 1);
                                }
                                bj4VarO.U(z);
                                bj4VarO.U(true);
                                go7Var3 = go7VarB;
                                mh4Var6 = mh4Var3;
                                bVar5 = bVar4;
                            } else {
                                bj4VarO.u();
                                bVar5 = bVar2;
                                go7Var3 = go7Var2;
                                mh4Var6 = mh4Var2;
                            }
                            ox6Var3 = ox6Var2;
                            xj8VarW = bj4VarO.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: ze1
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        gi4Var2 = gi4Var;
                        if ((599187 & i3) == 599186) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC3 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar2 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH2 = eo7.h(t6a.b(ox6VarC3, g2bVar2, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH2);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            z = bottomMetadata == null ? false : false;
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        } else {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC4 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar3 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH3 = eo7.h(t6a.b(ox6VarC4, g2bVar3, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH3);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ze1
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    mh4Var2 = mh4Var;
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            gi4Var2 = gi4Var;
                            if (bj4VarO.j(gi4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((599187 & i3) == 599186) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC5 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar4 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH4 = eo7.h(t6a.b(ox6VarC5, g2bVar4, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH4);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        } else {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC6 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar5 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH5 = eo7.h(t6a.b(ox6VarC6, g2bVar5, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH5);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ze1
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    gi4Var2 = gi4Var;
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC7 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar6 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH6 = eo7.h(t6a.b(ox6VarC7, g2bVar6, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH6);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC8 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar7 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH7 = eo7.h(t6a.b(ox6VarC8, g2bVar7, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH7);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                go7Var2 = go7Var;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        mh4Var2 = mh4Var;
                        if (bj4VarO.j(mh4Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            gi4Var2 = gi4Var;
                            if (bj4VarO.j(gi4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((599187 & i3) == 599186) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC9 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar8 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH8 = eo7.h(t6a.b(ox6VarC9, g2bVar8, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH8);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        } else {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC10 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar9 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH9 = eo7.h(t6a.b(ox6VarC10, g2bVar9, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH9);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ze1
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    gi4Var2 = gi4Var;
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC11 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar10 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH10 = eo7.h(t6a.b(ox6VarC11, g2bVar10, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH10);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC12 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar11 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH11 = eo7.h(t6a.b(ox6VarC12, g2bVar11, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH11);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                mh4Var2 = mh4Var;
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC13 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar12 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH12 = eo7.h(t6a.b(ox6VarC13, g2bVar12, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH12);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC14 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar13 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH13 = eo7.h(t6a.b(ox6VarC14, g2bVar13, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH13);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC15 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar14 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH14 = eo7.h(t6a.b(ox6VarC15, g2bVar14, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH14);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC16 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar15 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH15 = eo7.h(t6a.b(ox6VarC16, g2bVar15, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH15);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            bVar2 = bVar;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    go7Var2 = go7Var;
                    if (bj4VarO.J(go7Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        mh4Var2 = mh4Var;
                        if (bj4VarO.j(mh4Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            gi4Var2 = gi4Var;
                            if (bj4VarO.j(gi4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((599187 & i3) == 599186) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC17 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar16 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH16 = eo7.h(t6a.b(ox6VarC17, g2bVar16, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH16);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        } else {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC18 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar17 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH17 = eo7.h(t6a.b(ox6VarC18, g2bVar17, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH17);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ze1
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    gi4Var2 = gi4Var;
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC19 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar18 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH18 = eo7.h(t6a.b(ox6VarC19, g2bVar18, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH18);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC110 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar19 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH19 = eo7.h(t6a.b(ox6VarC110, g2bVar19, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH19);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                mh4Var2 = mh4Var;
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC111 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar110 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH110 = eo7.h(t6a.b(ox6VarC111, g2bVar110, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH110);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC112 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar111 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH111 = eo7.h(t6a.b(ox6VarC112, g2bVar111, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH111);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC113 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar112 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH112 = eo7.h(t6a.b(ox6VarC113, g2bVar112, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH112);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC114 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar113 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH113 = eo7.h(t6a.b(ox6VarC114, g2bVar113, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH113);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            go7Var2 = go7Var;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC115 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar114 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH114 = eo7.h(t6a.b(ox6VarC115, g2bVar114, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH114);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC116 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar115 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH115 = eo7.h(t6a.b(ox6VarC116, g2bVar115, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH115);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC117 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar116 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH116 = eo7.h(t6a.b(ox6VarC117, g2bVar116, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH116);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC118 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar117 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH117 = eo7.h(t6a.b(ox6VarC118, g2bVar117, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH117);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            mh4Var2 = mh4Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    gi4Var2 = gi4Var;
                    if (bj4VarO.j(gi4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC119 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar118 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH118 = eo7.h(t6a.b(ox6VarC119, g2bVar118, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH118);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC1110 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar119 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH119 = eo7.h(t6a.b(ox6VarC1110, g2bVar119, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH119);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            gi4Var2 = gi4Var;
            if ((599187 & i3) == 599186) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC1111 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar1110 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH1110 = eo7.h(t6a.b(ox6VarC1111, g2bVar1110, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH1110);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC1112 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar1111 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH1111 = eo7.h(t6a.b(ox6VarC1112, g2bVar1111, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH1111);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ze1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.J(bottomMetadata)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                bVar2 = bVar;
                if (bj4VarO.J(bVar2)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    go7Var2 = go7Var;
                    if (bj4VarO.J(go7Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        mh4Var2 = mh4Var;
                        if (bj4VarO.j(mh4Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((i2 & 64) != 0) {
                        if ((i & 1572864) == 0) {
                            gi4Var2 = gi4Var;
                            if (bj4VarO.j(gi4Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        if ((599187 & i3) == 599186) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC1113 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar1112 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH1112 = eo7.h(t6a.b(ox6VarC1113, g2bVar1112, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH1112);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        } else {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            } else {
                                ox6Var2 = ox6Var2;
                            }
                            if (i5 != 0) {
                                bVar3 = di.a.m;
                            } else {
                                bVar3 = bVar2;
                            }
                            if (i7 != 0) {
                                go7VarB = eo7.b(3);
                            } else {
                                go7VarB = go7Var2;
                            }
                            if (i9 != 0) {
                                mh4Var3 = null;
                            } else {
                                mh4Var3 = mh4Var2;
                            }
                            bj4VarO.K(1099063116);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            h37Var = (h37) objF;
                            i12 = 0;
                            bj4VarO.U(false);
                            qf1Var = (qf1) bj4VarO.F(qu1.e);
                            bj4VarO.K(1099068212);
                            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                            objF2 = bj4VarO.f();
                            if (zJ) {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new mh4() { // from class: xe1
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                    }
                                };
                                bj4VarO.C(objF2);
                            }
                            mh4Var4 = (mh4) objF2;
                            bj4VarO.U(false);
                            bj4VarO.K(1099094981);
                            if (mh4Var3 == null) {
                                bj4VarO.K(1099095756);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new ye1(i12, h37Var);
                                    bj4VarO.C(objF4);
                                }
                                mh4Var5 = (mh4) objF4;
                                bj4VarO.U(false);
                            } else {
                                mh4Var5 = mh4Var3;
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarC1114 = ir9.c(ox6Var2, 1.0f);
                            g2b g2bVar1113 = g2b.a;
                            i13 = i3;
                            bj4VarO.K(1099100252);
                            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                            objF3 = bj4VarO.f();
                            if (zJ2) {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            ox6 ox6VarH1113 = eo7.h(t6a.b(ox6VarC1114, g2bVar1113, (PointerInputEventHandler) objF3), go7VarB);
                            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                            bVar4 = bVar3;
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH1113);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                            bj4VarO.K(-1990916379);
                            if (bottomMetadata == null) {
                            }
                            bj4VarO.U(z);
                            bj4VarO.U(true);
                            go7Var3 = go7VarB;
                            mh4Var6 = mh4Var3;
                            bVar5 = bVar4;
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ze1
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    gi4Var2 = gi4Var;
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC1115 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar1114 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH1114 = eo7.h(t6a.b(ox6VarC1115, g2bVar1114, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH1114);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC1116 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar1115 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH1115 = eo7.h(t6a.b(ox6VarC1116, g2bVar1115, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH1115);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                mh4Var2 = mh4Var;
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC1117 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar1116 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH1116 = eo7.h(t6a.b(ox6VarC1117, g2bVar1116, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH1116);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC1118 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar1117 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH1117 = eo7.h(t6a.b(ox6VarC1118, g2bVar1117, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH1117);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC1119 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar1118 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH1118 = eo7.h(t6a.b(ox6VarC1119, g2bVar1118, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH1118);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC11110 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar1119 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH1119 = eo7.h(t6a.b(ox6VarC11110, g2bVar1119, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH1119);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            go7Var2 = go7Var;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC11111 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar11110 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH11110 = eo7.h(t6a.b(ox6VarC11111, g2bVar11110, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH11110);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC11112 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar11111 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH11111 = eo7.h(t6a.b(ox6VarC11112, g2bVar11111, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH11111);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC11113 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar11112 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH11112 = eo7.h(t6a.b(ox6VarC11113, g2bVar11112, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH11112);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC11114 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar11113 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH11113 = eo7.h(t6a.b(ox6VarC11114, g2bVar11113, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH11113);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            mh4Var2 = mh4Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    gi4Var2 = gi4Var;
                    if (bj4VarO.j(gi4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC11115 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar11114 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH11114 = eo7.h(t6a.b(ox6VarC11115, g2bVar11114, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH11114);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC11116 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar11115 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH11115 = eo7.h(t6a.b(ox6VarC11116, g2bVar11115, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH11115);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            gi4Var2 = gi4Var;
            if ((599187 & i3) == 599186) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC11117 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar11116 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH11116 = eo7.h(t6a.b(ox6VarC11117, g2bVar11116, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH11116);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC11118 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar11117 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH11117 = eo7.h(t6a.b(ox6VarC11118, g2bVar11117, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH11117);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ze1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        bVar2 = bVar;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                go7Var2 = go7Var;
                if (bj4VarO.J(go7Var2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 1572864) == 0) {
                        gi4Var2 = gi4Var;
                        if (bj4VarO.j(gi4Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    if ((599187 & i3) == 599186) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC11119 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar11118 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH11118 = eo7.h(t6a.b(ox6VarC11119, g2bVar11118, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH11118);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        } else {
                            ox6Var2 = ox6Var2;
                        }
                        if (i5 != 0) {
                            bVar3 = di.a.m;
                        } else {
                            bVar3 = bVar2;
                        }
                        if (i7 != 0) {
                            go7VarB = eo7.b(3);
                        } else {
                            go7VarB = go7Var2;
                        }
                        if (i9 != 0) {
                            mh4Var3 = null;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        bj4VarO.K(1099063116);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        i12 = 0;
                        bj4VarO.U(false);
                        qf1Var = (qf1) bj4VarO.F(qu1.e);
                        bj4VarO.K(1099068212);
                        zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                        objF2 = bj4VarO.f();
                        if (zJ) {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new mh4() { // from class: xe1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        mh4Var4 = (mh4) objF2;
                        bj4VarO.U(false);
                        bj4VarO.K(1099094981);
                        if (mh4Var3 == null) {
                            bj4VarO.K(1099095756);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ye1(i12, h37Var);
                                bj4VarO.C(objF4);
                            }
                            mh4Var5 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarC111110 = ir9.c(ox6Var2, 1.0f);
                        g2b g2bVar11119 = g2b.a;
                        i13 = i3;
                        bj4VarO.K(1099100252);
                        zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                        objF3 = bj4VarO.f();
                        if (zJ2) {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarH11119 = eo7.h(t6a.b(ox6VarC111110, g2bVar11119, (PointerInputEventHandler) objF3), go7VarB);
                        aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                        bVar4 = bVar3;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH11119);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                        bj4VarO.K(-1990916379);
                        if (bottomMetadata == null) {
                        }
                        bj4VarO.U(z);
                        bj4VarO.U(true);
                        go7Var3 = go7VarB;
                        mh4Var6 = mh4Var3;
                        bVar5 = bVar4;
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ze1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gi4Var2 = gi4Var;
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111111 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111110 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111110 = eo7.h(t6a.b(ox6VarC111111, g2bVar111110, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111110);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111112 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111111 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111111 = eo7.h(t6a.b(ox6VarC111112, g2bVar111111, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111111);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            mh4Var2 = mh4Var;
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    gi4Var2 = gi4Var;
                    if (bj4VarO.j(gi4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111113 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111112 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111112 = eo7.h(t6a.b(ox6VarC111113, g2bVar111112, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111112);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111114 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111113 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111113 = eo7.h(t6a.b(ox6VarC111114, g2bVar111113, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111113);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            gi4Var2 = gi4Var;
            if ((599187 & i3) == 599186) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC111115 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar111114 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH111114 = eo7.h(t6a.b(ox6VarC111115, g2bVar111114, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH111114);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC111116 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar111115 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH111115 = eo7.h(t6a.b(ox6VarC111116, g2bVar111115, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH111115);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ze1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        go7Var2 = go7Var;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((196608 & i) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    gi4Var2 = gi4Var;
                    if (bj4VarO.j(gi4Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((599187 & i3) == 599186) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111117 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111116 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111116 = eo7.h(t6a.b(ox6VarC111117, g2bVar111116, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111116);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    } else {
                        ox6Var2 = ox6Var2;
                    }
                    if (i5 != 0) {
                        bVar3 = di.a.m;
                    } else {
                        bVar3 = bVar2;
                    }
                    if (i7 != 0) {
                        go7VarB = eo7.b(3);
                    } else {
                        go7VarB = go7Var2;
                    }
                    if (i9 != 0) {
                        mh4Var3 = null;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    bj4VarO.K(1099063116);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    i12 = 0;
                    bj4VarO.U(false);
                    qf1Var = (qf1) bj4VarO.F(qu1.e);
                    bj4VarO.K(1099068212);
                    zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: xe1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    mh4Var4 = (mh4) objF2;
                    bj4VarO.U(false);
                    bj4VarO.K(1099094981);
                    if (mh4Var3 == null) {
                        bj4VarO.K(1099095756);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ye1(i12, h37Var);
                            bj4VarO.C(objF4);
                        }
                        mh4Var5 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarC111118 = ir9.c(ox6Var2, 1.0f);
                    g2b g2bVar111117 = g2b.a;
                    i13 = i3;
                    bj4VarO.K(1099100252);
                    zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarH111117 = eo7.h(t6a.b(ox6VarC111118, g2bVar111117, (PointerInputEventHandler) objF3), go7VarB);
                    aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                    bVar4 = bVar3;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111117);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                    bj4VarO.K(-1990916379);
                    if (bottomMetadata == null) {
                    }
                    bj4VarO.U(z);
                    bj4VarO.U(true);
                    go7Var3 = go7VarB;
                    mh4Var6 = mh4Var3;
                    bVar5 = bVar4;
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ze1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            gi4Var2 = gi4Var;
            if ((599187 & i3) == 599186) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC111119 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar111118 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH111118 = eo7.h(t6a.b(ox6VarC111119, g2bVar111118, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH111118);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC1111110 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar111119 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH111119 = eo7.h(t6a.b(ox6VarC1111110, g2bVar111119, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH111119);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ze1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        mh4Var2 = mh4Var;
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                gi4Var2 = gi4Var;
                if (bj4VarO.j(gi4Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((599187 & i3) == 599186) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC1111111 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar1111110 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH1111110 = eo7.h(t6a.b(ox6VarC1111111, g2bVar1111110, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH1111110);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                } else {
                    ox6Var2 = ox6Var2;
                }
                if (i5 != 0) {
                    bVar3 = di.a.m;
                } else {
                    bVar3 = bVar2;
                }
                if (i7 != 0) {
                    go7VarB = eo7.b(3);
                } else {
                    go7VarB = go7Var2;
                }
                if (i9 != 0) {
                    mh4Var3 = null;
                } else {
                    mh4Var3 = mh4Var2;
                }
                bj4VarO.K(1099063116);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                i12 = 0;
                bj4VarO.U(false);
                qf1Var = (qf1) bj4VarO.F(qu1.e);
                bj4VarO.K(1099068212);
                zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: xe1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4Var4 = (mh4) objF2;
                bj4VarO.U(false);
                bj4VarO.K(1099094981);
                if (mh4Var3 == null) {
                    bj4VarO.K(1099095756);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ye1(i12, h37Var);
                        bj4VarO.C(objF4);
                    }
                    mh4Var5 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                bj4VarO.U(false);
                ox6 ox6VarC1111112 = ir9.c(ox6Var2, 1.0f);
                g2b g2bVar1111111 = g2b.a;
                i13 = i3;
                bj4VarO.K(1099100252);
                zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarH1111111 = eo7.h(t6a.b(ox6VarC1111112, g2bVar1111111, (PointerInputEventHandler) objF3), go7VarB);
                aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
                bVar4 = bVar3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH1111111);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
                bj4VarO.K(-1990916379);
                if (bottomMetadata == null) {
                }
                bj4VarO.U(z);
                bj4VarO.U(true);
                go7Var3 = go7VarB;
                mh4Var6 = mh4Var3;
                bVar5 = bVar4;
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ze1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        gi4Var2 = gi4Var;
        if ((599187 & i3) == 599186) {
            aVar = ox6.a.t;
            if (i14 != 0) {
                ox6Var2 = aVar;
            } else {
                ox6Var2 = ox6Var2;
            }
            if (i5 != 0) {
                bVar3 = di.a.m;
            } else {
                bVar3 = bVar2;
            }
            if (i7 != 0) {
                go7VarB = eo7.b(3);
            } else {
                go7VarB = go7Var2;
            }
            if (i9 != 0) {
                mh4Var3 = null;
            } else {
                mh4Var3 = mh4Var2;
            }
            bj4VarO.K(1099063116);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            i12 = 0;
            bj4VarO.U(false);
            qf1Var = (qf1) bj4VarO.F(qu1.e);
            bj4VarO.K(1099068212);
            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: xe1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: xe1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                    }
                };
                bj4VarO.C(objF2);
            }
            mh4Var4 = (mh4) objF2;
            bj4VarO.U(false);
            bj4VarO.K(1099094981);
            if (mh4Var3 == null) {
                bj4VarO.K(1099095756);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new ye1(i12, h37Var);
                    bj4VarO.C(objF4);
                }
                mh4Var5 = (mh4) objF4;
                bj4VarO.U(false);
            } else {
                mh4Var5 = mh4Var3;
            }
            bj4VarO.U(false);
            ox6 ox6VarC1111113 = ir9.c(ox6Var2, 1.0f);
            g2b g2bVar1111112 = g2b.a;
            i13 = i3;
            bj4VarO.K(1099100252);
            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
            objF3 = bj4VarO.f();
            if (zJ2) {
                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                bj4VarO.C(objF3);
            } else {
                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            ox6 ox6VarH1111112 = eo7.h(t6a.b(ox6VarC1111113, g2bVar1111112, (PointerInputEventHandler) objF3), go7VarB);
            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
            bVar4 = bVar3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH1111112);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
            bj4VarO.K(-1990916379);
            if (bottomMetadata == null) {
            }
            bj4VarO.U(z);
            bj4VarO.U(true);
            go7Var3 = go7VarB;
            mh4Var6 = mh4Var3;
            bVar5 = bVar4;
        } else {
            aVar = ox6.a.t;
            if (i14 != 0) {
                ox6Var2 = aVar;
            } else {
                ox6Var2 = ox6Var2;
            }
            if (i5 != 0) {
                bVar3 = di.a.m;
            } else {
                bVar3 = bVar2;
            }
            if (i7 != 0) {
                go7VarB = eo7.b(3);
            } else {
                go7VarB = go7Var2;
            }
            if (i9 != 0) {
                mh4Var3 = null;
            } else {
                mh4Var3 = mh4Var2;
            }
            bj4VarO.K(1099063116);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            i12 = 0;
            bj4VarO.U(false);
            qf1Var = (qf1) bj4VarO.F(qu1.e);
            bj4VarO.K(1099068212);
            zJ = bj4VarO.j(qf1Var) | bj4VarO.j(part);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: xe1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: xe1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ClickableMessageRowKt.ClickableMessageRow$lambda$4$lambda$3(qf1Var, part);
                    }
                };
                bj4VarO.C(objF2);
            }
            mh4Var4 = (mh4) objF2;
            bj4VarO.U(false);
            bj4VarO.K(1099094981);
            if (mh4Var3 == null) {
                bj4VarO.K(1099095756);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new ye1(i12, h37Var);
                    bj4VarO.C(objF4);
                }
                mh4Var5 = (mh4) objF4;
                bj4VarO.U(false);
            } else {
                mh4Var5 = mh4Var3;
            }
            bj4VarO.U(false);
            ox6 ox6VarC1111114 = ir9.c(ox6Var2, 1.0f);
            g2b g2bVar1111113 = g2b.a;
            i13 = i3;
            bj4VarO.K(1099100252);
            zJ2 = bj4VarO.J(mh4Var4) | bj4VarO.J(mh4Var5);
            objF3 = bj4VarO.f();
            if (zJ2) {
                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                bj4VarO.C(objF3);
            } else {
                objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(mh4Var4, mh4Var5);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            ox6 ox6VarH1111113 = eo7.h(t6a.b(ox6VarC1111114, g2bVar1111113, (PointerInputEventHandler) objF3), go7VarB);
            aj1VarA = yi1.a(c30.c, bVar3, bj4VarO, (((i13 >> 3) & 896) >> 3) & 112);
            bVar4 = bVar3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH1111113);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            gi4Var2.invoke(cj1.a, part, mh4Var5, bj4VarO, Integer.valueOf(((i13 << 3) & 112) | 6 | ((i13 >> 9) & 7168)));
            bj4VarO.K(-1990916379);
            if (bottomMetadata == null) {
            }
            bj4VarO.U(z);
            bj4VarO.U(true);
            go7Var3 = go7VarB;
            mh4Var6 = mh4Var3;
            bVar5 = bVar4;
        }
        ox6Var3 = ox6Var2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ze1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ClickableMessageRowKt.ClickableMessageRow$lambda$9(part, ox6Var3, bottomMetadata, bVar5, go7Var3, mh4Var6, gi4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean ClickableMessageRow$lambda$1(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    private static final void ClickableMessageRow$lambda$2(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ClickableMessageRow$lambda$4$lambda$3(qf1 qf1Var, Part part) {
        try {
            qf1Var.a(BubbleMessageRowKt.getCopyText(part));
        } catch (SecurityException e) {
            TWIG.e("Clipboard access denied due to user restrictions: " + e.getMessage(), new Object[0]);
        } catch (Exception e2) {
            TWIG.e(a0.a(e2, new StringBuilder("Failed to copy message to clipboard: ")), new Object[0]);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ClickableMessageRow$lambda$6$lambda$5(h37 h37Var) {
        ClickableMessageRow$lambda$2(h37Var, !ClickableMessageRow$lambda$1(h37Var));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ClickableMessageRow$lambda$9(Part part, ox6 ox6Var, BottomMetadata bottomMetadata, di.b bVar, go7 go7Var, mh4 mh4Var, gi4 gi4Var, int i, int i2, jt1 jt1Var, int i3) {
        ClickableMessageRow(part, ox6Var, bottomMetadata, bVar, go7Var, mh4Var, gi4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
