package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iu6<T> implements w49<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = i3b.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final au6 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final qa7 k;
    public final i96 l;
    public final q2b<?, ?> m;
    public final xr3<?> n;
    public final xh6 o;

    public iu6(int[] iArr, Object[] objArr, int i, int i2, au6 au6Var, int[] iArr2, int i3, int i4, qa7 qa7Var, i96 i96Var, q2b q2bVar, xr3 xr3Var, xh6 xh6Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = au6Var instanceof ek4;
        this.f = xr3Var != null && xr3Var.e(au6Var);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = qa7Var;
        this.l = i96Var;
        this.m = q2bVar;
        this.n = xr3Var;
        this.e = au6Var;
        this.o = xh6Var;
    }

    public static long A(long j, Object obj) {
        return ((Long) i3b.c.h(j, obj)).longValue();
    }

    public static Field F(Class<?> cls, String str) {
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

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ek4) {
            return ((ek4) obj).l();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0265  */
    /* JADX WARN: Code duplicated, block: B:125:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0280  */
    /* JADX WARN: Code duplicated, block: B:163:0x0325  */
    /* JADX WARN: Code duplicated, block: B:179:0x0373  */
    /* JADX WARN: Code duplicated, block: B:182:0x0380  */
    public static <T> iu6<T> x(yh8 yh8Var, qa7 qa7Var, i96 i96Var, q2b<?, ?> q2bVar, xr3<?> xr3Var, xh6 xh6Var) {
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
        Field fieldF;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldF2;
        int i25;
        Object obj2;
        Field fieldF3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        String str = yh8Var.b;
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
            iArr = p;
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
        Unsafe unsafe = q;
        Object[] objArr = yh8Var.c;
        Class<?> cls = yh8Var.a.getClass();
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
            ve8 ve8Var = ve8.t;
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
                    if (i79 == 12 && (yh8Var.c().equals(ve8Var) || (iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0)) {
                        i23 = i6 + 1;
                        objArr2[((i65 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i24 = i80 * 2;
                    obj = objArr3[i24];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArr3[i24] = fieldF2;
                    }
                    int i81 = i76;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF2);
                    i25 = i24 + 1;
                    obj2 = objArr3[i25];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArr3[i25] = fieldF3;
                    }
                    i18 = i6;
                    i20 = 0;
                    cls = cls;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                    i21 = iObjectFieldOffset4;
                    i19 = i81;
                }
                i6 = i23;
                i24 = i80 * 2;
                obj = objArr3[i24];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr3[i24] = fieldF2;
                }
                int i82 = i76;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldF2);
                i25 = i24 + 1;
                obj2 = objArr3[i25];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr3[i25] = fieldF3;
                }
                i18 = i6;
                i20 = 0;
                cls = cls;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                i21 = iObjectFieldOffset5;
                i19 = i82;
            } else {
                int i83 = i6 + 1;
                Field fieldF4 = F(cls, (String) objArr3[i6]);
                if (i73 == 9 || i73 == 17) {
                    objArr2[((i65 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i65 / 3) * 2) + 1] = objArr3[i83];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (yh8Var.c() == ve8Var || (iCharAt11 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i65 / 3) * 2) + 1] = objArr3[i83];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
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
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr3[i87] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
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
        return new iu6<>(iArr3, objArr2, i2, i5, yh8Var.a, iArr, i7, i61, qa7Var, i96Var, q2bVar, xr3Var, xh6Var);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) i3b.c.h(j, obj)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Object obj, long j, rg1 rg1Var, w49 w49Var, ur3 ur3Var) throws fk5.a {
        int iU;
        xi5.c cVarA = this.l.a(j, obj);
        pg1 pg1Var = rg1Var.a;
        int i = rg1Var.b;
        if ((i & 7) != 3) {
            throw fk5.b();
        }
        do {
            Object objD = w49Var.d();
            rg1Var.b(objD, w49Var, ur3Var);
            w49Var.b(objD);
            cVarA.add(objD);
            if (pg1Var.c() || rg1Var.d != 0) {
                return;
            } else {
                iU = pg1Var.u();
            }
        } while (iU == i);
        rg1Var.d = iU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Object obj, int i, rg1 rg1Var, w49 w49Var, ur3 ur3Var) throws fk5 {
        int iU;
        xi5.c cVarA = this.l.a(i & 1048575, obj);
        pg1 pg1Var = rg1Var.a;
        int i2 = rg1Var.b;
        if ((i2 & 7) != 2) {
            throw fk5.b();
        }
        do {
            Object objD = w49Var.d();
            rg1Var.c(objD, w49Var, ur3Var);
            w49Var.b(objD);
            cVarA.add(objD);
            if (pg1Var.c() || rg1Var.d != 0) {
                return;
            } else {
                iU = pg1Var.u();
            }
        } while (iU == i2);
        rg1Var.d = iU;
    }

    public final void D(Object obj, int i, rg1 rg1Var) throws fk5.a {
        if ((536870912 & i) != 0) {
            rg1Var.w(2);
            i3b.o(i & 1048575, obj, rg1Var.a.t());
        } else if (!this.g) {
            i3b.o(i & 1048575, obj, rg1Var.e());
        } else {
            rg1Var.w(2);
            i3b.o(i & 1048575, obj, rg1Var.a.s());
        }
    }

    public final void E(Object obj, int i, rg1 rg1Var) throws fk5.a {
        boolean z = (536870912 & i) != 0;
        i96 i96Var = this.l;
        if (z) {
            rg1Var.s(i96Var.a(i & 1048575, obj), true);
        } else {
            rg1Var.s(i96Var.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        i3b.m(obj, j, (1 << (i2 >>> 20)) | i3b.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        i3b.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void I(Object obj, int i, au6 au6Var) {
        q.putObject(obj, L(i) & 1048575, au6Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, au6 au6Var) {
        q.putObject(obj, L(i2) & 1048575, au6Var);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void M(T t, drb drbVar) {
        Map.Entry entry;
        char c;
        int i;
        int i2;
        int i3;
        boolean z;
        iu6<T> iu6Var = this;
        boolean z2 = iu6Var.f;
        xr3<?> xr3Var = iu6Var.n;
        if (z2) {
            su3<T> su3VarC = xr3Var.c(t);
            if (su3VarC.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) su3VarC.g().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = iu6Var.a;
        int length = iArr.length;
        Unsafe unsafe = q;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iL = iu6Var.L(i6);
            int i7 = iArr[i6];
            int iK = K(iL);
            if (iK <= 17) {
                int i8 = iArr[i6 + 2];
                c = 1;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = i9 == 1048575 ? 0 : unsafe.getInt(t, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                c = 1;
                i = 0;
            }
            if (entry != null) {
                xr3Var.a(entry);
                if (i7 >= 0) {
                    xr3Var.j(entry);
                    throw null;
                }
            }
            long j = iL & 1048575;
            switch (iK) {
                case 0:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        double d = i3b.c.d(j, t);
                        sg1 sg1Var = ((vg1) drbVar).a;
                        sg1Var.getClass();
                        sg1Var.x1(i7, Double.doubleToRawLongBits(d));
                    }
                    break;
                case 1:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        float fE = i3b.c.e(j, t);
                        sg1 sg1Var2 = ((vg1) drbVar).a;
                        sg1Var2.getClass();
                        sg1Var2.v1(i7, Float.floatToRawIntBits(fE));
                    }
                    iu6Var = this;
                    break;
                case 2:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.K1(i7, unsafe.getLong(t, j));
                    }
                    iu6Var = this;
                    break;
                case 3:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.K1(i7, unsafe.getLong(t, j));
                    }
                    iu6Var = this;
                    break;
                case 4:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.z1(i7, unsafe.getInt(t, j));
                    }
                    iu6Var = this;
                    break;
                case 5:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.x1(i7, unsafe.getLong(t, j));
                    }
                    iu6Var = this;
                    break;
                case 6:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.v1(i7, unsafe.getInt(t, j));
                    }
                    iu6Var = this;
                    break;
                case 7:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.r1(i7, i3b.c.c(j, t));
                    }
                    iu6Var = this;
                    break;
                case 8:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof String) {
                            ((vg1) drbVar).a.F1(i7, (String) object);
                        } else {
                            ((vg1) drbVar).a.t1(i7, (e01) object);
                        }
                    }
                    iu6Var = this;
                    break;
                case 9:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.B1(i7, (au6) unsafe.getObject(t, j), iu6Var.n(i6));
                    }
                    break;
                case 10:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.t1(i7, (e01) unsafe.getObject(t, j));
                    }
                    iu6Var = this;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.I1(i7, unsafe.getInt(t, j));
                    }
                    iu6Var = this;
                    break;
                case 12:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.z1(i7, unsafe.getInt(t, j));
                    }
                    iu6Var = this;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.v1(i7, unsafe.getInt(t, j));
                    }
                    iu6Var = this;
                    break;
                case 14:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a.x1(i7, unsafe.getLong(t, j));
                    }
                    iu6Var = this;
                    break;
                case h4c.e /* 15 */:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        int i10 = unsafe.getInt(t, j);
                        ((vg1) drbVar).a.I1(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    iu6Var = this;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        long j2 = unsafe.getLong(t, j);
                        ((vg1) drbVar).a.K1(i7, (j2 << 1) ^ (j2 >> 63));
                    }
                    iu6Var = this;
                    break;
                case 17:
                    if (iu6Var.p(t, i6, i4, i5, i)) {
                        ((vg1) drbVar).a(i7, unsafe.getObject(t, j), iu6Var.n(i6));
                    }
                    break;
                case 18:
                    i4 = i4;
                    i5 = i5;
                    h59.o(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 19:
                    i4 = i4;
                    i5 = i5;
                    h59.s(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    i4 = i4;
                    i5 = i5;
                    h59.u(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 21:
                    i4 = i4;
                    i5 = i5;
                    h59.A(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 22:
                    i4 = i4;
                    i5 = i5;
                    h59.t(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 23:
                    i4 = i4;
                    i5 = i5;
                    h59.r(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 24:
                    i4 = i4;
                    i5 = i5;
                    h59.q(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 25:
                    i4 = i4;
                    i5 = i5;
                    h59.n(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 26:
                    i2 = i4;
                    i3 = i5;
                    int i11 = iArr[i6];
                    List list = (List) unsafe.getObject(t, j);
                    Class<?> cls = h59.a;
                    if (list != null && !list.isEmpty()) {
                        sg1 sg1Var3 = ((vg1) drbVar).a;
                        if (list instanceof i26) {
                            i26 i26Var = (i26) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objY = i26Var.y();
                                if (objY instanceof String) {
                                    sg1Var3.F1(i11, (String) objY);
                                } else {
                                    sg1Var3.t1(i11, (e01) objY);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                sg1Var3.F1(i11, (String) list.get(i13));
                            }
                        }
                    }
                    i4 = i2;
                    i5 = i3;
                    break;
                case 27:
                    i2 = i4;
                    i3 = i5;
                    int i14 = iArr[i6];
                    List list2 = (List) unsafe.getObject(t, j);
                    w49 w49VarN = iu6Var.n(i6);
                    Class<?> cls2 = h59.a;
                    if (list2 != null && !list2.isEmpty()) {
                        vg1 vg1Var = (vg1) drbVar;
                        vg1Var.getClass();
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            vg1Var.a.B1(i14, (au6) list2.get(i15), w49VarN);
                        }
                    }
                    i4 = i2;
                    i5 = i3;
                    break;
                case 28:
                    i2 = i4;
                    i3 = i5;
                    int i16 = iArr[i6];
                    List list3 = (List) unsafe.getObject(t, j);
                    Class<?> cls3 = h59.a;
                    if (list3 != null && !list3.isEmpty()) {
                        vg1 vg1Var2 = (vg1) drbVar;
                        vg1Var2.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            vg1Var2.a.t1(i16, (e01) list3.get(i17));
                        }
                    }
                    i4 = i2;
                    i5 = i3;
                    break;
                case 29:
                    z = false;
                    h59.z(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 30:
                    z = false;
                    h59.p(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 31:
                    z = false;
                    h59.v(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 32:
                    z = false;
                    h59.w(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 33:
                    z = false;
                    h59.x(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 34:
                    z = false;
                    h59.y(iArr[i6], (List) unsafe.getObject(t, j), drbVar, false);
                    i4 = i4;
                    i5 = i5;
                    break;
                case 35:
                    i2 = i4;
                    i3 = i5;
                    h59.o(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 36:
                    i2 = i4;
                    i3 = i5;
                    h59.s(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 37:
                    i2 = i4;
                    i3 = i5;
                    h59.u(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 38:
                    i2 = i4;
                    i3 = i5;
                    h59.A(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 39:
                    i2 = i4;
                    i3 = i5;
                    h59.t(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 40:
                    i2 = i4;
                    i3 = i5;
                    h59.r(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 41:
                    i2 = i4;
                    i3 = i5;
                    h59.q(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 42:
                    i2 = i4;
                    i3 = i5;
                    h59.n(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 43:
                    i2 = i4;
                    i3 = i5;
                    h59.z(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    i2 = i4;
                    i3 = i5;
                    h59.p(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 45:
                    i2 = i4;
                    i3 = i5;
                    h59.v(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 46:
                    i2 = i4;
                    i3 = i5;
                    h59.w(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 47:
                    i2 = i4;
                    i3 = i5;
                    h59.x(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 48:
                    i2 = i4;
                    i3 = i5;
                    h59.y(iArr[i6], (List) unsafe.getObject(t, j), drbVar, c);
                    i4 = i2;
                    i5 = i3;
                    break;
                case 49:
                    i2 = i4;
                    i3 = i5;
                    int i18 = iArr[i6];
                    List list4 = (List) unsafe.getObject(t, j);
                    w49 w49VarN2 = iu6Var.n(i6);
                    Class<?> cls4 = h59.a;
                    if (list4 != null && !list4.isEmpty()) {
                        vg1 vg1Var3 = (vg1) drbVar;
                        vg1Var3.getClass();
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            vg1Var3.a(i18, list4.get(i19), w49VarN2);
                        }
                    }
                    i4 = i2;
                    i5 = i3;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(t, j);
                    if (object2 != null) {
                        Object objM = iu6Var.m(i6);
                        xh6 xh6Var = iu6Var.o;
                        rh6.a<?, ?> aVarC = xh6Var.c(objM);
                        vh6 vh6VarE = xh6Var.e(object2);
                        sg1 sg1Var4 = ((vg1) drbVar).a;
                        sg1Var4.getClass();
                        for (Map.Entry entry2 : vh6VarE.entrySet()) {
                            sg1Var4.H1(i7, 2);
                            sg1Var4.J1(rh6.a(aVarC, entry2.getKey(), entry2.getValue()));
                            rh6.b(sg1Var4, aVarC, entry2.getKey(), entry2.getValue());
                            i4 = i4;
                            i5 = i5;
                        }
                    }
                    i2 = i4;
                    i3 = i5;
                    i4 = i2;
                    i5 = i3;
                    break;
                case 51:
                    if (iu6Var.r(i7, i6, t)) {
                        double dDoubleValue = ((Double) i3b.c.h(j, t)).doubleValue();
                        sg1 sg1Var5 = ((vg1) drbVar).a;
                        sg1Var5.getClass();
                        sg1Var5.x1(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (iu6Var.r(i7, i6, t)) {
                        float fFloatValue = ((Float) i3b.c.h(j, t)).floatValue();
                        sg1 sg1Var6 = ((vg1) drbVar).a;
                        sg1Var6.getClass();
                        sg1Var6.v1(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.K1(i7, A(j, t));
                    }
                    break;
                case 54:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.K1(i7, A(j, t));
                    }
                    break;
                case 55:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.z1(i7, z(j, t));
                    }
                    break;
                case 56:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.x1(i7, A(j, t));
                    }
                    break;
                case 57:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.v1(i7, z(j, t));
                    }
                    break;
                case 58:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.r1(i7, ((Boolean) i3b.c.h(j, t)).booleanValue());
                    }
                    break;
                case 59:
                    if (iu6Var.r(i7, i6, t)) {
                        Object object3 = unsafe.getObject(t, j);
                        if (object3 instanceof String) {
                            ((vg1) drbVar).a.F1(i7, (String) object3);
                        } else {
                            ((vg1) drbVar).a.t1(i7, (e01) object3);
                        }
                    }
                    break;
                case 60:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.B1(i7, (au6) unsafe.getObject(t, j), iu6Var.n(i6));
                    }
                    break;
                case 61:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.t1(i7, (e01) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.I1(i7, z(j, t));
                    }
                    break;
                case 63:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.z1(i7, z(j, t));
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.v1(i7, z(j, t));
                    }
                    break;
                case 65:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a.x1(i7, A(j, t));
                    }
                    break;
                case 66:
                    if (iu6Var.r(i7, i6, t)) {
                        int iZ = z(j, t);
                        ((vg1) drbVar).a.I1(i7, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    if (iu6Var.r(i7, i6, t)) {
                        long jA = A(j, t);
                        ((vg1) drbVar).a.K1(i7, (jA << c) ^ (jA >> 63));
                    }
                    break;
                case 68:
                    if (iu6Var.r(i7, i6, t)) {
                        ((vg1) drbVar).a(i7, unsafe.getObject(t, j), iu6Var.n(i6));
                    }
                    break;
                default:
                    break;
            }
        }
        if (entry != null) {
            xr3Var.j(entry);
            throw null;
        }
        q2b<?, ?> q2bVar = iu6Var.m;
        q2bVar.r(q2bVar.g(t), drbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.w49
    public final void a(T t, T t2) {
        T t3;
        if (!q(t)) {
            u.c(t, "Mutating immutable message: ");
            return;
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = h59.a;
                q2b<?, ?> q2bVar = this.m;
                q2bVar.o(t4, q2bVar.k(q2bVar.g(t4), q2bVar.g(t2)));
                if (this.f) {
                    h59.k(this.n, t4, t2);
                    return;
                }
                return;
            }
            int iL = L(i);
            long j = 1048575 & iL;
            int i2 = iArr[i];
            switch (K(iL)) {
                case 0:
                    if (!o(i, t2)) {
                        t3 = t;
                    } else {
                        i3b.e eVar = i3b.c;
                        t3 = t;
                        eVar.l(t3, j, eVar.d(j, t2));
                        G(i, t3);
                    }
                    break;
                case 1:
                    if (o(i, t2)) {
                        i3b.e eVar2 = i3b.c;
                        eVar2.m(t, j, eVar2.e(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (o(i, t2)) {
                        i3b.n(t, j, i3b.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (o(i, t2)) {
                        i3b.n(t, j, i3b.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (o(i, t2)) {
                        i3b.n(t, j, i3b.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (o(i, t2)) {
                        i3b.e eVar3 = i3b.c;
                        eVar3.j(t, j, eVar3.c(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (o(i, t2)) {
                        i3b.o(j, t, i3b.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 9:
                    t(i, t, t2);
                    t3 = t;
                    break;
                case 10:
                    if (o(i, t2)) {
                        i3b.o(j, t, i3b.c.h(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (o(i, t2)) {
                        i3b.n(t, j, i3b.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case h4c.e /* 15 */:
                    if (o(i, t2)) {
                        i3b.m(t, j, i3b.c.f(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (o(i, t2)) {
                        i3b.n(t, j, i3b.c.g(j, t2));
                        G(i, t);
                    }
                    t3 = t;
                    break;
                case 17:
                    t(i, t, t2);
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
                    this.l.b(j, t, t2);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = h59.a;
                    i3b.e eVar4 = i3b.c;
                    i3b.o(j, t, this.o.a(eVar4.h(j, t), eVar4.h(j, t2)));
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
                    if (r(i2, i, t2)) {
                        i3b.o(j, t, i3b.c.h(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 60:
                    u(i, t, t2);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (r(i2, i, t2)) {
                        i3b.o(j, t, i3b.c.h(j, t2));
                        H(i2, i, t);
                    }
                    t3 = t;
                    break;
                case 68:
                    u(i, t, t2);
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
    @Override // defpackage.w49
    public final void b(T t) {
        if (q(t)) {
            if (t instanceof ek4) {
                ek4 ek4Var = (ek4) t;
                ek4Var.g(Integer.MAX_VALUE);
                ek4Var.memoizedHashCode = 0;
                ek4Var.m();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iL = L(i);
                long j = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (o(i, t)) {
                                    n(i).b(q.getObject(t, j));
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
                                this.l.c(j, t);
                                break;
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.o.b(object));
                                }
                                break;
                        }
                    } else if (r(iArr[i], i, t)) {
                        n(i).b(q.getObject(t, j));
                    }
                } else if (o(i, t)) {
                    n(i).b(q.getObject(t, j));
                }
            }
            this.m.j(t);
            if (this.f) {
                this.n.f(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [w49] */
    /* JADX WARN: Type inference failed for: r2v8, types: [w49] */
    /* JADX WARN: Type inference failed for: r2v9, types: [w49] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [w49] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // defpackage.w49
    public final boolean c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.i) {
            int i6 = this.h[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iL = L(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = q.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iL) == 0 || p(t, i6, i, i2, i10)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (p(t, i6, i, i2, i10)) {
                        if (!n(i6).c(i3b.c.h(iL & 1048575, t))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (r(i7, i6, t)) {
                                if (!n(i6).c(i3b.c.h(iL & 1048575, t))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = i3b.c.h(iL & 1048575, t);
                                xh6 xh6Var = this.o;
                                vh6 vh6VarE = xh6Var.e(objH);
                                if (!vh6VarE.isEmpty() && xh6Var.c(m(i6)).b.t == iob.B) {
                                    ?? A = 0;
                                    for (Object obj : vh6VarE.values()) {
                                        if (A == 0) {
                                            A = A;
                                            A = ye8.c.a(obj.getClass());
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
                    List list = (List) i3b.c.h(iL & 1048575, t);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? N = n(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (N.c(list.get(i12))) {
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
        if (this.f) {
            this.n.c(t).e();
        }
        return true;
    }

    @Override // defpackage.w49
    public final T d() {
        return (T) this.k.a(this.e);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.w49
    public final boolean e(ek4 ek4Var, ek4 ek4Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iL = L(i);
                long j = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar = i3b.c;
                            if (Double.doubleToLongBits(eVar.d(j, ek4Var)) != Double.doubleToLongBits(eVar.d(j, ek4Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar2 = i3b.c;
                            if (Float.floatToIntBits(eVar2.e(j, ek4Var)) != Float.floatToIntBits(eVar2.e(j, ek4Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar3 = i3b.c;
                            if (eVar3.g(j, ek4Var) != eVar3.g(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar4 = i3b.c;
                            if (eVar4.g(j, ek4Var) != eVar4.g(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar5 = i3b.c;
                            if (eVar5.f(j, ek4Var) != eVar5.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar6 = i3b.c;
                            if (eVar6.g(j, ek4Var) != eVar6.g(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar7 = i3b.c;
                            if (eVar7.f(j, ek4Var) != eVar7.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar8 = i3b.c;
                            if (eVar8.c(j, ek4Var) != eVar8.c(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar9 = i3b.c;
                            if (!h59.l(eVar9.h(j, ek4Var), eVar9.h(j, ek4Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar10 = i3b.c;
                            if (!h59.l(eVar10.h(j, ek4Var), eVar10.h(j, ek4Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar11 = i3b.c;
                            if (!h59.l(eVar11.h(j, ek4Var), eVar11.h(j, ek4Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar12 = i3b.c;
                            if (eVar12.f(j, ek4Var) != eVar12.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar13 = i3b.c;
                            if (eVar13.f(j, ek4Var) != eVar13.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar14 = i3b.c;
                            if (eVar14.f(j, ek4Var) != eVar14.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar15 = i3b.c;
                            if (eVar15.g(j, ek4Var) != eVar15.g(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case h4c.e /* 15 */:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar16 = i3b.c;
                            if (eVar16.f(j, ek4Var) != eVar16.f(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar17 = i3b.c;
                            if (eVar17.g(j, ek4Var) != eVar17.g(j, ek4Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(ek4Var, ek4Var2, i)) {
                            zL = false;
                        } else {
                            i3b.e eVar18 = i3b.c;
                            if (!h59.l(eVar18.h(j, ek4Var), eVar18.h(j, ek4Var2))) {
                                zL = false;
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
                        i3b.e eVar19 = i3b.c;
                        zL = h59.l(eVar19.h(j, ek4Var), eVar19.h(j, ek4Var2));
                        break;
                    case 50:
                        i3b.e eVar20 = i3b.c;
                        zL = h59.l(eVar20.h(j, ek4Var), eVar20.h(j, ek4Var2));
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
                        i3b.e eVar21 = i3b.c;
                        if (eVar21.f(j2, ek4Var) != eVar21.f(j2, ek4Var2) || !h59.l(eVar21.h(j, ek4Var), eVar21.h(j, ek4Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                q2b<?, ?> q2bVar = this.m;
                if (q2bVar.g(ek4Var).equals(q2bVar.g(ek4Var2))) {
                    if (!this.f) {
                        return true;
                    }
                    xr3<?> xr3Var = this.n;
                    return xr3Var.c(ek4Var).equals(xr3Var.c(ek4Var2));
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.w49
    public final void f(java.lang.Object r21, defpackage.rg1 r22, defpackage.ur3 r23) {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu6.f(java.lang.Object, rg1, ur3):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.w49
    public final int g(ek4 ek4Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iL = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iL;
            int i6 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i = i3 * 53;
                    iB = xi5.b(Double.doubleToLongBits(i3b.c.d(j, ek4Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(i3b.c.e(j, ek4Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = xi5.b(i3b.c.g(j, ek4Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = xi5.b(i3b.c.g(j, ek4Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = xi5.b(i3b.c.g(j, ek4Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = i3b.c.c(j, ek4Var);
                    Charset charset = xi5.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) i3b.c.h(j, ek4Var)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = i3b.c.h(j, ek4Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = i3b.c.h(j, ek4Var).hashCode();
                    i3 = iB + i;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = xi5.b(i3b.c.g(j, ek4Var));
                    i3 = iB + i;
                    break;
                case h4c.e /* 15 */:
                    i = i3 * 53;
                    iB = i3b.c.f(j, ek4Var);
                    i3 = iB + i;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    i = i3 * 53;
                    iB = xi5.b(i3b.c.g(j, ek4Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = i3b.c.h(j, ek4Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = i3b.c.h(j, ek4Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = i3b.c.h(j, ek4Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(Double.doubleToLongBits(((Double) i3b.c.h(j, ek4Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) i3b.c.h(j, ek4Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(A(j, ek4Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(A(j, ek4Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(A(j, ek4Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (r(i5, i4, ek4Var)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) i3b.c.h(j, ek4Var)).booleanValue();
                        Charset charset2 = xi5.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = ((String) i3b.c.h(j, ek4Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = i3b.c.h(j, ek4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = i3b.c.h(j, ek4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(A(j, ek4Var));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = z(j, ek4Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = xi5.b(A(j, ek4Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (r(i5, i4, ek4Var)) {
                        i = i3 * 53;
                        iB = i3b.c.h(j, ek4Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.m.g(ek4Var).hashCode() + (i3 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        return this.n.c(ek4Var).a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0357  */
    @Override // defpackage.w49
    public final int h(z1 z1Var) {
        int i;
        int iM1;
        int iM2;
        int iM3;
        int iO1;
        int iM4;
        int iO2;
        int iM5;
        int iM6;
        int iM7;
        int iF;
        int iN1;
        int iM8;
        int iI1;
        int iH1;
        int iM9;
        int iF2;
        int iC;
        int iM10;
        int size;
        int i2;
        int iM11;
        int iM12;
        int size2;
        int iM13;
        int iN2;
        int iF3;
        int iM14;
        int iM15;
        int iO3;
        iu6 iu6Var = this;
        z1 z1Var2 = z1Var;
        Unsafe unsafe = q;
        int i3 = 0;
        int i4 = 0;
        int iH2 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = iu6Var.a;
            if (i3 >= iArr.length) {
                q2b<?, ?> q2bVar = iu6Var.m;
                int iH = q2bVar.h(q2bVar.g(z1Var2)) + iH2;
                if (!iu6Var.f) {
                    return iH;
                }
                gs9 gs9Var = iu6Var.n.c(z1Var2).a;
                int size3 = gs9Var.t.size();
                int iC2 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    Map.Entry<su3.a<Object>, Object> entryC = gs9Var.c(i6);
                    iC2 += su3.c(entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : gs9Var.d()) {
                    iC2 += su3.c((su3.a) entry.getKey(), entry.getValue());
                }
                return iH + iC2;
            }
            int iL = iu6Var.L(i3);
            int iK = K(iL);
            int i7 = iArr[i3];
            int i8 = iArr[i3 + 2];
            int i9 = i8 & 1048575;
            if (iK <= 17) {
                if (i9 != i5) {
                    i4 = i9 == 1048575 ? 0 : unsafe.getInt(z1Var2, i9);
                    i5 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iL & 1048575;
            if (iK >= wu3.u.t) {
                int i10 = wu3.v.t;
            }
            switch (iK) {
                case 0:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM1 = sg1.m1(i7);
                        iC = iM1 + 8;
                        iH2 += iC;
                    }
                    break;
                case 1:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM2 = sg1.m1(i7);
                        iM6 = iM2 + 4;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case 2:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(z1Var2, j);
                        iM3 = sg1.m1(i7);
                        iO1 = sg1.o1(j2);
                        iH2 += iO1 + iM3;
                    }
                    iu6Var = this;
                    break;
                case 3:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(z1Var2, j);
                        iM3 = sg1.m1(i7);
                        iO1 = sg1.o1(j3);
                        iH2 += iO1 + iM3;
                    }
                    iu6Var = this;
                    break;
                case 4:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        int i11 = unsafe.getInt(z1Var2, j);
                        iM4 = sg1.m1(i7);
                        iO2 = sg1.o1(i11);
                        iH1 = iO2 + iM4;
                        iH2 += iH1;
                    }
                    iu6Var = this;
                    break;
                case 5:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM5 = sg1.m1(i7);
                        iM6 = iM5 + 8;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case 6:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM2 = sg1.m1(i7);
                        iM6 = iM2 + 4;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case 7:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM6 = sg1.m1(i7) + 1;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case 8:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(z1Var2, j);
                        iH2 = (object instanceof e01 ? sg1.h1(i7, (e01) object) : sg1.l1((String) object) + sg1.m1(i7)) + iH2;
                    }
                    iu6Var = this;
                    break;
                case 9:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(z1Var2, j);
                        w49 w49VarN = iu6Var.n(i3);
                        Class<?> cls = h59.a;
                        if (object2 instanceof ct5) {
                            iM8 = sg1.m1(i7);
                            iI1 = sg1.i1((ct5) object2);
                            iC = iI1 + iM8;
                            iH2 += iC;
                        } else {
                            iM7 = sg1.m1(i7);
                            iF = ((z1) ((au6) object2)).f(w49VarN);
                            iN1 = sg1.n1(iF);
                            iC = iN1 + iF + iM7;
                            iH2 += iC;
                        }
                    }
                    break;
                case 10:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iH1 = sg1.h1(i7, (e01) unsafe.getObject(z1Var2, j));
                        iH2 += iH1;
                    }
                    iu6Var = this;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(z1Var2, j);
                        iM4 = sg1.m1(i7);
                        iO2 = sg1.n1(i12);
                        iH1 = iO2 + iM4;
                        iH2 += iH1;
                    }
                    iu6Var = this;
                    break;
                case 12:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        int i13 = unsafe.getInt(z1Var2, j);
                        iM4 = sg1.m1(i7);
                        iO2 = sg1.o1(i13);
                        iH1 = iO2 + iM4;
                        iH2 += iH1;
                    }
                    iu6Var = this;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM2 = sg1.m1(i7);
                        iM6 = iM2 + 4;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case 14:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        iM5 = sg1.m1(i7);
                        iM6 = iM5 + 8;
                        iH2 += iM6;
                    }
                    iu6Var = this;
                    z1Var2 = z1Var;
                    break;
                case h4c.e /* 15 */:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        int i14 = unsafe.getInt(z1Var2, j);
                        iM4 = sg1.m1(i7);
                        iO2 = sg1.j1(i14);
                        iH1 = iO2 + iM4;
                        iH2 += iH1;
                    }
                    iu6Var = this;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        long j4 = unsafe.getLong(z1Var2, j);
                        iM3 = sg1.m1(i7);
                        iO1 = sg1.k1(j4);
                        iH2 += iO1 + iM3;
                    }
                    iu6Var = this;
                    break;
                case 17:
                    if (iu6Var.p(z1Var2, i3, i5, i4, i)) {
                        au6 au6Var = (au6) unsafe.getObject(z1Var2, j);
                        w49 w49VarN2 = iu6Var.n(i3);
                        iM9 = sg1.m1(i7) * 2;
                        iF2 = ((z1) au6Var).f(w49VarN2);
                        iC = iF2 + iM9;
                        iH2 += iC;
                    }
                    break;
                case 18:
                    iC = h59.c(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case 19:
                    iC = h59.b(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    List list = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls2 = h59.a;
                    if (list.size() == 0) {
                        iM10 = 0;
                    } else {
                        iM10 = (sg1.m1(i7) * list.size()) + h59.e(list);
                    }
                    iH2 += iM10;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls3 = h59.a;
                    size = list2.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.i(list2);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls4 = h59.a;
                    size = list3.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.d(list3);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 23:
                    iC = h59.c(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case 24:
                    iC = h59.b(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls5 = h59.a;
                    int size4 = list4.size();
                    iH2 += size4 == 0 ? 0 : (sg1.m1(i7) + 1) * size4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls6 = h59.a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iM10 = 0;
                    } else {
                        iM10 = sg1.m1(i7) * size5;
                        if (list5 instanceof i26) {
                            i26 i26Var = (i26) list5;
                            for (int i15 = 0; i15 < size5; i15++) {
                                Object objY = i26Var.y();
                                if (objY instanceof e01) {
                                    int size6 = ((e01) objY).size();
                                    iM10 = sg1.n1(size6) + size6 + iM10;
                                } else {
                                    iM10 = sg1.l1((String) objY) + iM10;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size5; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof e01) {
                                    int size7 = ((e01) obj).size();
                                    iM10 = sg1.n1(size7) + size7 + iM10;
                                } else {
                                    iM10 = sg1.l1((String) obj) + iM10;
                                }
                            }
                        }
                    }
                    iH2 += iM10;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(z1Var2, j);
                    w49 w49VarN3 = iu6Var.n(i3);
                    Class<?> cls7 = h59.a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iM12 = 0;
                    } else {
                        iM12 = sg1.m1(i7) * size8;
                        for (int i17 = 0; i17 < size8; i17++) {
                            Object obj2 = list6.get(i17);
                            if (obj2 instanceof ct5) {
                                iM12 = sg1.i1((ct5) obj2) + iM12;
                            } else {
                                int iF4 = ((z1) ((au6) obj2)).f(w49VarN3);
                                iM12 = sg1.n1(iF4) + iF4 + iM12;
                            }
                        }
                    }
                    iH2 += iM12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls8 = h59.a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iM10 = 0;
                    } else {
                        iM10 = sg1.m1(i7) * size9;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size10 = ((e01) list7.get(i18)).size();
                            iM10 += sg1.n1(size10) + size10;
                        }
                    }
                    iH2 += iM10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls9 = h59.a;
                    size = list8.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.h(list8);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls10 = h59.a;
                    size = list9.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.a(list9);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 31:
                    iC = h59.b(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case 32:
                    iC = h59.c(i7, (List) unsafe.getObject(z1Var2, j));
                    iH2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls11 = h59.a;
                    size = list10.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.f(list10);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls12 = h59.a;
                    size = list11.size();
                    if (size == 0) {
                        iM10 = 0;
                    } else {
                        i2 = h59.g(list11);
                        iM11 = sg1.m1(i7);
                        iM10 = (iM11 * size) + i2;
                    }
                    iH2 += iM10;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls13 = h59.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls14 = h59.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 37:
                    size2 = h59.e((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 38:
                    size2 = h59.i((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 39:
                    size2 = h59.d((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls15 = h59.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls16 = h59.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls17 = h59.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 43:
                    size2 = h59.h((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    size2 = h59.a((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls18 = h59.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(z1Var2, j);
                    Class<?> cls19 = h59.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 47:
                    size2 = h59.f((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 48:
                    size2 = h59.g((List) unsafe.getObject(z1Var2, j));
                    if (size2 > 0) {
                        iM13 = sg1.m1(i7);
                        iN2 = sg1.n1(size2);
                        iH2 += iN2 + iM13 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(z1Var2, j);
                    w49 w49VarN4 = iu6Var.n(i3);
                    Class<?> cls20 = h59.a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iF3 = 0;
                    } else {
                        iF3 = 0;
                        for (int i19 = 0; i19 < size11; i19++) {
                            iF3 += ((z1) ((au6) list19.get(i19))).f(w49VarN4) + (sg1.m1(i7) * 2);
                        }
                    }
                    iH2 += iF3;
                    break;
                case 50:
                    iC = iu6Var.o.d(i7, unsafe.getObject(z1Var2, j), iu6Var.m(i3));
                    iH2 += iC;
                    break;
                case 51:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM1 = sg1.m1(i7);
                        iC = iM1 + 8;
                        iH2 += iC;
                    }
                    break;
                case 52:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM14 = sg1.m1(i7);
                        iC = iM14 + 4;
                        iH2 += iC;
                    }
                    break;
                case 53:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        long jA = A(j, z1Var2);
                        iM15 = sg1.m1(i7);
                        iO3 = sg1.o1(jA);
                        iH2 += iO3 + iM15;
                    }
                    break;
                case 54:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        long jA2 = A(j, z1Var2);
                        iM15 = sg1.m1(i7);
                        iO3 = sg1.o1(jA2);
                        iH2 += iO3 + iM15;
                    }
                    break;
                case 55:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        int iZ = z(j, z1Var2);
                        iM8 = sg1.m1(i7);
                        iI1 = sg1.o1(iZ);
                        iC = iI1 + iM8;
                        iH2 += iC;
                    }
                    break;
                case 56:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM1 = sg1.m1(i7);
                        iC = iM1 + 8;
                        iH2 += iC;
                    }
                    break;
                case 57:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM14 = sg1.m1(i7);
                        iC = iM14 + 4;
                        iH2 += iC;
                    }
                    break;
                case 58:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iC = sg1.m1(i7) + 1;
                        iH2 += iC;
                    }
                    break;
                case 59:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        Object object3 = unsafe.getObject(z1Var2, j);
                        iH2 = (object3 instanceof e01 ? sg1.h1(i7, (e01) object3) : sg1.l1((String) object3) + sg1.m1(i7)) + iH2;
                    }
                    break;
                case 60:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        Object object4 = unsafe.getObject(z1Var2, j);
                        w49 w49VarN5 = iu6Var.n(i3);
                        Class<?> cls21 = h59.a;
                        if (object4 instanceof ct5) {
                            iM8 = sg1.m1(i7);
                            iI1 = sg1.i1((ct5) object4);
                            iC = iI1 + iM8;
                            iH2 += iC;
                        } else {
                            iM7 = sg1.m1(i7);
                            iF = ((z1) ((au6) object4)).f(w49VarN5);
                            iN1 = sg1.n1(iF);
                            iC = iN1 + iF + iM7;
                            iH2 += iC;
                        }
                    }
                    break;
                case 61:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iC = sg1.h1(i7, (e01) unsafe.getObject(z1Var2, j));
                        iH2 += iC;
                    }
                    break;
                case 62:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        int iZ2 = z(j, z1Var2);
                        iM8 = sg1.m1(i7);
                        iI1 = sg1.n1(iZ2);
                        iC = iI1 + iM8;
                        iH2 += iC;
                    }
                    break;
                case 63:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        int iZ3 = z(j, z1Var2);
                        iM8 = sg1.m1(i7);
                        iI1 = sg1.o1(iZ3);
                        iC = iI1 + iM8;
                        iH2 += iC;
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM14 = sg1.m1(i7);
                        iC = iM14 + 4;
                        iH2 += iC;
                    }
                    break;
                case 65:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        iM1 = sg1.m1(i7);
                        iC = iM1 + 8;
                        iH2 += iC;
                    }
                    break;
                case 66:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        int iZ4 = z(j, z1Var2);
                        iM8 = sg1.m1(i7);
                        iI1 = sg1.j1(iZ4);
                        iC = iI1 + iM8;
                        iH2 += iC;
                    }
                    break;
                case 67:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        long jA3 = A(j, z1Var2);
                        iM15 = sg1.m1(i7);
                        iO3 = sg1.k1(jA3);
                        iH2 += iO3 + iM15;
                    }
                    break;
                case 68:
                    if (iu6Var.r(i7, i3, z1Var2)) {
                        au6 au6Var2 = (au6) unsafe.getObject(z1Var2, j);
                        w49 w49VarN6 = iu6Var.n(i3);
                        iM9 = sg1.m1(i7) * 2;
                        iF2 = ((z1) au6Var2).f(w49VarN6);
                        iC = iF2 + iM9;
                        iH2 += iC;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    @Override // defpackage.w49
    public final void i(T t, drb drbVar) {
        drbVar.getClass();
        M(t, drbVar);
    }

    public final boolean j(ek4 ek4Var, ek4 ek4Var2, int i) {
        return o(i, ek4Var) == o(i, ek4Var2);
    }

    public final <UT, UB> UB k(Object obj, int i, UB ub, q2b<UT, UB> q2bVar, Object obj2) {
        xi5.b bVarL;
        int i2 = this.a[i];
        Object objH = i3b.c.h(L(i) & 1048575, obj);
        if (objH == null || (bVarL = l(i)) == null) {
            return ub;
        }
        xh6 xh6Var = this.o;
        vh6 vh6VarG = xh6Var.g(objH);
        rh6.a<?, ?> aVarC = xh6Var.c(m(i));
        Iterator it = vh6VarG.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!bVarL.a()) {
                if (ub == null) {
                    ub = (UB) q2bVar.f(obj2);
                }
                int iA = rh6.a(aVarC, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = sg1.y;
                sg1.b bVar = new sg1.b(bArr, iA);
                try {
                    rh6.b(bVar, aVarC, entry.getKey(), entry.getValue());
                    if (bVar.B - bVar.C != 0) {
                        aa0.c("Did not write as much data as expected.");
                        return null;
                    }
                    q2bVar.d(ub, i2, new e01.f(bArr));
                    it.remove();
                } catch (IOException e) {
                    d55.a(e);
                    return null;
                }
            }
        }
        return ub;
    }

    public final xi5.b l(int i) {
        return (xi5.b) this.b[((i / 3) * 2) + 1];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final w49 n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        w49 w49Var = (w49) objArr[i2];
        if (w49Var != null) {
            return w49Var;
        }
        w49<T> w49VarA = ye8.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = w49VarA;
        return w49VarA;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[RETURN] */
    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & i3b.c.f(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iL = L(i);
        long j2 = iL & 1048575;
        switch (K(iL)) {
            case 0:
                if (Double.doubleToRawLongBits(i3b.c.d(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(i3b.c.e(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (i3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (i3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (i3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return i3b.c.c(j2, obj);
            case 8:
                Object objH = i3b.c.h(j2, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof e01) {
                    return !e01.u.equals(objH);
                }
                zn3.b();
                return false;
            case 9:
                if (i3b.c.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !e01.u.equals(i3b.c.h(j2, obj));
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (i3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case h4c.e /* 15 */:
                if (i3b.c.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                if (i3b.c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (i3b.c.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                zn3.b();
                return false;
        }
    }

    public final boolean p(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return o(i, t);
        }
        return (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return i3b.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void s(Object obj, int i, Object obj2, ur3 ur3Var, rg1 rg1Var) throws fk5.a {
        long jL = L(i) & 1048575;
        Object objH = i3b.c.h(jL, obj);
        xh6 xh6Var = this.o;
        if (objH == null) {
            objH = xh6Var.f();
            i3b.o(jL, obj, objH);
        } else if (xh6Var.h(objH)) {
            vh6 vh6VarF = xh6Var.f();
            xh6Var.a(vh6VarF, objH);
            i3b.o(jL, obj, vh6VarF);
            objH = vh6VarF;
        }
        vh6 vh6VarG = xh6Var.g(objH);
        rh6.a<?, ?> aVarC = xh6Var.c(obj2);
        rg1Var.w(2);
        pg1 pg1Var = rg1Var.a;
        int iE = pg1Var.e(pg1Var.v());
        aVarC.getClass();
        Object obj3 = aVarC.c;
        Object objI = BuildConfig.FLAVOR;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = rg1Var.a();
                if (iA == Integer.MAX_VALUE || pg1Var.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = rg1Var.i(aVarC.a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!rg1Var.x()) {
                            throw new fk5("Unable to parse map entry.");
                        }
                    } catch (fk5.a unused) {
                        if (!rg1Var.x()) {
                            throw new fk5("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = rg1Var.i(aVarC.b, obj3.getClass(), ur3Var);
                }
            } catch (Throwable th) {
                pg1Var.d(iE);
                throw th;
            }
        }
        vh6VarG.put(objI, objI2);
        pg1Var.d(iE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                vk.b(this.a[i], obj2);
                return;
            }
            w49 w49VarN = n(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object objD = w49VarN.d();
                    w49VarN.a(objD, object);
                    unsafe.putObject(obj, jL, objD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!q(object2)) {
                Object objD2 = w49VarN.d();
                w49VarN.a(objD2, object2);
                unsafe.putObject(obj, jL, objD2);
                object2 = objD2;
            }
            w49VarN.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long jL = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                vk.b(iArr[i], obj2);
                return;
            }
            w49 w49VarN = n(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    Object objD = w49VarN.d();
                    w49VarN.a(objD, object);
                    unsafe.putObject(obj, jL, objD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!q(object2)) {
                Object objD2 = w49VarN.d();
                w49VarN.a(objD2, object2);
                unsafe.putObject(obj, jL, objD2);
                object2 = objD2;
            }
            w49VarN.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(int i, Object obj) {
        w49 w49VarN = n(i);
        long jL = L(i) & 1048575;
        if (!o(i, obj)) {
            return w49VarN.d();
        }
        Object object = q.getObject(obj, jL);
        if (q(object)) {
            return object;
        }
        Object objD = w49VarN.d();
        if (object != null) {
            w49VarN.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(int i, int i2, Object obj) {
        w49 w49VarN = n(i2);
        if (!r(i, i2, obj)) {
            return w49VarN.d();
        }
        Object object = q.getObject(obj, L(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objD = w49VarN.d();
        if (object != null) {
            w49VarN.a(objD, object);
        }
        return objD;
    }
}
