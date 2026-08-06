package defpackage;

import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu6<T> implements v49<T> {
    public static final int[] l = new int[0];
    public static final Unsafe m = h3b.j();
    public final int[] a;
    public final Object[] b;
    public final zt6 c;
    public final boolean d;
    public final int[] e;
    public final int f;
    public final pa7 g;
    public final h96 h;
    public final p2b<?, ?> i;
    public final wr3<?> j;
    public final wh6 k;

    public hu6(int[] iArr, Object[] objArr, int i, int i2, zt6 zt6Var, int[] iArr2, int i3, int i4, pa7 pa7Var, h96 h96Var, p2b p2bVar, wr3 wr3Var, wh6 wh6Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = wr3Var != null && wr3Var.d(zt6Var);
        this.e = iArr2;
        this.f = i3;
        this.g = pa7Var;
        this.h = h96Var;
        this.i = p2bVar;
        this.j = wr3Var;
        this.c = zt6Var;
        this.k = wh6Var;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof fk4) {
            return ((fk4) obj).s();
        }
        return true;
    }

    public static hu6 r(vt6 vt6Var, pa7 pa7Var, h96 h96Var, p2b p2bVar, wr3 wr3Var, wh6 wh6Var) {
        if (vt6Var instanceof xh8) {
            return s((xh8) vt6Var, pa7Var, h96Var, p2bVar, wr3Var, wh6Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0265  */
    /* JADX WARN: Code duplicated, block: B:125:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0280  */
    /* JADX WARN: Code duplicated, block: B:163:0x0325  */
    /* JADX WARN: Code duplicated, block: B:179:0x0373  */
    /* JADX WARN: Code duplicated, block: B:182:0x0380  */
    public static <T> hu6<T> s(xh8 xh8Var, pa7 pa7Var, h96 h96Var, p2b<?, ?> p2bVar, wr3<?> wr3Var, wh6 wh6Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int iObjectFieldOffset3;
        int i21;
        Field fieldV;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldV2;
        int i25;
        Object obj2;
        Field fieldV3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        String str = xh8Var.b;
        int length = str.length();
        int i30 = 55296;
        if (str.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (str.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i29 = i32 + 1;
                cCharAt13 = str.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i29;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i29;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = l;
            i4 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = str.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = str.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = str.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = str.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = str.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = str.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = str.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = str.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = str.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = str.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i59 = (iCharAt3 * 2) + iCharAt4;
            int i60 = iCharAt7;
            i2 = iCharAt5;
            i3 = i60;
            i4 = iCharAt3;
            i32 = i56;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i59;
            i7 = iCharAt9;
        }
        Unsafe unsafe = m;
        Object[] objArr = xh8Var.c;
        Class<?> cls = xh8Var.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i61 = i7 + i3;
        int i62 = i61;
        int i63 = i7;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = str.charAt(i32);
            if (iCharAt10 >= i30) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i28 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i28;
                    length = i16;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i17 = i28;
            } else {
                i16 = length;
                i17 = i66;
            }
            int i70 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i70 = i27;
                    c = 55296;
                }
                iCharAt11 = i71 | (cCharAt11 << i72);
                i70 = i27;
            }
            int i73 = iCharAt11 & 255;
            int i74 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            ue8 ue8Var = ue8.t;
            int i75 = i4;
            int[] iArr4 = iArr3;
            if (i73 >= 51) {
                int i76 = i70 + 1;
                int iCharAt12 = str.charAt(i70);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        cCharAt10 = str.charAt(i76);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i76 = i26;
                        c2 = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i78);
                    i76 = i26;
                }
                int i79 = i73 - 51;
                int i80 = iCharAt12;
                if (i79 == 9 || i79 == 17) {
                    i23 = i6 + 1;
                    objArr2[((i65 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12 && (xh8Var.c().equals(ue8Var) || (iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0)) {
                        i23 = i6 + 1;
                        objArr2[((i65 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i24 = i80 * 2;
                    obj = objArr3[i24];
                    if (obj instanceof Field) {
                        fieldV2 = (Field) obj;
                    } else {
                        fieldV2 = v(cls, (String) obj);
                        objArr3[i24] = fieldV2;
                    }
                    int i81 = i76;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldV2);
                    i25 = i24 + 1;
                    obj2 = objArr3[i25];
                    if (obj2 instanceof Field) {
                        fieldV3 = (Field) obj2;
                    } else {
                        fieldV3 = v(cls, (String) obj2);
                        objArr3[i25] = fieldV3;
                    }
                    i18 = i6;
                    i20 = 0;
                    cls = cls;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV3);
                    i21 = iObjectFieldOffset4;
                    i19 = i81;
                }
                i6 = i23;
                i24 = i80 * 2;
                obj = objArr3[i24];
                if (obj instanceof Field) {
                    fieldV2 = (Field) obj;
                } else {
                    fieldV2 = v(cls, (String) obj);
                    objArr3[i24] = fieldV2;
                }
                int i82 = i76;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldV2);
                i25 = i24 + 1;
                obj2 = objArr3[i25];
                if (obj2 instanceof Field) {
                    fieldV3 = (Field) obj2;
                } else {
                    fieldV3 = v(cls, (String) obj2);
                    objArr3[i25] = fieldV3;
                }
                i18 = i6;
                i20 = 0;
                cls = cls;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldV3);
                i21 = iObjectFieldOffset5;
                i19 = i82;
            } else {
                int i83 = i6 + 1;
                Field fieldV4 = v(cls, (String) objArr3[i6]);
                if (i73 == 9 || i73 == 17) {
                    objArr2[((i65 / 3) * 2) + 1] = fieldV4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i65 / 3) * 2) + 1] = objArr3[i83];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (xh8Var.c() == ue8Var || (iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i65 / 3) * 2) + 1] = objArr3[i83];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        if ((iCharAt11 & 4096) != 0 || i73 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i70;
                            i20 = 0;
                        } else {
                            int i84 = i70 + 1;
                            int iCharAt13 = str.charAt(i70);
                            if (iCharAt13 >= 55296) {
                                int i85 = iCharAt13 & 8191;
                                int i86 = 13;
                                while (true) {
                                    i19 = i84 + 1;
                                    cCharAt9 = str.charAt(i84);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i85 |= (cCharAt9 & 8191) << i86;
                                    i86 += 13;
                                    i84 = i19;
                                }
                                iCharAt13 = i85 | (cCharAt9 << i86);
                            } else {
                                i19 = i84;
                            }
                            int i87 = (iCharAt13 / 32) + (i75 * 2);
                            Object obj3 = objArr3[i87];
                            if (obj3 instanceof Field) {
                                fieldV = (Field) obj3;
                            } else {
                                fieldV = v(cls, (String) obj3);
                                objArr3[i87] = fieldV;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldV);
                            i20 = iCharAt13 % 32;
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        i21 = iObjectFieldOffset;
                    } else {
                        if (i73 == 50) {
                            int i88 = i63 + 1;
                            iArr[i63] = i65;
                            int i89 = (i65 / 3) * 2;
                            int i90 = i6 + 2;
                            objArr2[i89] = objArr3[i83];
                            if ((iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                                i18 = i6 + 3;
                                objArr2[i89 + 1] = objArr3[i90];
                            } else {
                                i18 = i90;
                            }
                            i63 = i88;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i70;
                            i20 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i19 = i70;
                            i20 = 0;
                        }
                        if (i73 >= 18) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        i21 = iObjectFieldOffset;
                    }
                    i18 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i19 = i70;
                        i20 = 0;
                    }
                    if (i73 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i21 = iObjectFieldOffset;
                }
                i18 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldV4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i19 = i70;
                    i20 = 0;
                }
                if (i73 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset2;
                i21 = iObjectFieldOffset;
            }
            int i91 = i65 + 1;
            iArr4[i65] = i74;
            int i92 = i65 + 2;
            String str2 = str;
            iArr4[i91] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | i21;
            i65 += 3;
            iArr4[i92] = (i20 << 20) | iObjectFieldOffset3;
            cls = cls;
            objArr = objArr3;
            i6 = i18;
            str = str2;
            length = i16;
            i4 = i75;
            i32 = i19;
            iArr3 = iArr4;
            i30 = 55296;
        }
        return new hu6<>(iArr3, objArr2, i2, i5, xh8Var.a, iArr, i7, i61, pa7Var, h96Var, p2bVar, wr3Var, wh6Var);
    }

    public static int t(long j, Object obj) {
        return ((Integer) h3b.c.i(j, obj)).intValue();
    }

    public static long u(long j, Object obj) {
        return ((Long) h3b.c.i(j, obj)).longValue();
    }

    public static Field v(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = aa.a("Field ", str, " for ");
            sbA.append(cls.getName());
            sbA.append(" not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int y(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(T t, crb crbVar) {
        Map.Entry entry;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        hu6<T> hu6Var = this;
        boolean z2 = hu6Var.d;
        wr3<?> wr3Var = hu6Var.j;
        if (z2) {
            tu3<T> tu3VarB = wr3Var.b(t);
            if (tu3VarB.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) tu3VarB.g().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = hu6Var.a;
        int length = iArr.length;
        Unsafe unsafe = m;
        int i5 = 1048575;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZ = hu6Var.z(i7);
            int i8 = iArr[i7];
            int iY = y(iZ);
            if (iY <= 17) {
                int i9 = iArr[i7 + 2];
                i = 1;
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(t, i10);
                    i5 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            if (entry != null) {
                wr3Var.a(entry);
                if (i8 >= 0) {
                    wr3Var.f(entry);
                    throw null;
                }
            }
            long j = iZ & 1048575;
            switch (iY) {
                case 0:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        double dE = h3b.c.e(j, t);
                        tg1 tg1Var = ((ug1) crbVar).a;
                        tg1Var.getClass();
                        tg1Var.u1(i8, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        float f = h3b.c.f(j, t);
                        tg1 tg1Var2 = ((ug1) crbVar).a;
                        tg1Var2.getClass();
                        tg1Var2.s1(i8, Float.floatToRawIntBits(f));
                    }
                    hu6Var = this;
                    break;
                case 2:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.H1(i8, unsafe.getLong(t, j));
                    }
                    hu6Var = this;
                    break;
                case 3:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.H1(i8, unsafe.getLong(t, j));
                    }
                    hu6Var = this;
                    break;
                case 4:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.w1(i8, unsafe.getInt(t, j));
                    }
                    hu6Var = this;
                    break;
                case 5:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.u1(i8, unsafe.getLong(t, j));
                    }
                    hu6Var = this;
                    break;
                case 6:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.s1(i8, unsafe.getInt(t, j));
                    }
                    hu6Var = this;
                    break;
                case 7:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.o1(i8, h3b.c.c(j, t));
                    }
                    hu6Var = this;
                    break;
                case 8:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof String) {
                            ((ug1) crbVar).a.C1(i8, (String) object);
                        } else {
                            ((ug1) crbVar).a.q1(i8, (f01) object);
                        }
                    }
                    hu6Var = this;
                    break;
                case 9:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.y1(i8, (zt6) unsafe.getObject(t, j), hu6Var.k(i7));
                    }
                    break;
                case 10:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.q1(i8, (f01) unsafe.getObject(t, j));
                    }
                    hu6Var = this;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.F1(i8, unsafe.getInt(t, j));
                    }
                    hu6Var = this;
                    break;
                case 12:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.w1(i8, unsafe.getInt(t, j));
                    }
                    hu6Var = this;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.s1(i8, unsafe.getInt(t, j));
                    }
                    hu6Var = this;
                    break;
                case 14:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a.u1(i8, unsafe.getLong(t, j));
                    }
                    hu6Var = this;
                    break;
                case h4c.e /* 15 */:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        int i11 = unsafe.getInt(t, j);
                        ((ug1) crbVar).a.F1(i8, (i11 >> 31) ^ (i11 << 1));
                    }
                    hu6Var = this;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        long j2 = unsafe.getLong(t, j);
                        ((ug1) crbVar).a.H1(i8, (j2 << 1) ^ (j2 >> 63));
                    }
                    hu6Var = this;
                    break;
                case 17:
                    if (hu6Var.m(t, i7, i5, i6, i2)) {
                        ((ug1) crbVar).a(i8, unsafe.getObject(t, j), hu6Var.k(i7));
                    }
                    break;
                case 18:
                    i5 = i5;
                    i6 = i6;
                    g59.m(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 19:
                    i5 = i5;
                    i6 = i6;
                    g59.q(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    i5 = i5;
                    i6 = i6;
                    g59.s(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 21:
                    i5 = i5;
                    i6 = i6;
                    g59.y(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 22:
                    i5 = i5;
                    i6 = i6;
                    g59.r(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 23:
                    i5 = i5;
                    i6 = i6;
                    g59.p(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 24:
                    i5 = i5;
                    i6 = i6;
                    g59.o(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 25:
                    i5 = i5;
                    i6 = i6;
                    g59.l(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 26:
                    i3 = i5;
                    i4 = i6;
                    int i12 = iArr[i7];
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls = g59.a;
                    if (list != null && !list.isEmpty()) {
                        tg1 tg1Var3 = ((ug1) crbVar).a;
                        if (list instanceof h26) {
                            h26 h26Var = (h26) list;
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                Object objR0 = h26Var.r0(i13);
                                if (objR0 instanceof String) {
                                    tg1Var3.C1(i12, (String) objR0);
                                } else {
                                    tg1Var3.q1(i12, (f01) objR0);
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                tg1Var3.C1(i12, (String) list.get(i14));
                            }
                        }
                    }
                    i5 = i3;
                    i6 = i4;
                    break;
                case 27:
                    i3 = i5;
                    i4 = i6;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(t, j);
                    v49 v49VarK = hu6Var.k(i7);
                    Class<?> cls2 = g59.a;
                    if (list2 != null && !list2.isEmpty()) {
                        ug1 ug1Var = (ug1) crbVar;
                        ug1Var.getClass();
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ug1Var.a.y1(i15, (zt6) list2.get(i16), v49VarK);
                        }
                    }
                    i5 = i3;
                    i6 = i4;
                    break;
                case 28:
                    i3 = i5;
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = g59.a;
                    if (list3 != null && !list3.isEmpty()) {
                        ug1 ug1Var2 = (ug1) crbVar;
                        ug1Var2.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ug1Var2.a.q1(i17, (f01) list3.get(i18));
                        }
                    }
                    i5 = i3;
                    i6 = i4;
                    break;
                case 29:
                    z = false;
                    g59.x(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 30:
                    z = false;
                    g59.n(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 31:
                    z = false;
                    g59.t(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 32:
                    z = false;
                    g59.u(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 33:
                    z = false;
                    g59.v(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 34:
                    z = false;
                    g59.w(iArr[i7], (List) unsafe.getObject(t, j), crbVar, false);
                    i5 = i5;
                    i6 = i6;
                    break;
                case 35:
                    i3 = i5;
                    i4 = i6;
                    g59.m(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 36:
                    i3 = i5;
                    i4 = i6;
                    g59.q(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 37:
                    i3 = i5;
                    i4 = i6;
                    g59.s(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 38:
                    i3 = i5;
                    i4 = i6;
                    g59.y(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 39:
                    i3 = i5;
                    i4 = i6;
                    g59.r(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 40:
                    i3 = i5;
                    i4 = i6;
                    g59.p(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 41:
                    i3 = i5;
                    i4 = i6;
                    g59.o(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 42:
                    i3 = i5;
                    i4 = i6;
                    g59.l(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 43:
                    i3 = i5;
                    i4 = i6;
                    g59.x(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    i3 = i5;
                    i4 = i6;
                    g59.n(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 45:
                    i3 = i5;
                    i4 = i6;
                    g59.t(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 46:
                    i3 = i5;
                    i4 = i6;
                    g59.u(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 47:
                    i3 = i5;
                    i4 = i6;
                    g59.v(iArr[i7], (List) unsafe.getObject(t, j), crbVar, i);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 48:
                    i3 = i5;
                    i4 = i6;
                    g59.w(iArr[i7], (List) unsafe.getObject(t, j), crbVar, true);
                    i5 = i3;
                    i6 = i4;
                    break;
                case 49:
                    i3 = i5;
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(t, j);
                    v49 v49VarK2 = hu6Var.k(i7);
                    Class<?> cls4 = g59.a;
                    if (list4 != null && !list4.isEmpty()) {
                        ug1 ug1Var3 = (ug1) crbVar;
                        ug1Var3.getClass();
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ug1Var3.a(i19, list4.get(i20), v49VarK2);
                        }
                    }
                    i5 = i3;
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(t, j);
                    if (object2 != null) {
                        Object objJ = hu6Var.j(i7);
                        wh6 wh6Var = hu6Var.k;
                        sh6.a<?, ?> aVarC = wh6Var.c(objJ);
                        uh6 uh6VarE = wh6Var.e(object2);
                        tg1 tg1Var4 = ((ug1) crbVar).a;
                        tg1Var4.getClass();
                        Iterator it = uh6VarE.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i21 = i5;
                            tg1Var4.E1(i8, 2);
                            int i22 = i6;
                            tg1Var4.G1(sh6.a(aVarC, entry2.getKey(), entry2.getValue()));
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            tu3.k(tg1Var4, aVarC.a, i, key);
                            tu3.k(tg1Var4, aVarC.b, 2, value);
                            i5 = i21;
                            i6 = i22;
                            it = it;
                            i = 1;
                        }
                    }
                    i3 = i5;
                    i4 = i6;
                    i5 = i3;
                    i6 = i4;
                    break;
                case 51:
                    if (hu6Var.o(i8, i7, t)) {
                        double dDoubleValue = ((Double) h3b.c.i(j, t)).doubleValue();
                        tg1 tg1Var5 = ((ug1) crbVar).a;
                        tg1Var5.getClass();
                        tg1Var5.u1(i8, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (hu6Var.o(i8, i7, t)) {
                        float fFloatValue = ((Float) h3b.c.i(j, t)).floatValue();
                        tg1 tg1Var6 = ((ug1) crbVar).a;
                        tg1Var6.getClass();
                        tg1Var6.s1(i8, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.H1(i8, u(j, t));
                    }
                    break;
                case 54:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.H1(i8, u(j, t));
                    }
                    break;
                case 55:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.w1(i8, t(j, t));
                    }
                    break;
                case 56:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.u1(i8, u(j, t));
                    }
                    break;
                case 57:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.s1(i8, t(j, t));
                    }
                    break;
                case 58:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.o1(i8, ((Boolean) h3b.c.i(j, t)).booleanValue());
                    }
                    break;
                case 59:
                    if (hu6Var.o(i8, i7, t)) {
                        Object object3 = unsafe.getObject(t, j);
                        if (object3 instanceof String) {
                            ((ug1) crbVar).a.C1(i8, (String) object3);
                        } else {
                            ((ug1) crbVar).a.q1(i8, (f01) object3);
                        }
                    }
                    break;
                case 60:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.y1(i8, (zt6) unsafe.getObject(t, j), hu6Var.k(i7));
                    }
                    break;
                case 61:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.q1(i8, (f01) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.F1(i8, t(j, t));
                    }
                    break;
                case 63:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.w1(i8, t(j, t));
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.s1(i8, t(j, t));
                    }
                    break;
                case 65:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a.u1(i8, u(j, t));
                    }
                    break;
                case 66:
                    if (hu6Var.o(i8, i7, t)) {
                        int iT = t(j, t);
                        ((ug1) crbVar).a.F1(i8, (iT >> 31) ^ (iT << 1));
                    }
                    break;
                case 67:
                    if (hu6Var.o(i8, i7, t)) {
                        long jU = u(j, t);
                        ((ug1) crbVar).a.H1(i8, (jU << i) ^ (jU >> 63));
                    }
                    break;
                case 68:
                    if (hu6Var.o(i8, i7, t)) {
                        ((ug1) crbVar).a(i8, unsafe.getObject(t, j), hu6Var.k(i7));
                    }
                    break;
                default:
                    break;
            }
        }
        if (entry != null) {
            wr3Var.f(entry);
            throw null;
        }
        p2b<?, ?> p2bVar = hu6Var.i;
        p2bVar.h(p2bVar.a(t), crbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.v49
    public final void a(T t, T t2) {
        T t3;
        if (!n(t)) {
            u.c(t, "Mutating immutable message: ");
            return;
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = g59.a;
                p2b<?, ?> p2bVar = this.i;
                p2bVar.f(t4, p2bVar.e(p2bVar.a(t4), p2bVar.a(t2)));
                if (this.d) {
                    g59.j(this.j, t4, t2);
                    return;
                }
                return;
            }
            int iZ = z(i);
            long j = 1048575 & iZ;
            int i2 = iArr[i];
            switch (y(iZ)) {
                case 0:
                    if (!l(i, t2)) {
                        t3 = t;
                    } else {
                        h3b.e eVar = h3b.c;
                        t3 = t;
                        eVar.m(t3, j, eVar.e(j, t2));
                        w(i, t3);
                    }
                    break;
                case 1:
                    if (l(i, t2)) {
                        h3b.e eVar2 = h3b.c;
                        eVar2.n(t, j, eVar2.f(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (l(i, t2)) {
                        h3b.o(t, j, h3b.c.h(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (l(i, t2)) {
                        h3b.o(t, j, h3b.c.h(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (l(i, t2)) {
                        h3b.o(t, j, h3b.c.h(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (l(i, t2)) {
                        h3b.e eVar3 = h3b.c;
                        eVar3.k(t, j, eVar3.c(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (l(i, t2)) {
                        h3b.p(j, t, h3b.c.i(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    p(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (l(i, t2)) {
                        h3b.p(j, t, h3b.c.i(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (l(i, t2)) {
                        h3b.o(t, j, h3b.c.h(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case h4c.e /* 15 */:
                    if (l(i, t2)) {
                        h3b.n(t, j, h3b.c.g(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (l(i, t2)) {
                        h3b.o(t, j, h3b.c.h(j, t2));
                        w(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    p(i, t, t2);
                    t3 = t;
                    break;
                case 18:
                case 19:
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case Carousel.ENTITY_TYPE /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.h.b(j, t, t2);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = g59.a;
                    h3b.e eVar4 = h3b.c;
                    h3b.p(j, t, this.k.a(eVar4.i(j, t), eVar4.i(j, t2)));
                    t3 = t;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (o(i2, i, t2)) {
                        h3b.p(j, t, h3b.c.i(j, t2));
                        x(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 60:
                    q(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (o(i2, i, t2)) {
                        h3b.p(j, t, h3b.c.i(j, t2));
                        x(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 68:
                    q(i, t, t2);
                    t3 = t;
                    break;
                default:
                    t3 = t;
                    break;
            }
            i += 3;
            t = t3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v49
    public final void b(T t) {
        if (n(t)) {
            if (t instanceof fk4) {
                fk4 fk4Var = (fk4) t;
                fk4Var.n(Integer.MAX_VALUE);
                fk4Var.memoizedHashCode = 0;
                fk4Var.t();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iZ = z(i);
                long j = 1048575 & iZ;
                int iY = y(iZ);
                if (iY != 9) {
                    if (iY != 60 && iY != 68) {
                        switch (iY) {
                            case 17:
                                if (l(i, t)) {
                                    k(i).b(m.getObject(t, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case InboxPagingSource.PAGE_SIZE /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case Carousel.ENTITY_TYPE /* 44 */:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.h.a(j, t);
                                break;
                            case 50:
                                Unsafe unsafe = m;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.k.b(object));
                                }
                                break;
                        }
                    } else if (o(iArr[i], i, t)) {
                        k(i).b(m.getObject(t, j));
                    }
                } else if (l(i, t)) {
                    k(i).b(m.getObject(t, j));
                }
            }
            this.i.d(t);
            if (this.d) {
                this.j.e(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [v49] */
    /* JADX WARN: Type inference failed for: r2v8, types: [v49] */
    /* JADX WARN: Type inference failed for: r2v9, types: [v49] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [v49] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // defpackage.v49
    public final boolean c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f) {
            int i6 = this.e[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iZ = z(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = m.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iZ) == 0 || m(t, i6, i, i2, i10)) {
                int iY = y(iZ);
                if (iY == 9 || iY == 17) {
                    if (m(t, i6, i, i2, i10)) {
                        if (!k(i6).c(h3b.c.i(iZ & 1048575, t))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iY != 27) {
                        if (iY == 60 || iY == 68) {
                            if (o(i7, i6, t)) {
                                if (!k(i6).c(h3b.c.i(iZ & 1048575, t))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iY != 49) {
                            if (iY != 50) {
                                continue;
                            } else {
                                Object objI = h3b.c.i(iZ & 1048575, t);
                                wh6 wh6Var = this.k;
                                uh6 uh6VarE = wh6Var.e(objI);
                                if (!uh6VarE.isEmpty() && wh6Var.c(j(i6)).b.t == hob.B) {
                                    ?? A = 0;
                                    for (Object obj : uh6VarE.values()) {
                                        if (A == 0) {
                                            A = A;
                                            A = xe8.c.a(obj.getClass());
                                        }
                                        A = A;
                                        if (!A.c(obj)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) h3b.c.i(iZ & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? K = k(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (K.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        if (this.d) {
            this.j.b(t).e();
        }
        return true;
    }

    @Override // defpackage.v49
    public final T d() {
        return (T) this.g.a(this.c);
    }

    @Override // defpackage.v49
    public final void e(T t, crb crbVar) {
        crbVar.getClass();
        A(t, crbVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.v49
    public final int f(fk4 fk4Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZ = z(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iZ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (y(iZ)) {
                case 0:
                    i = i3 * 53;
                    iB = zi5.b(Double.doubleToLongBits(h3b.c.e(j, fk4Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(h3b.c.f(j, fk4Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = zi5.b(h3b.c.h(j, fk4Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = zi5.b(h3b.c.h(j, fk4Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = zi5.b(h3b.c.h(j, fk4Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = h3b.c.c(j, fk4Var);
                    Charset charset = zi5.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) h3b.c.i(j, fk4Var)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objI = h3b.c.i(j, fk4Var);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = h3b.c.i(j, fk4Var).hashCode();
                    i3 = iB + i;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = zi5.b(h3b.c.h(j, fk4Var));
                    i3 = iB + i;
                    break;
                case h4c.e /* 15 */:
                    i = i3 * 53;
                    iB = h3b.c.g(j, fk4Var);
                    i3 = iB + i;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    i = i3 * 53;
                    iB = zi5.b(h3b.c.h(j, fk4Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objI2 = h3b.c.i(j, fk4Var);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case Carousel.ENTITY_TYPE /* 44 */:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = h3b.c.i(j, fk4Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = h3b.c.i(j, fk4Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(Double.doubleToLongBits(((Double) h3b.c.i(j, fk4Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) h3b.c.i(j, fk4Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(u(j, fk4Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(u(j, fk4Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(u(j, fk4Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (o(i5, i4, fk4Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) h3b.c.i(j, fk4Var)).booleanValue();
                        Charset charset2 = zi5.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = ((String) h3b.c.i(j, fk4Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = h3b.c.i(j, fk4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = h3b.c.i(j, fk4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(u(j, fk4Var));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = t(j, fk4Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = zi5.b(u(j, fk4Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (o(i5, i4, fk4Var)) {
                        i = i3 * 53;
                        iB = h3b.c.i(j, fk4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.i.a(fk4Var).hashCode() + (i3 * 53);
        if (!this.d) {
            return iHashCode2;
        }
        return this.j.b(fk4Var).a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x033a  */
    @Override // defpackage.v49
    public final int g(a2 a2Var) {
        int i;
        int iK1;
        int iK2;
        int iK3;
        int iM1;
        int iK4;
        int iH1;
        int iK5;
        int iK6;
        int iJ1;
        int iK7;
        int iM;
        int iL1;
        int iK8;
        int iI1;
        int iK9;
        int iM2;
        int iC;
        int iK10;
        int size;
        int i2;
        int iK11;
        int iK12;
        int size2;
        int iK13;
        int iM3;
        int iK14;
        int iK15;
        int iM4;
        int iJ2;
        hu6 hu6Var = this;
        a2 a2Var2 = a2Var;
        Unsafe unsafe = m;
        int i3 = 0;
        int i4 = 0;
        int iB = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = hu6Var.a;
            if (i3 >= iArr.length) {
                p2b<?, ?> p2bVar = hu6Var.i;
                int iB2 = p2bVar.b(p2bVar.a(a2Var2)) + iB;
                if (!hu6Var.d) {
                    return iB2;
                }
                fs9 fs9Var = hu6Var.j.b(a2Var2).a;
                int iC2 = 0;
                for (int i6 = 0; i6 < fs9Var.u.size(); i6++) {
                    Map.Entry<Object, Object> entryC = fs9Var.c(i6);
                    iC2 += tu3.c((tu3.a) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry<Object, Object> entry : fs9Var.d()) {
                    iC2 += tu3.c((tu3.a) entry.getKey(), entry.getValue());
                }
                return iB2 + iC2;
            }
            int iZ = hu6Var.z(i3);
            int iY = y(iZ);
            int i7 = iArr[i3];
            int i8 = iArr[i3 + 2];
            int i9 = i8 & 1048575;
            if (iY <= 17) {
                if (i9 != i5) {
                    i4 = i9 == 1048575 ? 0 : unsafe.getInt(a2Var2, i9);
                    i5 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iZ & 1048575;
            if (iY >= vu3.u.t) {
                int i10 = vu3.v.t;
            }
            switch (iY) {
                case 0:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK1 = tg1.k1(i7);
                        iC = iK1 + 8;
                        iB += iC;
                    }
                    break;
                case 1:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK2 = tg1.k1(i7);
                        iK6 = iK2 + 4;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case 2:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(a2Var2, j);
                        iK3 = tg1.k1(i7);
                        iM1 = tg1.m1(j2);
                        iB += iM1 + iK3;
                    }
                    hu6Var = this;
                    break;
                case 3:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(a2Var2, j);
                        iK3 = tg1.k1(i7);
                        iM1 = tg1.m1(j3);
                        iB += iM1 + iK3;
                    }
                    hu6Var = this;
                    break;
                case 4:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        int i11 = unsafe.getInt(a2Var2, j);
                        iK4 = tg1.k1(i7);
                        iH1 = tg1.h1(i11);
                        iB += iH1 + iK4;
                    }
                    hu6Var = this;
                    break;
                case 5:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK5 = tg1.k1(i7);
                        iK6 = iK5 + 8;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case 6:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK2 = tg1.k1(i7);
                        iK6 = iK2 + 4;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case 7:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK6 = tg1.k1(i7) + 1;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case 8:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(a2Var2, j);
                        if (object instanceof f01) {
                            int iK16 = tg1.k1(i7);
                            int size3 = ((f01) object).size();
                            iJ1 = h44.b(size3, size3, iK16, iB);
                        } else {
                            iJ1 = tg1.j1((String) object) + tg1.k1(i7) + iB;
                        }
                        iB = iJ1;
                    }
                    hu6Var = this;
                    break;
                case 9:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(a2Var2, j);
                        v49 v49VarK = hu6Var.k(i3);
                        Class<?> cls = g59.a;
                        if (object2 instanceof bt5) {
                            iK8 = tg1.k1(i7);
                            iI1 = tg1.i1((bt5) object2);
                            iC = iI1 + iK8;
                            iB += iC;
                        } else {
                            iK7 = tg1.k1(i7);
                            iM = ((a2) ((zt6) object2)).m(v49VarK);
                            iL1 = tg1.l1(iM);
                            iC = iL1 + iM + iK7;
                            iB += iC;
                        }
                    }
                    break;
                case 10:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        f01 f01Var = (f01) unsafe.getObject(a2Var2, j);
                        int iK17 = tg1.k1(i7);
                        int size4 = f01Var.size();
                        iB = h44.b(size4, size4, iK17, iB);
                    }
                    hu6Var = this;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(a2Var2, j);
                        iK4 = tg1.k1(i7);
                        iH1 = tg1.l1(i12);
                        iB += iH1 + iK4;
                    }
                    hu6Var = this;
                    break;
                case 12:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(a2Var2, j);
                        iK4 = tg1.k1(i7);
                        iH1 = tg1.h1(i13);
                        iB += iH1 + iK4;
                    }
                    hu6Var = this;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK2 = tg1.k1(i7);
                        iK6 = iK2 + 4;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case 14:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        iK5 = tg1.k1(i7);
                        iK6 = iK5 + 8;
                        iB += iK6;
                    }
                    hu6Var = this;
                    a2Var2 = a2Var;
                    break;
                case h4c.e /* 15 */:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        int i14 = unsafe.getInt(a2Var2, j);
                        iK4 = tg1.k1(i7);
                        iH1 = tg1.l1((i14 >> 31) ^ (i14 << 1));
                        iB += iH1 + iK4;
                    }
                    hu6Var = this;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        long j4 = unsafe.getLong(a2Var2, j);
                        iK3 = tg1.k1(i7);
                        iM1 = tg1.m1((j4 << 1) ^ (j4 >> 63));
                        iB += iM1 + iK3;
                    }
                    hu6Var = this;
                    break;
                case 17:
                    if (hu6Var.m(a2Var2, i3, i5, i4, i)) {
                        zt6 zt6Var = (zt6) unsafe.getObject(a2Var2, j);
                        v49 v49VarK2 = hu6Var.k(i3);
                        iK9 = tg1.k1(i7) * 2;
                        iM2 = ((a2) zt6Var).m(v49VarK2);
                        iC = iM2 + iK9;
                        iB += iC;
                    }
                    break;
                case 18:
                    iC = g59.c(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case 19:
                    iC = g59.b(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    List list = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls2 = g59.a;
                    if (list.size() == 0) {
                        iK10 = 0;
                    } else {
                        iK10 = (tg1.k1(i7) * list.size()) + g59.e(list);
                    }
                    iB += iK10;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls3 = g59.a;
                    size = list2.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.i(list2);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls4 = g59.a;
                    size = list3.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.d(list3);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 23:
                    iC = g59.c(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case 24:
                    iC = g59.b(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls5 = g59.a;
                    int size5 = list4.size();
                    iB += size5 == 0 ? 0 : (tg1.k1(i7) + 1) * size5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls6 = g59.a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iK10 = 0;
                    } else {
                        iK10 = tg1.k1(i7) * size6;
                        if (list5 instanceof h26) {
                            h26 h26Var = (h26) list5;
                            for (int i15 = 0; i15 < size6; i15++) {
                                Object objR0 = h26Var.r0(i15);
                                if (objR0 instanceof f01) {
                                    int size7 = ((f01) objR0).size();
                                    iK10 = tg1.l1(size7) + size7 + iK10;
                                } else {
                                    iK10 = tg1.j1((String) objR0) + iK10;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size6; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof f01) {
                                    int size8 = ((f01) obj).size();
                                    iK10 = tg1.l1(size8) + size8 + iK10;
                                } else {
                                    iK10 = tg1.j1((String) obj) + iK10;
                                }
                            }
                        }
                    }
                    iB += iK10;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(a2Var2, j);
                    v49 v49VarK3 = hu6Var.k(i3);
                    Class<?> cls7 = g59.a;
                    int size9 = list6.size();
                    if (size9 == 0) {
                        iK12 = 0;
                    } else {
                        iK12 = tg1.k1(i7) * size9;
                        for (int i17 = 0; i17 < size9; i17++) {
                            Object obj2 = list6.get(i17);
                            if (obj2 instanceof bt5) {
                                iK12 = tg1.i1((bt5) obj2) + iK12;
                            } else {
                                int iM5 = ((a2) ((zt6) obj2)).m(v49VarK3);
                                iK12 = tg1.l1(iM5) + iM5 + iK12;
                            }
                        }
                    }
                    iB += iK12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls8 = g59.a;
                    int size10 = list7.size();
                    if (size10 == 0) {
                        iK10 = 0;
                    } else {
                        iK10 = tg1.k1(i7) * size10;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size11 = ((f01) list7.get(i18)).size();
                            iK10 += tg1.l1(size11) + size11;
                        }
                    }
                    iB += iK10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls9 = g59.a;
                    size = list8.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.h(list8);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls10 = g59.a;
                    size = list9.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.a(list9);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 31:
                    iC = g59.b(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case 32:
                    iC = g59.c(i7, (List) unsafe.getObject(a2Var2, j));
                    iB += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls11 = g59.a;
                    size = list10.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.f(list10);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls12 = g59.a;
                    size = list11.size();
                    if (size == 0) {
                        iK10 = 0;
                    } else {
                        i2 = g59.g(list11);
                        iK11 = tg1.k1(i7);
                        iK10 = (iK11 * size) + i2;
                    }
                    iB += iK10;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls13 = g59.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls14 = g59.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 37:
                    size2 = g59.e((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 38:
                    size2 = g59.i((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 39:
                    size2 = g59.d((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls15 = g59.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls16 = g59.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls17 = g59.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 43:
                    size2 = g59.h((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    size2 = g59.a((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls18 = g59.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(a2Var2, j);
                    Class<?> cls19 = g59.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 47:
                    size2 = g59.f((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 48:
                    size2 = g59.g((List) unsafe.getObject(a2Var2, j));
                    if (size2 > 0) {
                        iK13 = tg1.k1(i7);
                        iB = h44.b(size2, iK13, size2, iB);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(a2Var2, j);
                    v49 v49VarK4 = hu6Var.k(i3);
                    Class<?> cls20 = g59.a;
                    int size12 = list19.size();
                    if (size12 == 0) {
                        iM3 = 0;
                    } else {
                        iM3 = 0;
                        for (int i19 = 0; i19 < size12; i19++) {
                            iM3 += ((a2) ((zt6) list19.get(i19))).m(v49VarK4) + (tg1.k1(i7) * 2);
                        }
                    }
                    iB += iM3;
                    break;
                case 50:
                    iC = hu6Var.k.d(i7, unsafe.getObject(a2Var2, j), hu6Var.j(i3));
                    iB += iC;
                    break;
                case 51:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK1 = tg1.k1(i7);
                        iC = iK1 + 8;
                        iB += iC;
                    }
                    break;
                case 52:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK14 = tg1.k1(i7);
                        iC = iK14 + 4;
                        iB += iC;
                    }
                    break;
                case 53:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        long jU = u(j, a2Var2);
                        iK15 = tg1.k1(i7);
                        iM4 = tg1.m1(jU);
                        iB += iM4 + iK15;
                    }
                    break;
                case 54:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        long jU2 = u(j, a2Var2);
                        iK15 = tg1.k1(i7);
                        iM4 = tg1.m1(jU2);
                        iB += iM4 + iK15;
                    }
                    break;
                case 55:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        int iT = t(j, a2Var2);
                        iK8 = tg1.k1(i7);
                        iI1 = tg1.h1(iT);
                        iC = iI1 + iK8;
                        iB += iC;
                    }
                    break;
                case 56:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK1 = tg1.k1(i7);
                        iC = iK1 + 8;
                        iB += iC;
                    }
                    break;
                case 57:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK14 = tg1.k1(i7);
                        iC = iK14 + 4;
                        iB += iC;
                    }
                    break;
                case 58:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iC = tg1.k1(i7) + 1;
                        iB += iC;
                    }
                    break;
                case 59:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        Object object3 = unsafe.getObject(a2Var2, j);
                        if (object3 instanceof f01) {
                            int iK18 = tg1.k1(i7);
                            int size13 = ((f01) object3).size();
                            iJ2 = h44.b(size13, size13, iK18, iB);
                        } else {
                            iJ2 = tg1.j1((String) object3) + tg1.k1(i7) + iB;
                        }
                        iB = iJ2;
                    }
                    break;
                case 60:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        Object object4 = unsafe.getObject(a2Var2, j);
                        v49 v49VarK5 = hu6Var.k(i3);
                        Class<?> cls21 = g59.a;
                        if (object4 instanceof bt5) {
                            iK8 = tg1.k1(i7);
                            iI1 = tg1.i1((bt5) object4);
                            iC = iI1 + iK8;
                            iB += iC;
                        } else {
                            iK7 = tg1.k1(i7);
                            iM = ((a2) ((zt6) object4)).m(v49VarK5);
                            iL1 = tg1.l1(iM);
                            iC = iL1 + iM + iK7;
                            iB += iC;
                        }
                    }
                    break;
                case 61:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        f01 f01Var2 = (f01) unsafe.getObject(a2Var2, j);
                        int iK19 = tg1.k1(i7);
                        int size14 = f01Var2.size();
                        iB = h44.b(size14, size14, iK19, iB);
                    }
                    break;
                case 62:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        int iT2 = t(j, a2Var2);
                        iK8 = tg1.k1(i7);
                        iI1 = tg1.l1(iT2);
                        iC = iI1 + iK8;
                        iB += iC;
                    }
                    break;
                case 63:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        int iT3 = t(j, a2Var2);
                        iK8 = tg1.k1(i7);
                        iI1 = tg1.h1(iT3);
                        iC = iI1 + iK8;
                        iB += iC;
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK14 = tg1.k1(i7);
                        iC = iK14 + 4;
                        iB += iC;
                    }
                    break;
                case 65:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        iK1 = tg1.k1(i7);
                        iC = iK1 + 8;
                        iB += iC;
                    }
                    break;
                case 66:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        int iT4 = t(j, a2Var2);
                        iK8 = tg1.k1(i7);
                        iI1 = tg1.l1((iT4 >> 31) ^ (iT4 << 1));
                        iC = iI1 + iK8;
                        iB += iC;
                    }
                    break;
                case 67:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        long jU3 = u(j, a2Var2);
                        iK15 = tg1.k1(i7);
                        iM4 = tg1.m1((jU3 << 1) ^ (jU3 >> 63));
                        iB += iM4 + iK15;
                    }
                    break;
                case 68:
                    if (hu6Var.o(i7, i3, a2Var2)) {
                        zt6 zt6Var2 = (zt6) unsafe.getObject(a2Var2, j);
                        v49 v49VarK6 = hu6Var.k(i3);
                        iK9 = tg1.k1(i7) * 2;
                        iM2 = ((a2) zt6Var2).m(v49VarK6);
                        iC = iM2 + iK9;
                        iB += iC;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.v49
    public final boolean h(fk4 fk4Var, fk4 fk4Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zK = true;
            if (i < length) {
                int iZ = z(i);
                long j = iZ & 1048575;
                switch (y(iZ)) {
                    case 0:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar = h3b.c;
                            if (Double.doubleToLongBits(eVar.e(j, fk4Var)) != Double.doubleToLongBits(eVar.e(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 1:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar2 = h3b.c;
                            if (Float.floatToIntBits(eVar2.f(j, fk4Var)) != Float.floatToIntBits(eVar2.f(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 2:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar3 = h3b.c;
                            if (eVar3.h(j, fk4Var) != eVar3.h(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 3:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar4 = h3b.c;
                            if (eVar4.h(j, fk4Var) != eVar4.h(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 4:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar5 = h3b.c;
                            if (eVar5.g(j, fk4Var) != eVar5.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 5:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar6 = h3b.c;
                            if (eVar6.h(j, fk4Var) != eVar6.h(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 6:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar7 = h3b.c;
                            if (eVar7.g(j, fk4Var) != eVar7.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 7:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar8 = h3b.c;
                            if (eVar8.c(j, fk4Var) != eVar8.c(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 8:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar9 = h3b.c;
                            if (!g59.k(eVar9.i(j, fk4Var), eVar9.i(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 9:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar10 = h3b.c;
                            if (!g59.k(eVar10.i(j, fk4Var), eVar10.i(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 10:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar11 = h3b.c;
                            if (!g59.k(eVar11.i(j, fk4Var), eVar11.i(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar12 = h3b.c;
                            if (eVar12.g(j, fk4Var) != eVar12.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 12:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar13 = h3b.c;
                            if (eVar13.g(j, fk4Var) != eVar13.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar14 = h3b.c;
                            if (eVar14.g(j, fk4Var) != eVar14.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 14:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar15 = h3b.c;
                            if (eVar15.h(j, fk4Var) != eVar15.h(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case h4c.e /* 15 */:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar16 = h3b.c;
                            if (eVar16.g(j, fk4Var) != eVar16.g(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar17 = h3b.c;
                            if (eVar17.h(j, fk4Var) != eVar17.h(j, fk4Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 17:
                        if (!i(fk4Var, fk4Var2, i)) {
                            zK = false;
                        } else {
                            h3b.e eVar18 = h3b.c;
                            if (!g59.k(eVar18.i(j, fk4Var), eVar18.i(j, fk4Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case Carousel.ENTITY_TYPE /* 44 */:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        h3b.e eVar19 = h3b.c;
                        zK = g59.k(eVar19.i(j, fk4Var), eVar19.i(j, fk4Var2));
                        break;
                    case 50:
                        h3b.e eVar20 = h3b.c;
                        zK = g59.k(eVar20.i(j, fk4Var), eVar20.i(j, fk4Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        h3b.e eVar21 = h3b.c;
                        if (eVar21.g(j2, fk4Var) != eVar21.g(j2, fk4Var2) || !g59.k(eVar21.i(j, fk4Var), eVar21.i(j, fk4Var2))) {
                            zK = false;
                        }
                        break;
                }
                if (zK) {
                    i += 3;
                }
            } else {
                p2b<?, ?> p2bVar = this.i;
                if (p2bVar.a(fk4Var).equals(p2bVar.a(fk4Var2))) {
                    if (!this.d) {
                        return true;
                    }
                    wr3<?> wr3Var = this.j;
                    return wr3Var.b(fk4Var).equals(wr3Var.b(fk4Var2));
                }
            }
        }
        return false;
    }

    public final boolean i(fk4 fk4Var, fk4 fk4Var2, int i) {
        return l(i, fk4Var) == l(i, fk4Var2);
    }

    public final Object j(int i) {
        return this.b[(i / 3) * 2];
    }

    public final v49 k(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        v49 v49Var = (v49) objArr[i2];
        if (v49Var != null) {
            return v49Var;
        }
        v49<T> v49VarA = xe8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = v49VarA;
        return v49VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & h3b.c.g(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iZ = z(i);
        long j2 = iZ & 1048575;
        switch (y(iZ)) {
            case 0:
                if (Double.doubleToRawLongBits(h3b.c.e(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(h3b.c.f(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (h3b.c.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (h3b.c.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (h3b.c.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return h3b.c.c(j2, obj);
            case 8:
                Object objI = h3b.c.i(j2, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof f01) {
                    return !f01.u.equals(objI);
                }
                zn3.b();
                return false;
            case 9:
                if (h3b.c.i(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !f01.u.equals(h3b.c.i(j2, obj));
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (h3b.c.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case h4c.e /* 15 */:
                if (h3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                if (h3b.c.h(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (h3b.c.i(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                zn3.b();
                return false;
        }
    }

    public final boolean m(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return l(i, t);
        }
        return (i3 & i4) != 0;
    }

    public final boolean o(int i, int i2, Object obj) {
        return h3b.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(int i, Object obj, Object obj2) {
        if (l(i, obj2)) {
            long jZ = z(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                vk.b(this.a[i], obj2);
                return;
            }
            v49 v49VarK = k(i);
            if (!l(i, obj)) {
                if (n(object)) {
                    Object objD = v49VarK.d();
                    v49VarK.a(objD, object);
                    unsafe.putObject(obj, jZ, objD);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                w(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!n(object2)) {
                Object objD2 = v49VarK.d();
                v49VarK.a(objD2, object2);
                unsafe.putObject(obj, jZ, objD2);
                object2 = objD2;
            }
            v49VarK.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (o(i2, i, obj2)) {
            long jZ = z(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jZ);
            if (object == null) {
                vk.b(iArr[i], obj2);
                return;
            }
            v49 v49VarK = k(i);
            if (!o(i2, i, obj)) {
                if (n(object)) {
                    Object objD = v49VarK.d();
                    v49VarK.a(objD, object);
                    unsafe.putObject(obj, jZ, objD);
                } else {
                    unsafe.putObject(obj, jZ, object);
                }
                x(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZ);
            if (!n(object2)) {
                Object objD2 = v49VarK.d();
                v49VarK.a(objD2, object2);
                unsafe.putObject(obj, jZ, objD2);
                object2 = objD2;
            }
            v49VarK.a(object2, object);
        }
    }

    public final void w(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        h3b.n(obj, j, (1 << (i2 >>> 20)) | h3b.c.g(j, obj));
    }

    public final void x(int i, int i2, Object obj) {
        h3b.n(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int z(int i) {
        return this.a[i + 1];
    }
}
