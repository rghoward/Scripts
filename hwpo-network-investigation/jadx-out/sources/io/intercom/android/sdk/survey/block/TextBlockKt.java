package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.ah5;
import defpackage.b11;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.cka;
import defpackage.d73;
import defpackage.dd5;
import defpackage.di;
import defpackage.dv0;
import defpackage.ec9;
import defpackage.ed5;
import defpackage.eg5;
import defpackage.ei4;
import defpackage.fda;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ha9;
import defpackage.hc9;
import defpackage.hf3;
import defpackage.hf8;
import defpackage.ija;
import defpackage.ir9;
import defpackage.it1;
import defpackage.iw;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kg5;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l07;
import defpackage.l86;
import defpackage.m07;
import defpackage.m86;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mz7;
import defpackage.nf6;
import defpackage.ob4;
import defpackage.of3;
import defpackage.oh4;
import defpackage.oia;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.ph1;
import defpackage.qa4;
import defpackage.qha;
import defpackage.qi6;
import defpackage.qia;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.ria;
import defpackage.ss7;
import defpackage.tf5;
import defpackage.th1;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.uh1;
import defpackage.uh8;
import defpackage.v5a;
import defpackage.vaa;
import defpackage.wja;
import defpackage.ws0;
import defpackage.ww9;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xk3;
import defpackage.xx1;
import defpackage.yk3;
import defpackage.z2a;
import defpackage.z63;
import defpackage.zs0;
import defpackage.zu1;
import defpackage.zx1;
import io.ably.lib.rest.Auth;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TextBlockKt {
    private static final String formattedText = "Hello <b>World</b>. This <i><strike>text</strike>sentence</i> is form<b>att<u>ed</u></b> in simple html. <a href=\"https://github.com/ch4rl3x/HtmlText\">HtmlText</a>";
    private static final List<String> items = ws0.i("First item", "Second item with very long text. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", formattedText);
    private static final String textWithSources = "Hello World! This is <a href=\"https://github.com/ch4rl3x/HtmlText\">simple link</a>. And this is source link <a class=\"inline-citation\" data-entity-id=\"111\" data-entity-type=\"article\" data-source-index=\"1\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Leaving Elephant Energy\">link here</a> <a class=\"inline-citation\" data-entity-id=\"222\" data-entity-type=\"article\" data-source-index=\"2\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Article 2\">link here</a>";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @IntercomPreviews
    public static final void HeadingTextBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1066073995);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.HEADING.getSerializedName()).withText("Heading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(1821427103, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1844474362, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, jt1Var3, 0, 61);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.HeadingTextBlockPreview$lambda$29(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HeadingTextBlockPreview$lambda$29(int i, jt1 jt1Var, int i2) {
        HeadingTextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: InlineSourceBadge-FNF3uiM, reason: not valid java name */
    public static final void m448InlineSourceBadgeFNF3uiM(final String str, ox6 ox6Var, long j, jt1 jt1Var, final int i, final int i2) {
        String str2;
        int i3;
        ox6 ox6Var2;
        long jM774getSourceBackground0d7_KjU;
        int i4;
        ox6.a aVar;
        int i5;
        final long j2;
        boolean z;
        Object objF;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bj4 bj4Var;
        final ox6 ox6Var3;
        final long j3;
        xj8 xj8VarW;
        int i6;
        bj4 bj4VarO = jt1Var.o(234500363);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (bj4VarO.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jM774getSourceBackground0d7_KjU = j;
                if ((i2 & 4) == 0 || !bj4VarO.i(jM774getSourceBackground0d7_KjU)) {
                    i6 = 128;
                } else {
                    i6 = 256;
                }
                i3 |= i6;
            } else {
                jM774getSourceBackground0d7_KjU = j;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                bj4VarO.v0();
                i4 = i & 1;
                aVar = ox6.a.t;
                if (i4 != 0 || bj4VarO.c0()) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 4) != 0) {
                        jM774getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m774getSourceBackground0d7_KjU();
                        i3 &= -897;
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                i5 = i3;
                j2 = jM774getSourceBackground0d7_KjU;
                bj4VarO.V();
                ox6 ox6VarH = ox6Var2.H(ir9.c);
                bj4VarO.K(-1159000296);
                z = (((i5 & 896) ^ 384) <= 256 && bj4VarO.i(j2)) || (i5 & 384) == 256;
                objF = bj4VarO.f();
                if (z || objF == jt1.a.a) {
                    objF = new oh4() { // from class: oba
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(j2, (d73) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarC2 = z63.c(ox6VarH, (oh4) objF);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC2);
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
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ox6 ox6VarF = kv0.a.f(aVar, di.a.e);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i8 = IntercomTheme.$stable;
                mia.b(str2, ox6VarF, gh5.a(intercomTheme, bj4VarO, i8), 0L, ob4.z, 0L, null, 0L, 0, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i8).getType05(), bj4VarO, (i5 & 14) | 1572864, 24576, 114616);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                ox6Var3 = ox6Var2;
                j3 = j2;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var3 = ox6Var2;
                j3 = jM774getSourceBackground0d7_KjU;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: pba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$11(str, ox6Var3, j3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i & 384) == 0) {
            jM774getSourceBackground0d7_KjU = j;
            if ((i2 & 4) == 0) {
                i6 = 128;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        } else {
            jM774getSourceBackground0d7_KjU = j;
        }
        if ((i3 & 147) == 146) {
            bj4VarO.v0();
            i4 = i & 1;
            aVar = ox6.a.t;
            if (i4 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 4) != 0) {
                    jM774getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m774getSourceBackground0d7_KjU();
                    i3 &= -897;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 4) != 0) {
                    jM774getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m774getSourceBackground0d7_KjU();
                    i3 &= -897;
                }
            }
            i5 = i3;
            j2 = jM774getSourceBackground0d7_KjU;
            bj4VarO.V();
            ox6 ox6VarH2 = ox6Var2.H(ir9.c);
            bj4VarO.K(-1159000296);
            if (((i5 & 896) ^ 384) <= 256) {
            }
            objF = bj4VarO.f();
            if (z) {
                objF = new oh4() { // from class: oba
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(j2, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: oba
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(j2, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC3 = z63.c(ox6VarH2, (oh4) objF);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC3);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarF2 = kv0.a.f(aVar, di.a.e);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i9 = IntercomTheme.$stable;
            mia.b(str2, ox6VarF2, gh5.a(intercomTheme2, bj4VarO, i9), 0L, ob4.z, 0L, null, 0L, 0, false, 1, 0, null, intercomTheme2.getTypography(bj4VarO, i9).getType05(), bj4VarO, (i5 & 14) | 1572864, 24576, 114616);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            ox6Var3 = ox6Var2;
            j3 = j2;
        } else {
            bj4VarO.v0();
            i4 = i & 1;
            aVar = ox6.a.t;
            if (i4 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 4) != 0) {
                    jM774getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m774getSourceBackground0d7_KjU();
                    i3 &= -897;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 4) != 0) {
                    jM774getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m774getSourceBackground0d7_KjU();
                    i3 &= -897;
                }
            }
            i5 = i3;
            j2 = jM774getSourceBackground0d7_KjU;
            bj4VarO.V();
            ox6 ox6VarH3 = ox6Var2.H(ir9.c);
            bj4VarO.K(-1159000296);
            if (((i5 & 896) ^ 384) <= 256) {
            }
            objF = bj4VarO.f();
            if (z) {
                objF = new oh4() { // from class: oba
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(j2, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: oba
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(j2, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC4 = z63.c(ox6VarH3, (oh4) objF);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC4);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarF3 = kv0.a.f(aVar, di.a.e);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i10 = IntercomTheme.$stable;
            mia.b(str2, ox6VarF3, gh5.a(intercomTheme3, bj4VarO, i10), 0L, ob4.z, 0L, null, 0L, 0, false, 1, 0, null, intercomTheme3.getTypography(bj4VarO, i10).getType05(), bj4VarO, (i5 & 14) | 1572864, 24576, 114616);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            ox6Var3 = ox6Var2;
            j3 = j2;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: pba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$11(str, ox6Var3, j3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourceBadge_FNF3uiM$lambda$11(String str, ox6 ox6Var, long j, int i, int i2, jt1 jt1Var, int i3) {
        m448InlineSourceBadgeFNF3uiM(str, ox6Var, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourceBadge_FNF3uiM$lambda$9$lambda$8(long j, d73 d73Var) {
        d73Var.getClass();
        d73.N(d73Var, j, 0.0f, 0L, 0, 126);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void InlineSourcesTextBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1209811272);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(textWithSources).build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(2099084386, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(954415229, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, true, null, jt1Var3, 24576, 45);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.InlineSourcesTextBlockPreview$lambda$34(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InlineSourcesTextBlockPreview$lambda$34(int i, jt1 jt1Var, int i2) {
        InlineSourcesTextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void OrderedListTextBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(627599340);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.ORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(644450326, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(-585789711, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, jt1Var3, 0, 61);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.OrderedListTextBlockPreview$lambda$32(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b OrderedListTextBlockPreview$lambda$32(int i, jt1 jt1Var, int i2) {
        OrderedListTextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void SubheadingTextBlockPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1598324377);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.SUBHEADING.getSerializedName()).withText("Subheading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-756436689, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(-1350311180, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, jt1Var3, 0, 61);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zs0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubheadingTextBlockPreview$lambda$30(int i, jt1 jt1Var, int i2) {
        SubheadingTextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019b  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f  */
    public static final void TextBlock(ox6 ox6Var, final BlockRenderData blockRenderData, SuffixText suffixText, oh4<? super ria, g2b> oh4Var, boolean z, oh4<? super List<InlineSource>, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        BlockRenderData blockRenderData2;
        SuffixText suffixText2;
        int i4;
        oh4<? super ria, g2b> oh4Var3;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        oh4<? super List<InlineSource>, g2b> oh4Var4;
        int i9;
        ox6 ox6Var3;
        SuffixText no_suffix;
        jt1.a.C0187a c0187a;
        oh4<? super ria, g2b> oh4Var5;
        oh4<? super List<InlineSource>, g2b> oh4Var6;
        iw iwVar;
        iw iwVarI;
        Object objF;
        final oh4<? super List<InlineSource>, g2b> oh4Var7;
        final ox6 ox6Var4;
        final oh4<? super ria, g2b> oh4Var8;
        final boolean z3;
        final SuffixText suffixText3;
        iw.b bVar;
        int iH;
        Object objF2;
        Object objF3;
        xj8 xj8VarW;
        blockRenderData.getClass();
        bj4 bj4VarO = jt1Var.o(-295791429);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            blockRenderData2 = blockRenderData;
        } else {
            blockRenderData2 = blockRenderData;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.j(blockRenderData2) ? 32 : 16;
            }
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                suffixText2 = suffixText;
                i3 |= bj4VarO.J(suffixText2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var4 = oh4Var2;
                            if (bj4VarO.j(oh4Var4)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i11 != 0) {
                                no_suffix = SuffixText.Companion.getNO_SUFFIX();
                            } else {
                                no_suffix = suffixText2;
                            }
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(1265134465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new xk3(3);
                                    bj4VarO.C(objF3);
                                }
                                bj4VarO.U(false);
                                oh4Var5 = (oh4) objF3;
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(1265137857);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new yk3(4);
                                    bj4VarO.C(objF2);
                                }
                                oh4Var6 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            Block block = blockRenderData2.getBlock();
                            BlockRenderTextStyle textStyle = blockRenderData2.getTextStyle();
                            int i12 = (i3 >> 6) & 8064;
                            boolean z4 = z2;
                            js7<iw, Set<InlineSource>> js7VarTextToRender = textToRender(block, textStyle, z4, oh4Var6, bj4VarO, i12);
                            iwVar = js7VarTextToRender.t;
                            Set<InlineSource> set = js7VarTextToRender.u;
                            if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                                iwVarI = iwVar;
                            } else {
                                bVar = new iw.b();
                                bVar.b(iwVar);
                                iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                                try {
                                    bVar.c(no_suffix.getText());
                                    g2b g2bVar = g2b.a;
                                    bVar.e(iH);
                                    iwVarI = bVar.i();
                                } catch (Throwable th) {
                                    bVar.e(iH);
                                    throw th;
                                }
                            }
                            bj4VarO.K(1265159187);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = bl7.i(null);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            ox6 ox6Var5 = ox6Var3;
                            SuffixText suffixText4 = no_suffix;
                            ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle, blockRenderData2, block, ox6Var5, iwVar, suffixText4, set, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                            oh4Var7 = oh4Var6;
                            ox6Var4 = ox6Var5;
                            oh4Var8 = oh4Var5;
                            z3 = z4;
                            suffixText3 = suffixText4;
                        } else {
                            bj4VarO.u();
                            ox6Var4 = ox6Var2;
                            suffixText3 = suffixText2;
                            oh4Var8 = oh4Var3;
                            z3 = z2;
                            oh4Var7 = oh4Var4;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: uba
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    oh4Var4 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block2 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle2 = blockRenderData2.getTextStyle();
                        int i13 = (i3 >> 6) & 8064;
                        boolean z5 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender2 = textToRender(block2, textStyle2, z5, oh4Var6, bj4VarO, i13);
                        iwVar = js7VarTextToRender2.t;
                        Set<InlineSource> set2 = js7VarTextToRender2.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar2 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var6 = ox6Var3;
                        SuffixText suffixText5 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle2, blockRenderData2, block2, ox6Var6, iwVar, suffixText5, set2, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var6;
                        oh4Var8 = oh4Var5;
                        z3 = z5;
                        suffixText3 = suffixText5;
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block3 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle3 = blockRenderData2.getTextStyle();
                        int i14 = (i3 >> 6) & 8064;
                        boolean z6 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender3 = textToRender(block3, textStyle3, z6, oh4Var6, bj4VarO, i14);
                        iwVar = js7VarTextToRender3.t;
                        Set<InlineSource> set3 = js7VarTextToRender3.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar3 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var7 = ox6Var3;
                        SuffixText suffixText6 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle3, blockRenderData2, block3, ox6Var7, iwVar, suffixText6, set3, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var7;
                        oh4Var8 = oh4Var5;
                        z3 = z6;
                        suffixText3 = suffixText6;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: uba
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                z2 = z;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block4 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle4 = blockRenderData2.getTextStyle();
                        int i15 = (i3 >> 6) & 8064;
                        boolean z7 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender4 = textToRender(block4, textStyle4, z7, oh4Var6, bj4VarO, i15);
                        iwVar = js7VarTextToRender4.t;
                        Set<InlineSource> set4 = js7VarTextToRender4.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar4 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var8 = ox6Var3;
                        SuffixText suffixText7 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle4, blockRenderData2, block4, ox6Var8, iwVar, suffixText7, set4, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var8;
                        oh4Var8 = oh4Var5;
                        z3 = z7;
                        suffixText3 = suffixText7;
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block5 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle5 = blockRenderData2.getTextStyle();
                        int i16 = (i3 >> 6) & 8064;
                        boolean z8 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender5 = textToRender(block5, textStyle5, z8, oh4Var6, bj4VarO, i16);
                        iwVar = js7VarTextToRender5.t;
                        Set<InlineSource> set5 = js7VarTextToRender5.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar5 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var9 = ox6Var3;
                        SuffixText suffixText8 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle5, blockRenderData2, block5, ox6Var9, iwVar, suffixText8, set5, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var9;
                        oh4Var8 = oh4Var5;
                        z3 = z8;
                        suffixText3 = suffixText8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: uba
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block6 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle6 = blockRenderData2.getTextStyle();
                    int i17 = (i3 >> 6) & 8064;
                    boolean z9 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender6 = textToRender(block6, textStyle6, z9, oh4Var6, bj4VarO, i17);
                    iwVar = js7VarTextToRender6.t;
                    Set<InlineSource> set6 = js7VarTextToRender6.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar6 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var10 = ox6Var3;
                    SuffixText suffixText9 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle6, blockRenderData2, block6, ox6Var10, iwVar, suffixText9, set6, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var10;
                    oh4Var8 = oh4Var5;
                    z3 = z9;
                    suffixText3 = suffixText9;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block7 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle7 = blockRenderData2.getTextStyle();
                    int i18 = (i3 >> 6) & 8064;
                    boolean z10 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender7 = textToRender(block7, textStyle7, z10, oh4Var6, bj4VarO, i18);
                    iwVar = js7VarTextToRender7.t;
                    Set<InlineSource> set7 = js7VarTextToRender7.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar7 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var11 = ox6Var3;
                    SuffixText suffixText10 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle7, blockRenderData2, block7, ox6Var11, iwVar, suffixText10, set7, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var11;
                    oh4Var8 = oh4Var5;
                    z3 = z10;
                    suffixText3 = suffixText10;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var3 = oh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block8 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle8 = blockRenderData2.getTextStyle();
                        int i19 = (i3 >> 6) & 8064;
                        boolean z11 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender8 = textToRender(block8, textStyle8, z11, oh4Var6, bj4VarO, i19);
                        iwVar = js7VarTextToRender8.t;
                        Set<InlineSource> set8 = js7VarTextToRender8.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar8 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var12 = ox6Var3;
                        SuffixText suffixText11 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle8, blockRenderData2, block8, ox6Var12, iwVar, suffixText11, set8, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var12;
                        oh4Var8 = oh4Var5;
                        z3 = z11;
                        suffixText3 = suffixText11;
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block9 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle9 = blockRenderData2.getTextStyle();
                        int i110 = (i3 >> 6) & 8064;
                        boolean z12 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender9 = textToRender(block9, textStyle9, z12, oh4Var6, bj4VarO, i110);
                        iwVar = js7VarTextToRender9.t;
                        Set<InlineSource> set9 = js7VarTextToRender9.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar9 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var13 = ox6Var3;
                        SuffixText suffixText12 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle9, blockRenderData2, block9, ox6Var13, iwVar, suffixText12, set9, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var13;
                        oh4Var8 = oh4Var5;
                        z3 = z12;
                        suffixText3 = suffixText12;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: uba
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block10 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle10 = blockRenderData2.getTextStyle();
                    int i111 = (i3 >> 6) & 8064;
                    boolean z13 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender10 = textToRender(block10, textStyle10, z13, oh4Var6, bj4VarO, i111);
                    iwVar = js7VarTextToRender10.t;
                    Set<InlineSource> set10 = js7VarTextToRender10.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar10 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var14 = ox6Var3;
                    SuffixText suffixText13 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle10, blockRenderData2, block10, ox6Var14, iwVar, suffixText13, set10, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var14;
                    oh4Var8 = oh4Var5;
                    z3 = z13;
                    suffixText3 = suffixText13;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block11 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle11 = blockRenderData2.getTextStyle();
                    int i112 = (i3 >> 6) & 8064;
                    boolean z14 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender11 = textToRender(block11, textStyle11, z14, oh4Var6, bj4VarO, i112);
                    iwVar = js7VarTextToRender11.t;
                    Set<InlineSource> set11 = js7VarTextToRender11.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar11 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var15 = ox6Var3;
                    SuffixText suffixText14 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle11, blockRenderData2, block11, ox6Var15, iwVar, suffixText14, set11, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var15;
                    oh4Var8 = oh4Var5;
                    z3 = z14;
                    suffixText3 = suffixText14;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            z2 = z;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block12 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle12 = blockRenderData2.getTextStyle();
                    int i113 = (i3 >> 6) & 8064;
                    boolean z15 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender12 = textToRender(block12, textStyle12, z15, oh4Var6, bj4VarO, i113);
                    iwVar = js7VarTextToRender12.t;
                    Set<InlineSource> set12 = js7VarTextToRender12.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar12 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var16 = ox6Var3;
                    SuffixText suffixText15 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle12, blockRenderData2, block12, ox6Var16, iwVar, suffixText15, set12, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var16;
                    oh4Var8 = oh4Var5;
                    z3 = z15;
                    suffixText3 = suffixText15;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block13 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle13 = blockRenderData2.getTextStyle();
                    int i114 = (i3 >> 6) & 8064;
                    boolean z16 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender13 = textToRender(block13, textStyle13, z16, oh4Var6, bj4VarO, i114);
                    iwVar = js7VarTextToRender13.t;
                    Set<InlineSource> set13 = js7VarTextToRender13.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar13 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var17 = ox6Var3;
                    SuffixText suffixText16 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle13, blockRenderData2, block13, ox6Var17, iwVar, suffixText16, set13, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var17;
                    oh4Var8 = oh4Var5;
                    z3 = z16;
                    suffixText3 = suffixText16;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block14 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle14 = blockRenderData2.getTextStyle();
                int i115 = (i3 >> 6) & 8064;
                boolean z17 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender14 = textToRender(block14, textStyle14, z17, oh4Var6, bj4VarO, i115);
                iwVar = js7VarTextToRender14.t;
                Set<InlineSource> set14 = js7VarTextToRender14.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar14 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var18 = ox6Var3;
                SuffixText suffixText17 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle14, blockRenderData2, block14, ox6Var18, iwVar, suffixText17, set14, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var18;
                oh4Var8 = oh4Var5;
                z3 = z17;
                suffixText3 = suffixText17;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block15 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle15 = blockRenderData2.getTextStyle();
                int i116 = (i3 >> 6) & 8064;
                boolean z18 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender15 = textToRender(block15, textStyle15, z18, oh4Var6, bj4VarO, i116);
                iwVar = js7VarTextToRender15.t;
                Set<InlineSource> set15 = js7VarTextToRender15.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar15 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var19 = ox6Var3;
                SuffixText suffixText18 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle15, blockRenderData2, block15, ox6Var19, iwVar, suffixText18, set15, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var19;
                oh4Var8 = oh4Var5;
                z3 = z18;
                suffixText3 = suffixText18;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        suffixText2 = suffixText;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                oh4Var3 = oh4Var;
                if (bj4VarO.j(oh4Var3)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block16 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle16 = blockRenderData2.getTextStyle();
                        int i117 = (i3 >> 6) & 8064;
                        boolean z19 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender16 = textToRender(block16, textStyle16, z19, oh4Var6, bj4VarO, i117);
                        iwVar = js7VarTextToRender16.t;
                        Set<InlineSource> set16 = js7VarTextToRender16.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar16 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var110 = ox6Var3;
                        SuffixText suffixText19 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle16, blockRenderData2, block16, ox6Var110, iwVar, suffixText19, set16, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var110;
                        oh4Var8 = oh4Var5;
                        z3 = z19;
                        suffixText3 = suffixText19;
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            no_suffix = SuffixText.Companion.getNO_SUFFIX();
                        } else {
                            no_suffix = suffixText2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1265134465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new xk3(3);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF3;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(1265137857);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new yk3(4);
                                bj4VarO.C(objF2);
                            }
                            oh4Var6 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        Block block17 = blockRenderData2.getBlock();
                        BlockRenderTextStyle textStyle17 = blockRenderData2.getTextStyle();
                        int i118 = (i3 >> 6) & 8064;
                        boolean z110 = z2;
                        js7<iw, Set<InlineSource>> js7VarTextToRender17 = textToRender(block17, textStyle17, z110, oh4Var6, bj4VarO, i118);
                        iwVar = js7VarTextToRender17.t;
                        Set<InlineSource> set17 = js7VarTextToRender17.u;
                        if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                            bVar = new iw.b();
                            bVar.b(iwVar);
                            iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                            bVar.c(no_suffix.getText());
                            g2b g2bVar17 = g2b.a;
                            bVar.e(iH);
                            iwVarI = bVar.i();
                        } else {
                            iwVarI = iwVar;
                        }
                        bj4VarO.K(1265159187);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = bl7.i(null);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var111 = ox6Var3;
                        SuffixText suffixText110 = no_suffix;
                        ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle17, blockRenderData2, block17, ox6Var111, iwVar, suffixText110, set17, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                        oh4Var7 = oh4Var6;
                        ox6Var4 = ox6Var111;
                        oh4Var8 = oh4Var5;
                        z3 = z110;
                        suffixText3 = suffixText110;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: uba
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block18 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle18 = blockRenderData2.getTextStyle();
                    int i119 = (i3 >> 6) & 8064;
                    boolean z111 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender18 = textToRender(block18, textStyle18, z111, oh4Var6, bj4VarO, i119);
                    iwVar = js7VarTextToRender18.t;
                    Set<InlineSource> set18 = js7VarTextToRender18.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar18 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var112 = ox6Var3;
                    SuffixText suffixText111 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle18, blockRenderData2, block18, ox6Var112, iwVar, suffixText111, set18, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var112;
                    oh4Var8 = oh4Var5;
                    z3 = z111;
                    suffixText3 = suffixText111;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block19 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle19 = blockRenderData2.getTextStyle();
                    int i1110 = (i3 >> 6) & 8064;
                    boolean z112 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender19 = textToRender(block19, textStyle19, z112, oh4Var6, bj4VarO, i1110);
                    iwVar = js7VarTextToRender19.t;
                    Set<InlineSource> set19 = js7VarTextToRender19.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar19 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var113 = ox6Var3;
                    SuffixText suffixText112 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle19, blockRenderData2, block19, ox6Var113, iwVar, suffixText112, set19, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var113;
                    oh4Var8 = oh4Var5;
                    z3 = z112;
                    suffixText3 = suffixText112;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            z2 = z;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block110 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle110 = blockRenderData2.getTextStyle();
                    int i1111 = (i3 >> 6) & 8064;
                    boolean z113 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender110 = textToRender(block110, textStyle110, z113, oh4Var6, bj4VarO, i1111);
                    iwVar = js7VarTextToRender110.t;
                    Set<InlineSource> set110 = js7VarTextToRender110.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar110 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var114 = ox6Var3;
                    SuffixText suffixText113 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle110, blockRenderData2, block110, ox6Var114, iwVar, suffixText113, set110, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var114;
                    oh4Var8 = oh4Var5;
                    z3 = z113;
                    suffixText3 = suffixText113;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block111 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle111 = blockRenderData2.getTextStyle();
                    int i1112 = (i3 >> 6) & 8064;
                    boolean z114 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender111 = textToRender(block111, textStyle111, z114, oh4Var6, bj4VarO, i1112);
                    iwVar = js7VarTextToRender111.t;
                    Set<InlineSource> set111 = js7VarTextToRender111.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar111 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var115 = ox6Var3;
                    SuffixText suffixText114 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle111, blockRenderData2, block111, ox6Var115, iwVar, suffixText114, set111, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var115;
                    oh4Var8 = oh4Var5;
                    z3 = z114;
                    suffixText3 = suffixText114;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block112 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle112 = blockRenderData2.getTextStyle();
                int i1113 = (i3 >> 6) & 8064;
                boolean z115 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender112 = textToRender(block112, textStyle112, z115, oh4Var6, bj4VarO, i1113);
                iwVar = js7VarTextToRender112.t;
                Set<InlineSource> set112 = js7VarTextToRender112.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar112 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var116 = ox6Var3;
                SuffixText suffixText115 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle112, blockRenderData2, block112, ox6Var116, iwVar, suffixText115, set112, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var116;
                oh4Var8 = oh4Var5;
                z3 = z115;
                suffixText3 = suffixText115;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block113 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle113 = blockRenderData2.getTextStyle();
                int i1114 = (i3 >> 6) & 8064;
                boolean z116 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender113 = textToRender(block113, textStyle113, z116, oh4Var6, bj4VarO, i1114);
                iwVar = js7VarTextToRender113.t;
                Set<InlineSource> set113 = js7VarTextToRender113.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar113 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var117 = ox6Var3;
                SuffixText suffixText116 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle113, blockRenderData2, block113, ox6Var117, iwVar, suffixText116, set113, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var117;
                oh4Var8 = oh4Var5;
                z3 = z116;
                suffixText3 = suffixText116;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var3 = oh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) == 74898) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block114 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle114 = blockRenderData2.getTextStyle();
                    int i1115 = (i3 >> 6) & 8064;
                    boolean z117 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender114 = textToRender(block114, textStyle114, z117, oh4Var6, bj4VarO, i1115);
                    iwVar = js7VarTextToRender114.t;
                    Set<InlineSource> set114 = js7VarTextToRender114.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar114 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var118 = ox6Var3;
                    SuffixText suffixText117 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle114, blockRenderData2, block114, ox6Var118, iwVar, suffixText117, set114, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var118;
                    oh4Var8 = oh4Var5;
                    z3 = z117;
                    suffixText3 = suffixText117;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        no_suffix = SuffixText.Companion.getNO_SUFFIX();
                    } else {
                        no_suffix = suffixText2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1265134465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new xk3(3);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF3;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(1265137857);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new yk3(4);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    Block block115 = blockRenderData2.getBlock();
                    BlockRenderTextStyle textStyle115 = blockRenderData2.getTextStyle();
                    int i1116 = (i3 >> 6) & 8064;
                    boolean z118 = z2;
                    js7<iw, Set<InlineSource>> js7VarTextToRender115 = textToRender(block115, textStyle115, z118, oh4Var6, bj4VarO, i1116);
                    iwVar = js7VarTextToRender115.t;
                    Set<InlineSource> set115 = js7VarTextToRender115.u;
                    if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                        bVar = new iw.b();
                        bVar.b(iwVar);
                        iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        bVar.c(no_suffix.getText());
                        g2b g2bVar115 = g2b.a;
                        bVar.e(iH);
                        iwVarI = bVar.i();
                    } else {
                        iwVarI = iwVar;
                    }
                    bj4VarO.K(1265159187);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var119 = ox6Var3;
                    SuffixText suffixText118 = no_suffix;
                    ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle115, blockRenderData2, block115, ox6Var119, iwVar, suffixText118, set115, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                    oh4Var7 = oh4Var6;
                    ox6Var4 = ox6Var119;
                    oh4Var8 = oh4Var5;
                    z3 = z118;
                    suffixText3 = suffixText118;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: uba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block116 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle116 = blockRenderData2.getTextStyle();
                int i1117 = (i3 >> 6) & 8064;
                boolean z119 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender116 = textToRender(block116, textStyle116, z119, oh4Var6, bj4VarO, i1117);
                iwVar = js7VarTextToRender116.t;
                Set<InlineSource> set116 = js7VarTextToRender116.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar116 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var1110 = ox6Var3;
                SuffixText suffixText119 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle116, blockRenderData2, block116, ox6Var1110, iwVar, suffixText119, set116, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var1110;
                oh4Var8 = oh4Var5;
                z3 = z119;
                suffixText3 = suffixText119;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block117 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle117 = blockRenderData2.getTextStyle();
                int i1118 = (i3 >> 6) & 8064;
                boolean z1110 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender117 = textToRender(block117, textStyle117, z1110, oh4Var6, bj4VarO, i1118);
                iwVar = js7VarTextToRender117.t;
                Set<InlineSource> set117 = js7VarTextToRender117.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar117 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var1111 = ox6Var3;
                SuffixText suffixText1110 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle117, blockRenderData2, block117, ox6Var1111, iwVar, suffixText1110, set117, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var1111;
                oh4Var8 = oh4Var5;
                z3 = z1110;
                suffixText3 = suffixText1110;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        z2 = z;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((74899 & i3) == 74898) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block118 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle118 = blockRenderData2.getTextStyle();
                int i1119 = (i3 >> 6) & 8064;
                boolean z1111 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender118 = textToRender(block118, textStyle118, z1111, oh4Var6, bj4VarO, i1119);
                iwVar = js7VarTextToRender118.t;
                Set<InlineSource> set118 = js7VarTextToRender118.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar118 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var1112 = ox6Var3;
                SuffixText suffixText1111 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle118, blockRenderData2, block118, ox6Var1112, iwVar, suffixText1111, set118, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var1112;
                oh4Var8 = oh4Var5;
                z3 = z1111;
                suffixText3 = suffixText1111;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    no_suffix = SuffixText.Companion.getNO_SUFFIX();
                } else {
                    no_suffix = suffixText2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1265134465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new xk3(3);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF3;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    bj4VarO.K(1265137857);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new yk3(4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                Block block119 = blockRenderData2.getBlock();
                BlockRenderTextStyle textStyle119 = blockRenderData2.getTextStyle();
                int i11110 = (i3 >> 6) & 8064;
                boolean z1112 = z2;
                js7<iw, Set<InlineSource>> js7VarTextToRender119 = textToRender(block119, textStyle119, z1112, oh4Var6, bj4VarO, i11110);
                iwVar = js7VarTextToRender119.t;
                Set<InlineSource> set119 = js7VarTextToRender119.u;
                if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                    bVar = new iw.b();
                    bVar.b(iwVar);
                    iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    bVar.c(no_suffix.getText());
                    g2b g2bVar119 = g2b.a;
                    bVar.e(iH);
                    iwVarI = bVar.i();
                } else {
                    iwVarI = iwVar;
                }
                bj4VarO.K(1265159187);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6Var1113 = ox6Var3;
                SuffixText suffixText1112 = no_suffix;
                ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle119, blockRenderData2, block119, ox6Var1113, iwVar, suffixText1112, set119, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
                oh4Var7 = oh4Var6;
                ox6Var4 = ox6Var1113;
                oh4Var8 = oh4Var5;
                z3 = z1112;
                suffixText3 = suffixText1112;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: uba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        oh4Var4 = oh4Var2;
        if ((74899 & i3) == 74898) {
            if (i10 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i11 != 0) {
                no_suffix = SuffixText.Companion.getNO_SUFFIX();
            } else {
                no_suffix = suffixText2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(1265134465);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new xk3(3);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF3;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i8 != 0) {
                bj4VarO.K(1265137857);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yk3(4);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var6 = oh4Var4;
            }
            Block block1110 = blockRenderData2.getBlock();
            BlockRenderTextStyle textStyle1110 = blockRenderData2.getTextStyle();
            int i11111 = (i3 >> 6) & 8064;
            boolean z1113 = z2;
            js7<iw, Set<InlineSource>> js7VarTextToRender1110 = textToRender(block1110, textStyle1110, z1113, oh4Var6, bj4VarO, i11111);
            iwVar = js7VarTextToRender1110.t;
            Set<InlineSource> set1110 = js7VarTextToRender1110.u;
            if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                bVar = new iw.b();
                bVar.b(iwVar);
                iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                bVar.c(no_suffix.getText());
                g2b g2bVar1110 = g2b.a;
                bVar.e(iH);
                iwVarI = bVar.i();
            } else {
                iwVarI = iwVar;
            }
            bj4VarO.K(1265159187);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6Var1114 = ox6Var3;
            SuffixText suffixText1113 = no_suffix;
            ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle1110, blockRenderData2, block1110, ox6Var1114, iwVar, suffixText1113, set1110, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
            oh4Var7 = oh4Var6;
            ox6Var4 = ox6Var1114;
            oh4Var8 = oh4Var5;
            z3 = z1113;
            suffixText3 = suffixText1113;
        } else {
            if (i10 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i11 != 0) {
                no_suffix = SuffixText.Companion.getNO_SUFFIX();
            } else {
                no_suffix = suffixText2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(1265134465);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new xk3(3);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF3;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i8 != 0) {
                bj4VarO.K(1265137857);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new yk3(4);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var6 = oh4Var4;
            }
            Block block1111 = blockRenderData2.getBlock();
            BlockRenderTextStyle textStyle1111 = blockRenderData2.getTextStyle();
            int i11112 = (i3 >> 6) & 8064;
            boolean z1114 = z2;
            js7<iw, Set<InlineSource>> js7VarTextToRender1111 = textToRender(block1111, textStyle1111, z1114, oh4Var6, bj4VarO, i11112);
            iwVar = js7VarTextToRender1111.t;
            Set<InlineSource> set1111 = js7VarTextToRender1111.u;
            if (xj5.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
                bVar = new iw.b();
                bVar.b(iwVar);
                iH = bVar.h(new ww9(no_suffix.m447getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                bVar.c(no_suffix.getText());
                g2b g2bVar1111 = g2b.a;
                bVar.e(iH);
                iwVarI = bVar.i();
            } else {
                iwVarI = iwVar;
            }
            bj4VarO.K(1265159187);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6Var1115 = ox6Var3;
            SuffixText suffixText1114 = no_suffix;
            ha9.a(gr1.b(-1368971764, new AnonymousClass3(textStyle1111, blockRenderData2, block1111, ox6Var1115, iwVar, suffixText1114, set1111, iwVarI, oh4Var5, (h37) objF), bj4VarO), bj4VarO, 6);
            oh4Var7 = oh4Var6;
            ox6Var4 = ox6Var1115;
            oh4Var8 = oh4Var5;
            z3 = z1114;
            suffixText3 = suffixText1114;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.TextBlock$lambda$7(ox6Var4, blockRenderData, suffixText3, oh4Var8, z3, oh4Var7, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlock$lambda$1$lambda$0(ria riaVar) {
        riaVar.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlock$lambda$3$lambda$2(List list) {
        list.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlock$lambda$7(ox6 ox6Var, BlockRenderData blockRenderData, SuffixText suffixText, oh4 oh4Var, boolean z, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        TextBlock(ox6Var, blockRenderData, suffixText, oh4Var, z, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextBlockAlignmentPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1235422502);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextBlockKt.INSTANCE.m437getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.TextBlockAlignmentPreview$lambda$28(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlockAlignmentPreview$lambda$28(int i, jt1 jt1Var, int i2) {
        TextBlockAlignmentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(443046075);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formattedText).build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-140923183, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(30237398, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                BlockRenderTextStyle paragraphDefault = BlockRenderTextStyle.Companion.getParagraphDefault();
                                int i4 = uh1.l;
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, BlockRenderTextStyle.m414copyZsBm6Y$default(paragraphDefault, 0L, null, 0L, null, new uh1(uh1.h), null, 47, null), 14, null), null, null, false, null, jt1Var3, 0, 61);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.TextBlockPreview$lambda$27(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlockPreview$lambda$27(int i, jt1 jt1Var, int i2) {
        TextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextBlockWithSuffixPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-979323118);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Paragraph with suffix").build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(960883112, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(367008621, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                BlockRenderData blockRenderData = new BlockRenderData(block2, null, null, null, null, 30, null);
                                int i4 = uh1.l;
                                TextBlockKt.TextBlock(null, blockRenderData, new SuffixText(Auth.WILDCARD_CLIENTID, BuildConfig.FLAVOR, uh1.f, null), null, false, null, jt1Var3, 0, 57);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.TextBlockWithSuffixPreview$lambda$31(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextBlockWithSuffixPreview$lambda$31(int i, jt1 jt1Var, int i2) {
        TextBlockWithSuffixPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UnorderedListTextBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-321451131);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.UNORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-1307522769, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        final Block block = blockBuild;
                        v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1842775370, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1.1
                            public final void invoke(jt1 jt1Var3, int i3) {
                                if ((i3 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                Block block2 = block;
                                block2.getClass();
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, jt1Var3, 0, 61);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 12582912, 127);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.UnorderedListTextBlockPreview$lambda$33(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnorderedListTextBlockPreview$lambda$33(int i, jt1 jt1Var, int i2) {
        UnorderedListTextBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources(iw.b bVar, iw iwVar, final Set<InlineSource> set, final oh4<? super List<InlineSource>, g2b> oh4Var) {
        int iF = bVar.f(new l86.a("inline_source", null, new m86() { // from class: qba
            @Override // defpackage.m86
            public final void a(l86 l86Var) {
                TextBlockKt.appendInlineSources$lambda$13(oh4Var, set, l86Var);
            }
        }));
        try {
            bVar.b(iwVar);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ed5.a(bVar, ((InlineSource) it.next()).getDataEntityId());
            }
            g2b g2bVar = g2b.a;
        } finally {
            bVar.e(iF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources$lambda$13(oh4 oh4Var, Set set, l86 l86Var) {
        l86Var.getClass();
        oh4Var.invoke(th1.T(set));
    }

    private static final js7<Set<InlineSource>, String> extractInlineSources(String str) {
        List listH;
        Pattern patternCompile = Pattern.compile("((?=<a)|(?<=</a>))");
        patternCompile.getClass();
        str.getClass();
        int i = 0;
        z2a.G(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listH = arrayList;
        } else {
            listH = ws0.h(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listH) {
            String str2 = (String) obj;
            if (z2a.o(str2, "<a", false) && z2a.o(str2, "</a>", false) && z2a.o(str2, "inline-citation", false)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            String str3 = (String) obj2;
            String strFindAttribute = findAttribute(str3, "href");
            String strFindAttribute2 = findAttribute(str3, "data-entity-id");
            String strFindAttribute3 = findAttribute(str3, "data-source-index");
            InlineSource inlineSource = (strFindAttribute == null || strFindAttribute.length() == 0 || strFindAttribute2 == null || strFindAttribute2.length() == 0 || strFindAttribute3 == null || strFindAttribute3.length() == 0) ? null : new InlineSource(strFindAttribute2, findAttribute(str3, "data-entity-type"), strFindAttribute3, strFindAttribute, findAttribute(str3, "title"));
            if (inlineSource != null) {
                arrayList4.add(inlineSource);
            }
        }
        return new js7<>(th1.X(arrayList4), th1.F(arrayList3, BuildConfig.FLAVOR, null, null, null, 62));
    }

    private static final String findAttribute(String str, String str2) {
        Pattern patternCompile = Pattern.compile(str2 + "=\".*?\"", 0);
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group();
        strGroup.getClass();
        return z2a.P(z2a.L(strGroup, "\"", strGroup), "\"");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final js7<iw, Set<InlineSource>> textListToRender(List<String> list, boolean z, BlockRenderTextStyle blockRenderTextStyle, oh4<? super List<InlineSource>, g2b> oh4Var, jt1 jt1Var, int i) {
        int i2;
        hf8 hf8Var;
        ria riaVar;
        ria riaVar2;
        ria riaVarC;
        char c;
        boolean z2;
        boolean z3 = z;
        list.getClass();
        blockRenderTextStyle.getClass();
        jt1Var.K(239669781);
        wja textStyle$intercom_sdk_base_release = blockRenderTextStyle.toTextStyle$intercom_sdk_base_release();
        qa4.a aVar = (qa4.a) jt1Var.F(qu1.k);
        hf8 hf8Var2 = qu1.h;
        tx2 tx2Var = (tx2) jt1Var.F(hf8Var2);
        tq5 tq5Var = (tq5) jt1Var.F(qu1.n);
        boolean zJ = jt1Var.J(aVar) | jt1Var.J(tx2Var) | jt1Var.h(tq5Var.ordinal()) | jt1Var.h(8);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new ija(aVar, tx2Var, tq5Var);
            jt1Var.C(objF);
        }
        ija ijaVar = (ija) objF;
        jt1Var.K(1608522873);
        boolean zJ2 = jt1Var.J(textStyle$intercom_sdk_base_release) | jt1Var.J(ijaVar);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == obj) {
            String strTextListToRender$bullet = textListToRender$bullet(z3, list.size());
            long jB = zx1.b(0, 0, 0, 0, 15);
            tq5 tq5Var2 = ijaVar.c;
            tx2 tx2Var2 = ijaVar.b;
            qa4.a aVar2 = ijaVar.a;
            iw iwVar = new iw(strTextListToRender$bullet);
            oia oiaVar = ijaVar.d;
            hf3 hf3Var = hf3.t;
            i2 = 0;
            hf8Var = hf8Var2;
            qia qiaVar = new qia(iwVar, textStyle$intercom_sdk_base_release, hf3Var, Integer.MAX_VALUE, true, 1, tx2Var2, tq5Var2, aVar2, jB);
            if (oiaVar != null) {
                b11 b11Var = new b11(qiaVar);
                nf6<b11, ria> nf6Var = oiaVar.a;
                if (nf6Var != null) {
                    riaVarC = nf6Var.c(b11Var);
                } else if (xj5.a(oiaVar.b, b11Var)) {
                    riaVarC = oiaVar.c;
                } else {
                    riaVar = null;
                }
                riaVar = riaVarC;
                if (riaVar == null || riaVar.b.a.a()) {
                    riaVar = null;
                }
            } else {
                riaVar = null;
            }
            if (riaVar != null) {
                l07 l07Var = riaVar.b;
                riaVar2 = new ria(qiaVar, l07Var, zx1.d(jB, (((long) ((int) Math.ceil(l07Var.e))) & 4294967295L) | (((long) ((int) Math.ceil(l07Var.d))) << 32)));
            } else {
                m07 m07Var = new m07(iwVar, zu1.d(textStyle$intercom_sdk_base_release, tq5Var2), hf3Var, tx2Var2, aVar2);
                int iJ = xx1.j(jB);
                int iH = xx1.d(jB) ? xx1.h(jB) : Integer.MAX_VALUE;
                if (iJ != iH) {
                    iH = uh8.g((int) Math.ceil(m07Var.c()), iJ, iH);
                }
                l07 l07Var2 = new l07(m07Var, xx1.a.b(0, iH, 0, xx1.g(jB)), Integer.MAX_VALUE, 1);
                riaVar2 = new ria(qiaVar, l07Var2, zx1.d(jB, (((long) ((int) Math.ceil(l07Var2.d))) << 32) | (((long) ((int) Math.ceil(l07Var2.e))) & 4294967295L)));
                if (oiaVar != null) {
                    nf6<b11, ria> nf6Var2 = oiaVar.a;
                    if (nf6Var2 != null) {
                        nf6Var2.d(new b11(qiaVar), riaVar2);
                    } else {
                        oiaVar.b = new b11(qiaVar);
                        oiaVar.c = riaVar2;
                    }
                }
            }
            objF2 = new kg5(riaVar2.c);
            jt1Var.C(objF2);
        } else {
            hf8Var = hf8Var2;
            i2 = 0;
        }
        long j = ((kg5) objF2).a;
        jt1Var.B();
        hf8 hf8Var3 = hf8Var;
        int i3 = 1;
        ss7 ss7Var = new ss7(((tx2) jt1Var.F(hf8Var3)).w0((int) (j & 4294967295L)), new qha(1, ((tx2) jt1Var.F(hf8Var3)).w0((int) (j >> 32))), 499);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iw.b bVar = new iw.b();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (String str : list) {
            js7<Set<InlineSource>, String> js7VarExtractInlineSources = oh4Var != null ? extractInlineSources(str) : new js7<>(of3.t, str);
            Set<InlineSource> set = js7VarExtractInlineSources.t;
            String str2 = js7VarExtractInlineSources.u;
            linkedHashSet.addAll(set);
            Spanned spannedFromHtml = Html.fromHtml(str2, i2);
            spannedFromHtml.getClass();
            Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
            uh1 uh1VarM423getLinkTextColorQN2ZGVo = blockRenderTextStyle.m423getLinkTextColorQN2ZGVo();
            arrayList.add(new js7(BlockExtensionsKt.toAnnotatedString(spannedFromHtml, context, new ww9(uh1VarM423getLinkTextColorQN2ZGVo != null ? uh1VarM423getLinkTextColorQN2ZGVo.a : uh1.k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61438)), set));
        }
        int size = arrayList.size();
        int i4 = i2;
        int i5 = i4;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            int i6 = i4 + 1;
            if (i4 < 0) {
                ws0.m();
                throw null;
            }
            js7 js7Var = (js7) obj2;
            iw iwVar2 = (iw) js7Var.t;
            Set set2 = (Set) js7Var.u;
            int iG = bVar.g(ss7Var);
            try {
                bVar.c(textListToRender$bullet(z3, i6));
                int length = String.valueOf(list.size()).length();
                if (length > i3) {
                    Iterator<Integer> it = uh8.j(0, length - String.valueOf(i6).length()).iterator();
                    while (((eg5) it).v) {
                        ((tf5) it).nextInt();
                        bVar.c("\t");
                    }
                }
                if (oh4Var == null || set2.isEmpty()) {
                    bVar.b(iwVar2);
                } else {
                    appendInlineSources(bVar, iwVar2, set2, oh4Var);
                }
                g2b g2bVar = g2b.a;
                bVar.e(iG);
                if (i4 < list.size() - 1) {
                    z2 = false;
                    int iG2 = bVar.g(new ss7(cka.b(0), null, 507));
                    c = '\n';
                    try {
                        bVar.append('\n');
                        bVar.e(iG2);
                    } catch (Throwable th) {
                        bVar.e(iG2);
                        throw th;
                    }
                } else {
                    c = '\n';
                    z2 = false;
                }
                i4 = i6;
                i3 = i3;
                z3 = z;
            } catch (Throwable th2) {
                bVar.e(iG);
                throw th2;
            }
        }
        js7<iw, Set<InlineSource>> js7Var2 = new js7<>(bVar.i(), linkedHashSet);
        jt1Var.B();
        return js7Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textListToRender$bullet(boolean z, int i) {
        if (!z) {
            return "•\t\t";
        }
        return i + ".\t\t";
    }

    private static final js7<iw, Set<InlineSource>> textToRender(Block block, BlockRenderTextStyle blockRenderTextStyle, boolean z, oh4<? super List<InlineSource>, g2b> oh4Var, jt1 jt1Var, int i) {
        js7<iw, Set<InlineSource>> js7VarTextListToRender;
        js7<Set<InlineSource>, String> js7Var;
        jt1Var.K(1340770584);
        BlockType type = block.getType();
        int i2 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            jt1Var.K(-1598782858);
            List<String> items2 = block.getItems();
            items2.getClass();
            js7VarTextListToRender = textListToRender(items2, false, blockRenderTextStyle, oh4Var, jt1Var, ((i << 3) & 896) | 48 | (i & 7168));
            jt1Var.B();
        } else if (i2 != 2) {
            jt1Var.K(1977766849);
            if (z) {
                String text = block.getText();
                text.getClass();
                js7Var = extractInlineSources(text);
            } else {
                js7Var = new js7<>(of3.t, block.getText());
            }
            Set<InlineSource> set = js7Var.t;
            String str = js7Var.u;
            iw.b bVar = new iw.b();
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            spannedFromHtml.getClass();
            Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
            uh1 uh1VarM423getLinkTextColorQN2ZGVo = blockRenderTextStyle.m423getLinkTextColorQN2ZGVo();
            iw annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml, context, new ww9(uh1VarM423getLinkTextColorQN2ZGVo != null ? uh1VarM423getLinkTextColorQN2ZGVo.a : uh1.k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61438));
            if (!z || set.isEmpty()) {
                bVar.b(annotatedString);
            } else {
                appendInlineSources(bVar, annotatedString, set, oh4Var);
            }
            js7VarTextListToRender = new js7<>(bVar.i(), set);
            jt1Var.B();
        } else {
            jt1Var.K(-1598776011);
            List<String> items3 = block.getItems();
            items3.getClass();
            js7VarTextListToRender = textListToRender(items3, true, blockRenderTextStyle, oh4Var, jt1Var, ((i << 3) & 896) | 48 | (i & 7168));
            jt1Var.B();
        }
        jt1Var.B();
        return js7VarTextListToRender;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass3 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Block $block;
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ BlockRenderTextStyle $blockRenderTextStyle;
        final /* synthetic */ iw $finalTextToRender;
        final /* synthetic */ Set<InlineSource> $inlineSources;
        final /* synthetic */ h37<ria> $layoutResult;
        final /* synthetic */ ox6 $modifier;
        final /* synthetic */ oh4<ria, g2b> $onLayoutResult;
        final /* synthetic */ SuffixText $suffixText;
        final /* synthetic */ iw $textToRender;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BlockRenderTextStyle blockRenderTextStyle, BlockRenderData blockRenderData, Block block, ox6 ox6Var, iw iwVar, SuffixText suffixText, Set<InlineSource> set, iw iwVar2, oh4<? super ria, g2b> oh4Var, h37<ria> h37Var) {
            this.$blockRenderTextStyle = blockRenderTextStyle;
            this.$blockRenderData = blockRenderData;
            this.$block = block;
            this.$modifier = ox6Var;
            this.$textToRender = iwVar;
            this.$suffixText = suffixText;
            this.$inlineSources = set;
            this.$finalTextToRender = iwVar2;
            this.$onLayoutResult = oh4Var;
            this.$layoutResult = h37Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(iw iwVar, SuffixText suffixText, hc9 hc9Var) {
            hc9Var.getClass();
            ec9.b(((Object) iwVar) + suffixText.getTtsText(), hc9Var);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3(h37 h37Var, oh4 oh4Var, ria riaVar) {
            riaVar.getClass();
            h37Var.setValue(riaVar);
            oh4Var.invoke(riaVar);
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            int textAlign;
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            long jM421getFontSizeXSAIIZE = this.$blockRenderTextStyle.m421getFontSizeXSAIIZE();
            uh1 uh1VarM425getTextColorQN2ZGVo = this.$blockRenderTextStyle.m425getTextColorQN2ZGVo();
            if (uh1VarM425getTextColorQN2ZGVo == null) {
                uh1VarM425getTextColorQN2ZGVo = this.$blockRenderData.m413getTextColorQN2ZGVo();
            }
            jt1Var.K(231563534);
            long jA = uh1VarM425getTextColorQN2ZGVo == null ? ah5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable) : uh1VarM425getTextColorQN2ZGVo.a;
            jt1Var.B();
            vaa vaaVarM424getTextAlignbuA522U = this.$blockRenderTextStyle.m424getTextAlignbuA522U();
            if (vaaVarM424getTextAlignbuA522U != null) {
                textAlign = vaaVarM424getTextAlignbuA522U.a;
            } else {
                BlockAlignment align = this.$block.getAlign();
                align.getClass();
                textAlign = BlockExtensionsKt.getTextAlign(align);
            }
            long jM422getLineHeightXSAIIZE = this.$blockRenderTextStyle.m422getLineHeightXSAIIZE();
            ob4 fontWeight = this.$blockRenderTextStyle.getFontWeight();
            ox6 ox6Var = this.$modifier;
            jt1Var.K(231575491);
            boolean zJ = jt1Var.J(this.$textToRender) | jt1Var.J(this.$suffixText);
            final iw iwVar = this.$textToRender;
            final SuffixText suffixText = this.$suffixText;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.survey.block.e
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$1$lambda$0(iwVar, suffixText, (hc9) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            jt1Var.K(231583327);
            Set<InlineSource> set = this.$inlineSources;
            ArrayList arrayList = new ArrayList(ph1.n(set, 10));
            for (Iterator it = set.iterator(); it.hasNext(); it = it) {
                final InlineSource inlineSource = (InlineSource) it.next();
                arrayList.add(new js7(inlineSource.getDataEntityId(), new dd5(new mz7(cka.c(1.5f, 8589934592L), cka.c(1.1f, 8589934592L)), gr1.b(1754247483, new ei4<String, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$2$1
                    public final void invoke(String str, jt1 jt1Var2, int i2) {
                        str.getClass();
                        if ((i2 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            TextBlockKt.m448InlineSourceBadgeFNF3uiM(inlineSource.getDataSourceIndex(), null, 0L, jt1Var2, 0, 6);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(String str, jt1 jt1Var2, Integer num) {
                        invoke(str, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var))));
                fontWeight = fontWeight;
                jA = jA;
                jM421getFontSizeXSAIIZE = jM421getFontSizeXSAIIZE;
                ox6VarB = ox6VarB;
            }
            long j = jA;
            long j2 = jM421getFontSizeXSAIIZE;
            ob4 ob4Var = fontWeight;
            ox6 ox6Var2 = ox6VarB;
            jt1Var.B();
            Map mapK = qi6.k(arrayList);
            iw iwVar2 = this.$finalTextToRender;
            vaa vaaVar = new vaa(textAlign);
            jt1Var.K(231578648);
            boolean zJ2 = jt1Var.J(this.$onLayoutResult);
            final h37<ria> h37Var = this.$layoutResult;
            final oh4<ria, g2b> oh4Var = this.$onLayoutResult;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: io.intercom.android.sdk.survey.block.f
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$4$lambda$3(h37Var, oh4Var, (ria) obj);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            mia.c(iwVar2, ox6Var2, j, j2, ob4Var, 0L, vaaVar, jM422getLineHeightXSAIIZE, 0, false, 0, 0, mapK, (oh4) objF2, null, jt1Var, 0, 0, 324520);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
