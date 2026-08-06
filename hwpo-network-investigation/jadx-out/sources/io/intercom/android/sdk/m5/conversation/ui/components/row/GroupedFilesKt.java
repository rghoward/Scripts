package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.net.Uri;
import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dp4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jy3;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.rh1;
import defpackage.vp0;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.zp0;
import defpackage.zx8;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.GroupedFilesKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GroupedFilesKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0211  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0205  */
    public static final void GroupedFiles(List<? extends Block> list, final zx8 zx8Var, ox6 ox6Var, ci4<? super String, ? super String, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        final List<? extends Block> list2;
        int i3;
        zx8 zx8Var2;
        final ox6 ox6Var2;
        int i4;
        int i5;
        ci4<? super String, ? super String, g2b> ci4Var2;
        int i6;
        ox6 ox6Var3;
        jt1.a.C0187a c0187a;
        final ci4<? super String, ? super String, g2b> ci4Var3;
        ArrayList arrayList;
        Iterator<T> it;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        int size;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        final MediaData.Media.Other other;
        boolean z;
        boolean zJ;
        Object objF;
        ArrayList arrayList2;
        Uri uri;
        Object objF2;
        xj8 xj8VarW;
        list.getClass();
        zx8Var.getClass();
        bj4 bj4VarO = jt1Var.o(-327530751);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            list2 = list;
        } else {
            list2 = list;
            i3 = (i & 6) == 0 ? (bj4VarO.j(list2) ? 4 : 2) | i : i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            zx8Var2 = zx8Var;
        } else {
            zx8Var2 = zx8Var;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(zx8Var2) ? 32 : 16;
            }
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-1874886513);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dp4();
                            bj4VarO.C(objF2);
                        }
                        ci4Var3 = (ci4) objF2;
                        bj4VarO.U(false);
                    } else {
                        ci4Var3 = ci4Var2;
                    }
                    arrayList = new ArrayList();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        List<BlockAttachment> attachments = ((Block) it.next()).getAttachments();
                        attachments.getClass();
                        arrayList2 = new ArrayList(ph1.n(attachments, 10));
                        for (BlockAttachment blockAttachment : attachments) {
                            String contentType = blockAttachment.getContentType();
                            long size2 = blockAttachment.getSize();
                            String name = blockAttachment.getName();
                            if (blockAttachment.getUrl().length() > 0) {
                                uri = Uri.parse(blockAttachment.getUrl());
                            } else {
                                uri = Uri.EMPTY;
                            }
                            Uri uri2 = uri;
                            uri2.getClass();
                            arrayList2.add(new MediaData.Media.Other(contentType, size2, name, uri2));
                        }
                        rh1.o(arrayList2, arrayList);
                    }
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var3);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(141880142);
                    size = arrayList.size();
                    i7 = 0;
                    i8 = 0;
                    while (i7 < size) {
                        obj = arrayList.get(i7);
                        i9 = i7 + 1;
                        i10 = i8 + 1;
                        if (i8 < 0) {
                            ws0.m();
                            throw null;
                        }
                        other = (MediaData.Media.Other) obj;
                        zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                        bj4VarO.K(250944805);
                        if ((i3 & 7168) == i5) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zJ = bj4VarO.j(other) | z;
                        objF = bj4VarO.f();
                        if (zJ || objF == c0187a) {
                            objF = new mh4() { // from class: ep4
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default, null, (mh4) objF, null, bj4VarO, 0, 20);
                        zx8Var2 = zx8Var;
                        arrayList = arrayList;
                        size = size;
                        i7 = i9;
                        i8 = i10;
                        i5 = i5;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    ox6Var2 = ox6Var3;
                } else {
                    bj4VarO.u();
                    ci4Var3 = ci4Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fp4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return GroupedFilesKt.GroupedFiles$lambda$8(list2, zx8Var, ox6Var2, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ci4Var2 = ci4Var;
            if ((i3 & 1171) == 1170) {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-1874886513);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dp4();
                        bj4VarO.C(objF2);
                    }
                    ci4Var3 = (ci4) objF2;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    List<BlockAttachment> attachments2 = ((Block) it.next()).getAttachments();
                    attachments2.getClass();
                    arrayList2 = new ArrayList(ph1.n(attachments2, 10));
                    while (r10.hasNext()) {
                        String contentType2 = blockAttachment.getContentType();
                        long size3 = blockAttachment.getSize();
                        String name2 = blockAttachment.getName();
                        if (blockAttachment.getUrl().length() > 0) {
                            uri = Uri.parse(blockAttachment.getUrl());
                        } else {
                            uri = Uri.EMPTY;
                        }
                        Uri uri3 = uri;
                        uri3.getClass();
                        arrayList2.add(new MediaData.Media.Other(contentType2, size3, name2, uri3));
                    }
                    rh1.o(arrayList2, arrayList);
                }
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(141880142);
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i7 < size) {
                    obj = arrayList.get(i7);
                    i9 = i7 + 1;
                    i10 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    other = (MediaData.Media.Other) obj;
                    zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default2 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                    bj4VarO.K(250944805);
                    if ((i3 & 7168) == i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = bj4VarO.j(other) | z;
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default2, null, (mh4) objF, null, bj4VarO, 0, 20);
                    zx8Var2 = zx8Var;
                    arrayList = arrayList;
                    size = size;
                    i7 = i9;
                    i8 = i10;
                    i5 = i5;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var2 = ox6Var3;
            } else {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-1874886513);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dp4();
                        bj4VarO.C(objF2);
                    }
                    ci4Var3 = (ci4) objF2;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    List<BlockAttachment> attachments3 = ((Block) it.next()).getAttachments();
                    attachments3.getClass();
                    arrayList2 = new ArrayList(ph1.n(attachments3, 10));
                    while (r10.hasNext()) {
                        String contentType3 = blockAttachment.getContentType();
                        long size4 = blockAttachment.getSize();
                        String name3 = blockAttachment.getName();
                        if (blockAttachment.getUrl().length() > 0) {
                            uri = Uri.parse(blockAttachment.getUrl());
                        } else {
                            uri = Uri.EMPTY;
                        }
                        Uri uri4 = uri;
                        uri4.getClass();
                        arrayList2.add(new MediaData.Media.Other(contentType3, size4, name3, uri4));
                    }
                    rh1.o(arrayList2, arrayList);
                }
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(141880142);
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i7 < size) {
                    obj = arrayList.get(i7);
                    i9 = i7 + 1;
                    i10 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    other = (MediaData.Media.Other) obj;
                    zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default3 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                    bj4VarO.K(250944805);
                    if ((i3 & 7168) == i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = bj4VarO.j(other) | z;
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default3, null, (mh4) objF, null, bj4VarO, 0, 20);
                    zx8Var2 = zx8Var;
                    arrayList = arrayList;
                    size = size;
                    i7 = i9;
                    i8 = i10;
                    i5 = i5;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fp4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return GroupedFilesKt.GroupedFiles$lambda$8(list2, zx8Var, ox6Var2, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i4 = i2 & 8;
        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-1874886513);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dp4();
                        bj4VarO.C(objF2);
                    }
                    ci4Var3 = (ci4) objF2;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    List<BlockAttachment> attachments4 = ((Block) it.next()).getAttachments();
                    attachments4.getClass();
                    arrayList2 = new ArrayList(ph1.n(attachments4, 10));
                    while (r10.hasNext()) {
                        String contentType4 = blockAttachment.getContentType();
                        long size5 = blockAttachment.getSize();
                        String name4 = blockAttachment.getName();
                        if (blockAttachment.getUrl().length() > 0) {
                            uri = Uri.parse(blockAttachment.getUrl());
                        } else {
                            uri = Uri.EMPTY;
                        }
                        Uri uri5 = uri;
                        uri5.getClass();
                        arrayList2.add(new MediaData.Media.Other(contentType4, size5, name4, uri5));
                    }
                    rh1.o(arrayList2, arrayList);
                }
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(141880142);
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i7 < size) {
                    obj = arrayList.get(i7);
                    i9 = i7 + 1;
                    i10 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    other = (MediaData.Media.Other) obj;
                    zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default4 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                    bj4VarO.K(250944805);
                    if ((i3 & 7168) == i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = bj4VarO.j(other) | z;
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default4, null, (mh4) objF, null, bj4VarO, 0, 20);
                    zx8Var2 = zx8Var;
                    arrayList = arrayList;
                    size = size;
                    i7 = i9;
                    i8 = i10;
                    i5 = i5;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var2 = ox6Var3;
            } else {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-1874886513);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dp4();
                        bj4VarO.C(objF2);
                    }
                    ci4Var3 = (ci4) objF2;
                    bj4VarO.U(false);
                } else {
                    ci4Var3 = ci4Var2;
                }
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    List<BlockAttachment> attachments5 = ((Block) it.next()).getAttachments();
                    attachments5.getClass();
                    arrayList2 = new ArrayList(ph1.n(attachments5, 10));
                    while (r10.hasNext()) {
                        String contentType5 = blockAttachment.getContentType();
                        long size6 = blockAttachment.getSize();
                        String name5 = blockAttachment.getName();
                        if (blockAttachment.getUrl().length() > 0) {
                            uri = Uri.parse(blockAttachment.getUrl());
                        } else {
                            uri = Uri.EMPTY;
                        }
                        Uri uri6 = uri;
                        uri6.getClass();
                        arrayList2.add(new MediaData.Media.Other(contentType5, size6, name5, uri6));
                    }
                    rh1.o(arrayList2, arrayList);
                }
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(141880142);
                size = arrayList.size();
                i7 = 0;
                i8 = 0;
                while (i7 < size) {
                    obj = arrayList.get(i7);
                    i9 = i7 + 1;
                    i10 = i8 + 1;
                    if (i8 < 0) {
                        ws0.m();
                        throw null;
                    }
                    other = (MediaData.Media.Other) obj;
                    zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default5 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                    bj4VarO.K(250944805);
                    if ((i3 & 7168) == i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zJ = bj4VarO.j(other) | z;
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: ep4
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default5, null, (mh4) objF, null, bj4VarO, 0, 20);
                    zx8Var2 = zx8Var;
                    arrayList = arrayList;
                    size = size;
                    i7 = i9;
                    i8 = i10;
                    i5 = i5;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fp4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return GroupedFilesKt.GroupedFiles$lambda$8(list2, zx8Var, ox6Var2, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ci4Var2 = ci4Var;
        if ((i3 & 1171) == 1170) {
            if (i11 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-1874886513);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new dp4();
                    bj4VarO.C(objF2);
                }
                ci4Var3 = (ci4) objF2;
                bj4VarO.U(false);
            } else {
                ci4Var3 = ci4Var2;
            }
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                List<BlockAttachment> attachments6 = ((Block) it.next()).getAttachments();
                attachments6.getClass();
                arrayList2 = new ArrayList(ph1.n(attachments6, 10));
                while (r10.hasNext()) {
                    String contentType6 = blockAttachment.getContentType();
                    long size7 = blockAttachment.getSize();
                    String name6 = blockAttachment.getName();
                    if (blockAttachment.getUrl().length() > 0) {
                        uri = Uri.parse(blockAttachment.getUrl());
                    } else {
                        uri = Uri.EMPTY;
                    }
                    Uri uri7 = uri;
                    uri7.getClass();
                    arrayList2.add(new MediaData.Media.Other(contentType6, size7, name6, uri7));
                }
                rh1.o(arrayList2, arrayList);
            }
            aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(141880142);
            size = arrayList.size();
            i7 = 0;
            i8 = 0;
            while (i7 < size) {
                obj = arrayList.get(i7);
                i9 = i7 + 1;
                i10 = i8 + 1;
                if (i8 < 0) {
                    ws0.m();
                    throw null;
                }
                other = (MediaData.Media.Other) obj;
                zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default6 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                bj4VarO.K(250944805);
                if ((i3 & 7168) == i5) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = bj4VarO.j(other) | z;
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: ep4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: ep4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default6, null, (mh4) objF, null, bj4VarO, 0, 20);
                zx8Var2 = zx8Var;
                arrayList = arrayList;
                size = size;
                i7 = i9;
                i8 = i10;
                i5 = i5;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        } else {
            if (i11 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-1874886513);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new dp4();
                    bj4VarO.C(objF2);
                }
                ci4Var3 = (ci4) objF2;
                bj4VarO.U(false);
            } else {
                ci4Var3 = ci4Var2;
            }
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                List<BlockAttachment> attachments7 = ((Block) it.next()).getAttachments();
                attachments7.getClass();
                arrayList2 = new ArrayList(ph1.n(attachments7, 10));
                while (r10.hasNext()) {
                    String contentType7 = blockAttachment.getContentType();
                    long size8 = blockAttachment.getSize();
                    String name7 = blockAttachment.getName();
                    if (blockAttachment.getUrl().length() > 0) {
                        uri = Uri.parse(blockAttachment.getUrl());
                    } else {
                        uri = Uri.EMPTY;
                    }
                    Uri uri8 = uri;
                    uri8.getClass();
                    arrayList2.add(new MediaData.Media.Other(contentType7, size8, name7, uri8));
                }
                rh1.o(arrayList2, arrayList);
            }
            aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.o, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(141880142);
            size = arrayList.size();
            i7 = 0;
            i8 = 0;
            while (i7 < size) {
                obj = arrayList.get(i7);
                i9 = i7 + 1;
                i10 = i8 + 1;
                if (i8 < 0) {
                    ws0.m();
                    throw null;
                }
                other = (MediaData.Media.Other) obj;
                zx8 zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default7 = BubbleMessageRowKt.m210getGroupedItemCornerShapeeqLRuRQ$default(zx8Var2, i8, arrayList.size(), 0.0f, 8, null);
                bj4VarO.K(250944805);
                if ((i3 & 7168) == i5) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = bj4VarO.j(other) | z;
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: ep4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: ep4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GroupedFilesKt.GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4Var3, other);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                FileRowKt.FileRow(other, zx8VarM210getGroupedItemCornerShapeeqLRuRQ$default7, null, (mh4) objF, null, bj4VarO, 0, 20);
                zx8Var2 = zx8Var;
                arrayList = arrayList;
                size = size;
                i7 = i9;
                i8 = i10;
                i5 = i5;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fp4
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return GroupedFilesKt.GroupedFiles$lambda$8(list2, zx8Var, ox6Var2, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFiles$lambda$1$lambda$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFiles$lambda$7$lambda$6$lambda$5$lambda$4(ci4 ci4Var, MediaData.Media.Other other) {
        String string = other.getUri().toString();
        string.getClass();
        ci4Var.invoke(string, other.getMimeType());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFiles$lambda$8(List list, zx8 zx8Var, ox6 ox6Var, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        GroupedFiles(list, zx8Var, ox6Var, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedFilesWith1FilePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-751027684);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedFilesKt.INSTANCE.m234getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jy3(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFilesWith1FilePreview$lambda$9(int i, jt1 jt1Var, int i2) {
        GroupedFilesWith1FilePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedFilesWith2FilesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-969404946);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedFilesKt.INSTANCE.m236getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new vp0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFilesWith2FilesPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        GroupedFilesWith2FilesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedFilesWith3FilesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1902759283);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedFilesKt.INSTANCE.m238getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zp0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedFilesWith3FilesPreview$lambda$11(int i, jt1 jt1Var, int i2) {
        GroupedFilesWith3FilesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
