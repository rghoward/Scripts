package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.q60;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.survey.block.AttachmentBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AttachmentBlockKt {
    public static final void AttachmentBlock(ox6 ox6Var, BlockRenderData blockRenderData, final boolean z, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        BlockRenderData blockRenderData2;
        bj4 bj4Var;
        final ox6 ox6Var3;
        bj4 bj4Var2;
        long j;
        blockRenderData.getClass();
        bj4 bj4VarO = jt1Var.o(-1719159681);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            bj4Var = bj4VarO;
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var4 = i4 != 0 ? aVar : ox6Var2;
            aj1 aj1VarA = yi1.a(new c30.h(8.0f, true, new a30()), di.a.m, bj4VarO, 6);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var4);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
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
            uh1 uh1VarM425getTextColorQN2ZGVo = blockRenderData2.getTextStyle().m425getTextColorQN2ZGVo();
            if (uh1VarM425getTextColorQN2ZGVo == null) {
                uh1VarM425getTextColorQN2ZGVo = blockRenderData2.m413getTextColorQN2ZGVo();
            }
            bj4VarO.K(-1626976078);
            long jA = uh1VarM425getTextColorQN2ZGVo == null ? gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable) : uh1VarM425getTextColorQN2ZGVo.a;
            bj4VarO.U(false);
            bj4VarO.K(-1626969984);
            List<BlockAttachment> attachments = blockRenderData2.getBlock().getAttachments();
            attachments.getClass();
            for (BlockAttachment blockAttachment : attachments) {
                if (ContentTypeExtensionKt.isVideo(blockAttachment.getContentType())) {
                    bj4VarO.K(1321276699);
                    VideoAttachmentBlock(uma.a(aVar, IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b), blockAttachment, bj4VarO, 0, 0);
                    bj4VarO.U(false);
                    bj4Var2 = bj4VarO;
                    j = jA;
                } else if (ContentTypeExtensionKt.isPdf(blockAttachment.getContentType())) {
                    bj4VarO.K(1321436969);
                    bj4Var2 = bj4VarO;
                    j = jA;
                    PdfAttachmentBlockKt.m441PdfAttachmentBlockww6aTOc(blockAttachment, z, null, j, bj4Var2, (i5 >> 3) & 112, 4);
                    bj4Var2.U(false);
                } else {
                    bj4 bj4Var3 = bj4VarO;
                    long j2 = jA;
                    bj4Var3.K(1321555451);
                    m409TextAttachmentBlockFNF3uiM(null, blockAttachment, j2, bj4Var3, 0, 1);
                    bj4Var2 = bj4Var3;
                    j = j2;
                    bj4Var2.U(false);
                }
                jA = j;
                bj4VarO = bj4Var2;
            }
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.U(true);
            ox6Var3 = ox6Var4;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final BlockRenderData blockRenderData3 = blockRenderData2;
            xj8VarW.d = new ci4() { // from class: p60
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttachmentBlockKt.AttachmentBlock$lambda$2(ox6Var3, blockRenderData3, z, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AttachmentBlock$lambda$2(ox6 ox6Var, BlockRenderData blockRenderData, boolean z, int i, int i2, jt1 jt1Var, int i3) {
        AttachmentBlock(ox6Var, blockRenderData, z, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AttachmentBlockPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-550090117);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttachmentBlockKt.INSTANCE.m429getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new q60(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AttachmentBlockPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        AttachmentBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: TextAttachmentBlock-FNF3uiM, reason: not valid java name */
    public static final void m409TextAttachmentBlockFNF3uiM(ox6 ox6Var, final BlockAttachment blockAttachment, long j, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        long jA;
        ox6 ox6Var3;
        final long j2;
        blockAttachment.getClass();
        bj4 bj4VarO = jt1Var.o(-1146554998);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(blockAttachment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jA = j;
            i3 |= ((i2 & 4) == 0 && bj4VarO.i(jA)) ? 256 : 128;
        } else {
            jA = j;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            j2 = jA;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                ox6Var3 = i4 != 0 ? ox6.a.t : ox6Var2;
                if ((i2 & 4) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -897;
                }
            } else {
                bj4VarO.u();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                ox6Var3 = ox6Var2;
            }
            long j3 = jA;
            bj4VarO.V();
            final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4VarO.K(1473534466);
            boolean zJ = ((i3 & 112) == 32) | bj4VarO.j(context);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: n60
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$4$lambda$3(blockAttachment, context);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC = we1.c(ox6Var3, false, null, (mh4) objF, 15);
            ny8 ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            m65.b(is7.a(R.drawable.intercom_ic_attachment, bj4VarO, 0), "Attachment Icon", null, j3, bj4VarO, 56 | ((i3 << 3) & 7168), 4);
            mia.b(blockAttachment.getName(), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, null, 0L, 0L, null, null, 16773119), bj4VarO, i3 & 896, 0, 131066);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
            j2 = j3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: o60
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttachmentBlockKt.TextAttachmentBlock_FNF3uiM$lambda$6(ox6Var2, blockAttachment, j2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttachmentBlock_FNF3uiM$lambda$4$lambda$3(BlockAttachment blockAttachment, Context context) {
        LinkOpener.handleUrl(blockAttachment.getUrl(), context, Injector.get().getApi());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttachmentBlock_FNF3uiM$lambda$6(ox6 ox6Var, BlockAttachment blockAttachment, long j, int i, int i2, jt1 jt1Var, int i3) {
        m409TextAttachmentBlockFNF3uiM(ox6Var, blockAttachment, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void VideoAttachmentBlock(final ox6 ox6Var, final BlockAttachment blockAttachment, jt1 jt1Var, final int i, final int i2) {
        int i3;
        blockAttachment.getClass();
        bj4 bj4VarO = jt1Var.o(-745319067);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(blockAttachment) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            VideoFileBlockKt.VideoFileBlock(ox6Var2, blockAttachment.getUrl(), null, bj4VarO, (i3 & 14) | 384, 0);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: m60
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttachmentBlockKt.VideoAttachmentBlock$lambda$7(ox6Var, blockAttachment, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VideoAttachmentBlock$lambda$7(ox6 ox6Var, BlockAttachment blockAttachment, int i, int i2, jt1 jt1Var, int i3) {
        VideoAttachmentBlock(ox6Var, blockAttachment, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
