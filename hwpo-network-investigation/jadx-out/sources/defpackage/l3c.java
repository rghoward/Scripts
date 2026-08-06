package defpackage;

import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l3c<T> implements t3c<T> {
    public static final int[] m = new int[0];
    public static final Unsafe n = m4c.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final g3c e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final h4c k;
    public final g1c l;

    public l3c(int[] iArr, Object[] objArr, int i, int i2, g3c g3cVar, int[] iArr2, int i3, int i4, h4c h4cVar, g1c g1cVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = g3cVar instanceof u1c;
        boolean z = false;
        if (g1cVar != null && (g3cVar instanceof r1c)) {
            z = true;
        }
        this.f = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = h4cVar;
        this.l = g1cVar;
        this.e = g3cVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0264  */
    /* JADX WARN: Code duplicated, block: B:125:0x0267  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:129:0x0289  */
    /* JADX WARN: Code duplicated, block: B:169:0x0356  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    public static l3c A(z2c z2cVar, h4c h4cVar, h1c h1cVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldB;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldB2;
        int i28;
        Object obj2;
        Field fieldB3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(z2cVar instanceof s3c)) {
            throw null;
        }
        s3c s3cVar = (s3c) z2cVar;
        String str = s3cVar.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = m;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = n;
        Object[] objArr2 = s3cVar.c;
        Class<?> cls = s3cVar.a.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (s3cVar.c() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldB2 = (Field) obj;
                    } else {
                        fieldB2 = B(cls, (String) obj);
                        objArr4[i27] = fieldB2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldB2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldB3 = (Field) obj2;
                    } else {
                        fieldB3 = B(cls, (String) obj2);
                        objArr4[i28] = fieldB3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldB2 = (Field) obj;
                } else {
                    fieldB2 = B(cls, (String) obj);
                    objArr4[i27] = fieldB2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldB2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldB3 = (Field) obj2;
                } else {
                    fieldB3 = B(cls, (String) obj2);
                    objArr4[i28] = fieldB3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldB4 = B(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldB4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (s3cVar.c() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldB = (Field) obj3;
                            } else {
                                fieldB = B(cls, (String) obj3);
                                objArr4[i98] = fieldB;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new l3c(iArr3, objArr3, i2, i5, s3cVar.a, iArr, i7, i62, h4cVar, h1cVar);
    }

    public static Field B(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            ux1.b(sb, "Field ", str, " for ", name);
            jl.a(av.a(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof u1c) {
            return ((u1c) obj).k();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        z90.a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) m4c.i(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) m4c.i(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i, int i2, p4c p4cVar, Class cls, i0c i0cVar) throws k2c {
        p4c p4cVar2 = p4c.v;
        switch (p4cVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                i0cVar.c = Double.valueOf(Double.longBitsToDouble(j0c.e(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                i0cVar.c = Float.valueOf(Float.intBitsToFloat(j0c.d(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iC = j0c.c(bArr, i, i0cVar);
                i0cVar.c = Long.valueOf(i0cVar.b);
                return iC;
            case 4:
            case 12:
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iA = j0c.a(bArr, i, i0cVar);
                i0cVar.c = Integer.valueOf(i0cVar.a);
                return iA;
            case 5:
            case h4c.e /* 15 */:
                int i5 = i + 8;
                i0cVar.c = Long.valueOf(j0c.e(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                i0cVar.c = Integer.valueOf(j0c.d(bArr, i));
                return i6;
            case 7:
                int iC2 = j0c.c(bArr, i, i0cVar);
                i0cVar.c = Boolean.valueOf(i0cVar.b != 0);
                return iC2;
            case 8:
                return j0c.f(bArr, i, i0cVar);
            case 9:
            default:
                ru3.d("unsupported field type.");
                return 0;
            case 10:
                t3c t3cVarA = q3c.c.a(cls);
                u1c u1cVarA = t3cVarA.a();
                int iH = j0c.h(u1cVarA, t3cVarA, bArr, i, i2, i0cVar);
                t3cVarA.f(u1cVarA);
                i0cVar.c = u1cVarA;
                return iH;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return j0c.g(bArr, i, i0cVar);
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iA2 = j0c.a(bArr, i, i0cVar);
                i0cVar.c = Integer.valueOf(s0c.j(i0cVar.a));
                return iA2;
            case 17:
                int iC3 = j0c.c(bArr, i, i0cVar);
                i0cVar.c = Long.valueOf(s0c.k(i0cVar.b));
                return iC3;
        }
    }

    public static g4c y(Object obj) {
        u1c u1cVar = (u1c) obj;
        g4c g4cVar = u1cVar.zzc;
        if (g4cVar != g4c.f) {
            return g4cVar;
        }
        g4c g4cVarA = g4c.a();
        u1cVar.zzc = g4cVarA;
        return g4cVarA;
    }

    public final void C(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = n;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            t3c t3cVarE = E(i);
            if (!s(i, obj)) {
                if (m(object)) {
                    u1c u1cVarA = t3cVarE.a();
                    t3cVarE.c(u1cVarA, object);
                    unsafe.putObject(obj, j, u1cVarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                u1c u1cVarA2 = t3cVarE.a();
                t3cVarE.c(u1cVarA2, object2);
                unsafe.putObject(obj, j, u1cVarA2);
                object2 = u1cVarA2;
            }
            t3cVarE.c(object2, object);
        }
    }

    public final void D(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            int iK = k(i) & 1048575;
            Unsafe unsafe = n;
            long j = iK;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            t3c t3cVarE = E(i);
            if (!u(i2, i, obj)) {
                if (m(object)) {
                    u1c u1cVarA = t3cVarE.a();
                    t3cVarE.c(u1cVarA, object);
                    unsafe.putObject(obj, j, u1cVarA);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                u1c u1cVarA2 = t3cVarE.a();
                t3cVarE.c(u1cVarA2, object2);
                unsafe.putObject(obj, j, u1cVarA2);
                object2 = u1cVarA2;
            }
            t3cVarE.c(object2, object);
        }
    }

    public final t3c E(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        t3c t3cVar = (t3c) objArr[i3];
        if (t3cVar != null) {
            return t3cVar;
        }
        t3c t3cVarA = q3c.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = t3cVarA;
        return t3cVarA;
    }

    public final Object F(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final x1c G(int i) {
        int i2 = i / 3;
        return (x1c) this.b[i2 + i2 + 1];
    }

    public final Object H(int i, Object obj) {
        t3c t3cVarE = E(i);
        int iK = k(i) & 1048575;
        if (!s(i, obj)) {
            return t3cVarE.a();
        }
        Object object = n.getObject(obj, iK);
        if (m(object)) {
            return object;
        }
        u1c u1cVarA = t3cVarE.a();
        if (object != null) {
            t3cVarE.c(u1cVarA, object);
        }
        return u1cVarA;
    }

    public final void I(int i, Object obj, Object obj2) {
        n.putObject(obj, k(i) & 1048575, obj2);
        t(i, obj);
    }

    public final Object J(int i, int i2, Object obj) {
        t3c t3cVarE = E(i2);
        if (!u(i, i2, obj)) {
            return t3cVarE.a();
        }
        Object object = n.getObject(obj, k(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        u1c u1cVarA = t3cVarE.a();
        if (object != null) {
            t3cVarE.c(u1cVarA, object);
        }
        return u1cVarA;
    }

    public final void K(int i, int i2, Object obj, Object obj2) {
        n.putObject(obj, k(i2) & 1048575, obj2);
        v(i, i2, obj);
    }

    public final Object L(Object obj, int i, Object obj2, h4c h4cVar, Object obj3) {
        x1c x1cVarG;
        int i2 = this.a[i];
        Object objI = m4c.i(k(i) & 1048575, obj);
        if (objI == null || (x1cVarG = G(i)) == null) {
            return obj2;
        }
        u2c u2cVar = ((v2c) F(i)).a;
        Iterator it = ((w2c) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!x1cVarG.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    h4cVar.getClass();
                    obj2 = h4c.c(obj3);
                }
                int iB = v2c.b(u2cVar, entry.getKey(), entry.getValue());
                o0c o0cVar = p0c.u;
                byte[] bArr = new byte[iB];
                boolean z = b1c.b;
                u0c u0cVar = new u0c(bArr, iB);
                try {
                    v2c.a(u0cVar, u2cVar, entry.getKey(), entry.getValue());
                    u0cVar.d();
                    o0c o0cVar2 = new o0c(bArr);
                    h4cVar.getClass();
                    ((g4c) obj2).d((i2 << 3) | 2, o0cVar2);
                    it.remove();
                } catch (IOException e) {
                    d55.a(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void M(int i, Object obj, t0c t0cVar) throws j2c {
        s0c s0cVar = t0cVar.a;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            t0cVar.q(2);
            m4c.j(j, obj, s0cVar.x());
        } else if (!this.g) {
            m4c.j(j, obj, t0cVar.y());
        } else {
            t0cVar.q(2);
            m4c.j(j, obj, s0cVar.w());
        }
    }

    @Override // defpackage.t3c
    public final u1c a() {
        return ((u1c) this.e).m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // defpackage.t3c
    public final void b(Object obj, c1c c1cVar) {
        Map.Entry entry;
        boolean z;
        int i;
        boolean z2;
        l3c<T> l3cVar = this;
        b1c b1cVar = c1cVar.a;
        if (l3cVar.f) {
            k1c k1cVar = ((r1c) obj).zzb;
            if (k1cVar.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) k1cVar.b().next();
            }
        } else {
            entry = null;
        }
        Unsafe unsafe = n;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = l3cVar.a;
            if (i4 >= iArr.length) {
                if (entry == null) {
                    ((u1c) obj).zzc.b(c1cVar);
                    return;
                } else {
                    throw null;
                }
            }
            int iK = l3cVar.k(i4);
            int iL = l(iK);
            int i6 = iArr[i4];
            if (iL <= 17) {
                int i7 = iArr[i4 + 2];
                z = true;
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                z = true;
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iK & i2;
            switch (iL) {
                case 0:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.k(i6, Double.doubleToRawLongBits(m4c.c.s(j, obj)));
                    }
                    break;
                case 1:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.i(i6, Float.floatToRawIntBits(m4c.c.p(j, obj)));
                    }
                    break;
                case 2:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.j(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.j(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.g(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.k(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.i(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.l(i6, m4c.c.l(j, obj));
                    }
                    break;
                case 8:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            b1cVar.m(i6, (String) object);
                        } else {
                            b1cVar.n(i6, (p0c) object);
                        }
                    }
                    break;
                case 9:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        c1cVar.a(i6, unsafe.getObject(obj, j), l3cVar.E(i4));
                    }
                    break;
                case 10:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.n(i6, (p0c) unsafe.getObject(obj, j));
                    }
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.h(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.g(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.i(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        b1cVar.k(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case h4c.e /* 15 */:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        b1cVar.h(i6, (i9 >> 31) ^ (i9 + i9));
                    }
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        b1cVar.j(i6, (j2 + j2) ^ (j2 >> 63));
                    }
                    break;
                case 17:
                    if (l3cVar.r(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        b1cVar.f(i6, 3);
                        l3cVar.E(i4).b((f0c) object2, c1cVar);
                        b1cVar.f(i6, 4);
                    }
                    break;
                case 18:
                    u3c.d(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 19:
                    u3c.e(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    u3c.f(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 21:
                    u3c.g(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 22:
                    u3c.k(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 23:
                    u3c.i(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 24:
                    u3c.n(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 25:
                    u3c.q(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    h4c h4cVar = u3c.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof p2c) {
                            p2c p2cVar = (p2c) list;
                            for (int i11 = 0; i11 < list.size(); i11++) {
                                Object objC = p2cVar.c();
                                if (objC instanceof String) {
                                    b1cVar.m(i10, (String) objC);
                                } else {
                                    b1cVar.n(i10, (p0c) objC);
                                }
                            }
                        } else {
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                b1cVar.m(i10, (String) list.get(i12));
                            }
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    t3c t3cVarE = l3cVar.E(i4);
                    h4c h4cVar2 = u3c.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            c1cVar.a(i13, list2.get(i14), t3cVarE);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    h4c h4cVar3 = u3c.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            b1cVar.n(i15, (p0c) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z2 = false;
                    u3c.l(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 30:
                    z2 = false;
                    u3c.p(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 31:
                    z2 = false;
                    u3c.o(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 32:
                    z2 = false;
                    u3c.j(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 33:
                    z2 = false;
                    u3c.m(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 34:
                    z2 = false;
                    u3c.h(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, false);
                    break;
                case 35:
                    u3c.d(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 36:
                    u3c.e(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 37:
                    u3c.f(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 38:
                    u3c.g(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 39:
                    u3c.k(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 40:
                    u3c.i(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 41:
                    u3c.n(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 42:
                    u3c.q(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 43:
                    u3c.l(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    u3c.p(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 45:
                    u3c.o(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 46:
                    u3c.j(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 47:
                    u3c.m(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 48:
                    u3c.h(iArr[i4], (List) unsafe.getObject(obj, j), c1cVar, z);
                    break;
                case 49:
                    int i17 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    t3c t3cVarE2 = l3cVar.E(i4);
                    h4c h4cVar4 = u3c.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            f0c f0cVar = (f0c) list4.get(i18);
                            b1cVar.f(i17, 3);
                            t3cVarE2.b(f0cVar, c1cVar);
                            b1cVar.f(i17, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        u2c u2cVar = ((v2c) l3cVar.F(i4)).a;
                        for (Map.Entry entry2 : ((w2c) object3).entrySet()) {
                            b1cVar.f(i6, 2);
                            b1cVar.v(v2c.b(u2cVar, entry2.getKey(), entry2.getValue()));
                            v2c.a(b1cVar, u2cVar, entry2.getKey(), entry2.getValue());
                        }
                    }
                    break;
                case 51:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.k(i6, Double.doubleToRawLongBits(((Double) m4c.i(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.i(i6, Float.floatToRawIntBits(((Float) m4c.i(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.j(i6, p(j, obj));
                    }
                    break;
                case 54:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.j(i6, p(j, obj));
                    }
                    break;
                case 55:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.g(i6, o(j, obj));
                    }
                    break;
                case 56:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.k(i6, p(j, obj));
                    }
                    break;
                case 57:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.i(i6, o(j, obj));
                    }
                    break;
                case 58:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.l(i6, ((Boolean) m4c.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (l3cVar.u(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            b1cVar.m(i6, (String) object4);
                        } else {
                            b1cVar.n(i6, (p0c) object4);
                        }
                    }
                    break;
                case 60:
                    if (l3cVar.u(i6, i4, obj)) {
                        c1cVar.a(i6, unsafe.getObject(obj, j), l3cVar.E(i4));
                    }
                    break;
                case 61:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.n(i6, (p0c) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.h(i6, o(j, obj));
                    }
                    break;
                case 63:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.g(i6, o(j, obj));
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.i(i6, o(j, obj));
                    }
                    break;
                case 65:
                    if (l3cVar.u(i6, i4, obj)) {
                        b1cVar.k(i6, p(j, obj));
                    }
                    break;
                case 66:
                    if (l3cVar.u(i6, i4, obj)) {
                        int iO = o(j, obj);
                        b1cVar.h(i6, (iO >> 31) ^ (iO + iO));
                    }
                    break;
                case 67:
                    if (l3cVar.u(i6, i4, obj)) {
                        long jP = p(j, obj);
                        b1cVar.j(i6, (jP >> 63) ^ (jP + jP));
                    }
                    break;
                case 68:
                    if (l3cVar.u(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        b1cVar.f(i6, 3);
                        l3cVar.E(i4).b((f0c) object5, c1cVar);
                        b1cVar.f(i6, 4);
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            l3cVar = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.t3c
    public final void c(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                u3c.b(obj4, obj2);
                if (!this.f || ((r1c) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            int i3 = iArr[i];
            long j = i2;
            switch (iL) {
                case 0:
                    if (!s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        l4c l4cVar = m4c.c;
                        obj3 = obj;
                        l4cVar.t(obj3, j, l4cVar.s(j, obj2));
                        t(i, obj3);
                    }
                    break;
                case 1:
                    if (s(i, obj2)) {
                        l4c l4cVar2 = m4c.c;
                        l4cVar2.r(obj, j, l4cVar2.p(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        m4c.h(obj, j, m4c.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        m4c.h(obj, j, m4c.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        m4c.h(obj, j, m4c.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        l4c l4cVar3 = m4c.c;
                        l4cVar3.n(obj, j, l4cVar3.l(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        m4c.j(j, obj, m4c.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    C(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        m4c.j(j, obj, m4c.i(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        m4c.h(obj, j, m4c.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case h4c.e /* 15 */:
                    if (s(i, obj2)) {
                        m4c.f(obj, j, m4c.e(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (s(i, obj2)) {
                        m4c.h(obj, j, m4c.g(j, obj2));
                        t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    C(i, obj, obj2);
                    obj3 = obj;
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
                    i2c i2cVarP0 = (i2c) m4c.i(j, obj);
                    i2c i2cVar = (i2c) m4c.i(j, obj2);
                    int size = i2cVarP0.size();
                    int size2 = i2cVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!i2cVarP0.a()) {
                            i2cVarP0 = i2cVarP0.p0(size2 + size);
                        }
                        i2cVarP0.addAll(i2cVar);
                    }
                    if (size > 0) {
                        i2cVar = i2cVarP0;
                    }
                    m4c.j(j, obj, i2cVar);
                    obj3 = obj;
                    break;
                case 50:
                    h4c h4cVar = u3c.a;
                    m4c.j(j, obj, x2c.a(m4c.i(j, obj), m4c.i(j, obj2)));
                    obj3 = obj;
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
                    if (u(i3, i, obj2)) {
                        m4c.j(j, obj, m4c.i(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    D(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (u(i3, i, obj2)) {
                        m4c.j(j, obj, m4c.i(j, obj2));
                        v(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    D(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.t3c
    public final boolean d(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.i) {
            int i6 = this.h[i3];
            int iK = this.k(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = n.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            l3c<T> l3cVar = this;
            Object obj2 = obj;
            if ((268435456 & iK) == 0 || l3cVar.r(obj2, i6, i, i2, i9)) {
                int iL = l(iK);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!l3cVar.u(iArr[i6], i6, obj2) || l3cVar.E(i6).d(m4c.i(iK & 1048575, obj2))) {
                                i3++;
                                this = l3cVar;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                w2c w2cVar = (w2c) m4c.i(iK & 1048575, obj2);
                                if (!w2cVar.isEmpty() && ((v2c) l3cVar.F(i6)).a.b.t == q4c.B) {
                                    t3c t3cVarA = null;
                                    for (Object obj3 : w2cVar.values()) {
                                        if (t3cVarA == null) {
                                            t3cVarA = q3c.c.a(obj3.getClass());
                                        }
                                        if (!t3cVarA.d(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = l3cVar;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) m4c.i(iK & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t3c t3cVarE = l3cVar.E(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (t3cVarE.d(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = l3cVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!l3cVar.r(obj2, i6, i, i2, i9) || l3cVar.E(i6).d(m4c.i(iK & 1048575, obj2))) {
                    i3++;
                    this = l3cVar;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        Object obj4 = obj;
        if (this.f) {
            ((r1c) obj4).zzb.c();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:234:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:238:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    @Override // defpackage.t3c
    public final int e(u1c u1cVar) {
        int i;
        int iA;
        int iB;
        int iA2;
        int iB2;
        int iA3;
        int i2;
        int iA4;
        int i3;
        int iH;
        int iA5;
        int size;
        int iS;
        int iA6;
        int iA7;
        int iA8;
        int size2;
        int iA9;
        int iH2;
        int iA10;
        int iB3;
        int iA11;
        int iB4;
        int iO;
        int iA12;
        l3c<T> l3cVar = this;
        u1c u1cVar2 = u1cVar;
        Unsafe unsafe = n;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iA13 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = l3cVar.a;
            if (i5 >= iArr.length) {
                int iC = u1cVar2.zzc.c() + iA13;
                if (l3cVar.f) {
                    v3c v3cVar = ((r1c) u1cVar2).zzb.a;
                    if (v3cVar.u > 0) {
                        ((j1c) v3cVar.b(0).t).b();
                        throw null;
                    }
                    Iterator<T> it = v3cVar.c().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        j1c j1cVar = (j1c) entry.getKey();
                        entry.getValue();
                        j1cVar.b();
                        throw null;
                    }
                }
                return iC;
            }
            int iK = l3cVar.k(i5);
            int iL = l(iK);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & i4;
            if (iL <= 17) {
                if (i10 != i7) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(u1cVar2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iK & i4;
            if (iL >= l1c.u.t) {
                l1c.v.getClass();
            }
            long j = i11;
            switch (iL) {
                case 0:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    break;
                case 1:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case 2:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        long j2 = unsafe.getLong(u1cVar2, j);
                        iA = b1c.a(i8 << 3);
                        iB = b1c.b(j2);
                        iA13 += iB + iA;
                    }
                    l3cVar = this;
                    break;
                case 3:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        long j3 = unsafe.getLong(u1cVar2, j);
                        iA = b1c.a(i8 << 3);
                        iB = b1c.b(j3);
                        iA13 += iB + iA;
                    }
                    l3cVar = this;
                    break;
                case 4:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        long j4 = unsafe.getInt(u1cVar2, j);
                        iA = b1c.a(i8 << 3);
                        iB = b1c.b(j4);
                        iA13 += iB + iA;
                    }
                    l3cVar = this;
                    break;
                case 5:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case 6:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case 7:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 1, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case 8:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(u1cVar2, j);
                        if (object instanceof p0c) {
                            iA2 = b1c.a(i12);
                            iB2 = ((p0c) object).e();
                        } else {
                            iA2 = b1c.a(i12);
                            iB2 = o4c.b((String) object);
                        }
                        iA13 = yj.a(iB2, iB2, iA2, iA13);
                    }
                    l3cVar = this;
                    break;
                case 9:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA3 = u3c.A(i8, unsafe.getObject(u1cVar2, j), l3cVar.E(i5));
                        iA13 += iA3;
                    }
                    break;
                case 10:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        p0c p0cVar = (p0c) unsafe.getObject(u1cVar2, j);
                        iA2 = b1c.a(i8 << 3);
                        iB2 = p0cVar.e();
                        iA13 = yj.a(iB2, iB2, iA2, iA13);
                    }
                    l3cVar = this;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        i2 = unsafe.getInt(u1cVar2, j);
                        iA4 = b1c.a(i8 << 3);
                        iA13 = k3c.a(i2, iA4, iA13);
                    }
                    l3cVar = this;
                    break;
                case 12:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        long j5 = unsafe.getInt(u1cVar2, j);
                        iA = b1c.a(i8 << 3);
                        iB = b1c.b(j5);
                        iA13 += iB + iA;
                    }
                    l3cVar = this;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case 14:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    l3cVar = this;
                    u1cVar2 = u1cVar;
                    break;
                case h4c.e /* 15 */:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        int i13 = unsafe.getInt(u1cVar2, j);
                        iA4 = b1c.a(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iA13 = k3c.a(i2, iA4, iA13);
                    }
                    l3cVar = this;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        long j6 = unsafe.getLong(u1cVar2, j);
                        iA = b1c.a(i8 << 3);
                        iB = b1c.b((j6 >> 63) ^ (j6 + j6));
                        iA13 += iB + iA;
                    }
                    l3cVar = this;
                    break;
                case 17:
                    if (l3cVar.r(u1cVar2, i5, i7, i6, i)) {
                        g3c g3cVar = (g3c) unsafe.getObject(u1cVar2, j);
                        t3c t3cVarE = l3cVar.E(i5);
                        h4c h4cVar = u3c.a;
                        int iA14 = b1c.a(i8 << 3);
                        i3 = iA14 + iA14;
                        iH = ((f0c) g3cVar).h(t3cVarE);
                        iA3 = iH + i3;
                        iA13 += iA3;
                    }
                    break;
                case 18:
                    iA3 = u3c.z(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case 19:
                    iA3 = u3c.y(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                    List list = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar2 = u3c.a;
                    if (list.size() == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (b1c.a(i8 << 3) * list.size()) + u3c.r(list);
                    }
                    iA13 += iA5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar3 = u3c.a;
                    size = list2.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.s(list2);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar4 = u3c.a;
                    size = list3.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.v(list3);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 23:
                    iA3 = u3c.z(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case 24:
                    iA3 = u3c.y(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar5 = u3c.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iA5 = 0;
                    } else {
                        iA5 = (b1c.a(i8 << 3) + 1) * size3;
                    }
                    iA13 += iA5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar6 = u3c.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = b1c.a(i8 << 3) * size4;
                        if (list5 instanceof p2c) {
                            p2c p2cVar = (p2c) list5;
                            for (int i14 = 0; i14 < size4; i14++) {
                                Object objC = p2cVar.c();
                                int iE = objC instanceof p0c ? ((p0c) objC).e() : o4c.b((String) objC);
                                iA7 = k3c.a(iE, iE, iA7);
                            }
                        } else {
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object obj = list5.get(i15);
                                int iE2 = obj instanceof p0c ? ((p0c) obj).e() : o4c.b((String) obj);
                                iA7 = k3c.a(iE2, iE2, iA7);
                            }
                        }
                    }
                    iA13 += iA7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(u1cVar2, j);
                    t3c t3cVarE2 = l3cVar.E(i5);
                    h4c h4cVar7 = u3c.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = b1c.a(i8 << 3) * size5;
                        for (int i16 = 0; i16 < size5; i16++) {
                            Object obj2 = list6.get(i16);
                            int iA15 = obj2 instanceof o2c ? ((o2c) obj2).a() : ((f0c) obj2).h(t3cVarE2);
                            iA8 = k3c.a(iA15, iA15, iA8);
                        }
                    }
                    iA13 += iA8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar8 = u3c.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iA7 = 0;
                    } else {
                        iA7 = b1c.a(i8 << 3) * size6;
                        for (int i17 = 0; i17 < list7.size(); i17++) {
                            int iE3 = ((p0c) list7.get(i17)).e();
                            iA7 = k3c.a(iE3, iE3, iA7);
                        }
                    }
                    iA13 += iA7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar9 = u3c.a;
                    size = list8.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.w(list8);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar10 = u3c.a;
                    size = list9.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.u(list9);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 31:
                    iA3 = u3c.y(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case 32:
                    iA3 = u3c.z(i8, (List) unsafe.getObject(u1cVar2, j));
                    iA13 += iA3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar11 = u3c.a;
                    size = list10.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.x(list10);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar12 = u3c.a;
                    size = list11.size();
                    if (size == 0) {
                        iA7 = 0;
                    } else {
                        iS = u3c.t(list11);
                        iA6 = b1c.a(i8 << 3);
                        iA7 = (iA6 * size) + iS;
                    }
                    iA13 += iA7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar13 = u3c.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar14 = u3c.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 37:
                    size2 = u3c.r((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 38:
                    size2 = u3c.s((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 39:
                    size2 = u3c.v((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar15 = u3c.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar16 = u3c.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar17 = u3c.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 43:
                    size2 = u3c.w((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    size2 = u3c.u((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar18 = u3c.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(u1cVar2, j);
                    h4c h4cVar19 = u3c.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 47:
                    size2 = u3c.x((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 48:
                    size2 = u3c.t((List) unsafe.getObject(u1cVar2, j));
                    if (size2 > 0) {
                        iA9 = b1c.a(i8 << 3);
                        iA13 = yj.a(size2, iA9, size2, iA13);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(u1cVar2, j);
                    t3c t3cVarE3 = l3cVar.E(i5);
                    h4c h4cVar20 = u3c.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iH2 = 0;
                    } else {
                        iH2 = 0;
                        for (int i18 = 0; i18 < size7; i18++) {
                            g3c g3cVar2 = (g3c) list19.get(i18);
                            int iA16 = b1c.a(i8 << 3);
                            iH2 += ((f0c) g3cVar2).h(t3cVarE3) + iA16 + iA16;
                        }
                    }
                    iA13 += iH2;
                    break;
                case 50:
                    w2c w2cVar = (w2c) unsafe.getObject(u1cVar2, j);
                    v2c v2cVar = (v2c) l3cVar.F(i5);
                    if (w2cVar.isEmpty()) {
                        iA7 = 0;
                    } else {
                        iA7 = 0;
                        for (Map.Entry entry2 : w2cVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            u2c u2cVar = v2cVar.a;
                            int iA17 = b1c.a(i8 << 3);
                            int iB5 = v2c.b(u2cVar, key, value);
                            iA7 = yj.a(iB5, iB5, iA17, iA7);
                        }
                    }
                    iA13 += iA7;
                    break;
                case 51:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    break;
                case 52:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    break;
                case 53:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        long jP = p(j, u1cVar2);
                        iA10 = b1c.a(i8 << 3);
                        iB3 = b1c.b(jP);
                        iA13 += iB3 + iA10;
                    }
                    break;
                case 54:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        long jP2 = p(j, u1cVar2);
                        iA10 = b1c.a(i8 << 3);
                        iB3 = b1c.b(jP2);
                        iA13 += iB3 + iA10;
                    }
                    break;
                case 55:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        long jO = o(j, u1cVar2);
                        iA10 = b1c.a(i8 << 3);
                        iB3 = b1c.b(jO);
                        iA13 += iB3 + iA10;
                    }
                    break;
                case 56:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    break;
                case 57:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    break;
                case 58:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 1, iA13);
                    }
                    break;
                case 59:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        int i19 = i8 << 3;
                        Object object2 = unsafe.getObject(u1cVar2, j);
                        if (object2 instanceof p0c) {
                            iA11 = b1c.a(i19);
                            iB4 = ((p0c) object2).e();
                        } else {
                            iA11 = b1c.a(i19);
                            iB4 = o4c.b((String) object2);
                        }
                        iA13 = yj.a(iB4, iB4, iA11, iA13);
                    }
                    break;
                case 60:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA3 = u3c.A(i8, unsafe.getObject(u1cVar2, j), l3cVar.E(i5));
                        iA13 += iA3;
                    }
                    break;
                case 61:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        p0c p0cVar2 = (p0c) unsafe.getObject(u1cVar2, j);
                        iA11 = b1c.a(i8 << 3);
                        iB4 = p0cVar2.e();
                        iA13 = yj.a(iB4, iB4, iA11, iA13);
                    }
                    break;
                case 62:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iO = o(j, u1cVar2);
                        iA12 = b1c.a(i8 << 3);
                        iA13 = k3c.a(iO, iA12, iA13);
                    }
                    break;
                case 63:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        long jO2 = o(j, u1cVar2);
                        iA10 = b1c.a(i8 << 3);
                        iB3 = b1c.b(jO2);
                        iA13 += iB3 + iA10;
                    }
                    break;
                case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 4, iA13);
                    }
                    break;
                case 65:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        iA13 = k3c.a(i8 << 3, 8, iA13);
                    }
                    break;
                case 66:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        int iO2 = o(j, u1cVar2);
                        iA12 = b1c.a(i8 << 3);
                        iO = (iO2 >> 31) ^ (iO2 + iO2);
                        iA13 = k3c.a(iO, iA12, iA13);
                    }
                    break;
                case 67:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        long jP3 = p(j, u1cVar2);
                        iA10 = b1c.a(i8 << 3);
                        iB3 = b1c.b((jP3 >> 63) ^ (jP3 + jP3));
                        iA13 += iB3 + iA10;
                    }
                    break;
                case 68:
                    if (l3cVar.u(i8, i5, u1cVar2)) {
                        g3c g3cVar3 = (g3c) unsafe.getObject(u1cVar2, j);
                        t3c t3cVarE4 = l3cVar.E(i5);
                        h4c h4cVar21 = u3c.a;
                        int iA18 = b1c.a(i8 << 3);
                        i3 = iA18 + iA18;
                        iH = ((f0c) g3cVar3).h(t3cVarE4);
                        iA3 = iH + i3;
                        iA13 += iA3;
                    }
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[SYNTHETIC] */
    @Override // defpackage.t3c
    public final void f(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof u1c) {
            u1c u1cVar = (u1c) obj;
            u1cVar.q();
            u1cVar.zza = 0;
            u1cVar.l();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.k.getClass();
                g4c g4cVar = ((u1c) obj).zzc;
                if (g4cVar.e) {
                    g4cVar.e = false;
                }
                if (this.f) {
                    ((h1c) this.l).getClass();
                    ((r1c) obj).zzb.a();
                    return;
                }
                return;
            }
            int iK = k(i);
            int i2 = 1048575 & iK;
            int iL = l(iK);
            long j = i2;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
                        case 17:
                            if (s(i, obj)) {
                                E(i).f(n.getObject(obj, j));
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
                            ((i2c) m4c.i(j, obj)).b();
                            break;
                        case 50:
                            Unsafe unsafe = n;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((w2c) object).t = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (u(iArr[i], i, obj)) {
                    E(i).f(n.getObject(obj, j));
                }
            } else if (s(i, obj)) {
                E(i).f(n.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.t3c
    public final void g(Object obj, byte[] bArr, int i, int i2, i0c i0cVar) {
        z(obj, bArr, i, i2, 0, i0cVar);
    }

    @Override // defpackage.t3c
    public final int h(u1c u1cVar) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int iHashCode = 0;
        for (int i4 = 0; i4 < this.a.length; i4 += 3) {
            int iK = k(i4);
            int iL = l(iK);
            if (iL <= 50 || iL >= 69) {
                long j = iK & 1048575;
                int iHashCode2 = 37;
                switch (iL) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m4c.c.s(j, u1cVar));
                        byte[] bArr = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(m4c.c.p(j, u1cVar));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = m4c.g(j, u1cVar);
                        byte[] bArr2 = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = m4c.g(j, u1cVar);
                        byte[] bArr3 = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = m4c.g(j, u1cVar);
                        byte[] bArr4 = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zL = m4c.c.l(j, u1cVar);
                        byte[] bArr5 = g2c.a;
                        iFloatToIntBits = zL ? 1231 : 1237;
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) m4c.i(j, u1cVar)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i3 = iHashCode * 53;
                        Object objI = m4c.i(j, u1cVar);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i3 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.i(j, u1cVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = m4c.g(j, u1cVar);
                        byte[] bArr6 = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case h4c.e /* 15 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.e(j, u1cVar);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        i = iHashCode * 53;
                        jDoubleToLongBits = m4c.g(j, u1cVar);
                        byte[] bArr7 = g2c.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i3 = iHashCode * 53;
                        Object objI2 = m4c.i(j, u1cVar);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i3 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.i(j, u1cVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = m4c.i(j, u1cVar).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i5 = this.j;
        while (true) {
            int[] iArr = this.h;
            if (i5 >= iArr.length) {
                int iHashCode3 = u1cVar.zzc.hashCode() + (iHashCode * 53);
                if (this.f) {
                    return ((r1c) u1cVar).zzb.a.hashCode() + (iHashCode3 * 53);
                }
                return iHashCode3;
            }
            int i6 = iArr[i5];
            if (!u(0, i6, u1cVar)) {
                iHashCode = m4c.i(k(i6) & 1048575, u1cVar).hashCode() + (iHashCode * 53);
            }
            i5++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.t3c
    public final void i(java.lang.Object r22, defpackage.t0c r23, defpackage.f1c r24) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3c.i(java.lang.Object, t0c, f1c):void");
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.t3c
    public final boolean j(u1c u1cVar, u1c u1cVar2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iK = k(i);
                int iL = l(iK);
                if (iL <= 50 || iL >= 69) {
                    long j = iK & 1048575;
                    switch (iL) {
                        case 0:
                            if (q(u1cVar, u1cVar2, i)) {
                                l4c l4cVar = m4c.c;
                                if (Double.doubleToLongBits(l4cVar.s(j, u1cVar)) != Double.doubleToLongBits(l4cVar.s(j, u1cVar2))) {
                                }
                            }
                            break;
                        case 1:
                            if (q(u1cVar, u1cVar2, i)) {
                                l4c l4cVar2 = m4c.c;
                                if (Float.floatToIntBits(l4cVar2.p(j, u1cVar)) != Float.floatToIntBits(l4cVar2.p(j, u1cVar2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!q(u1cVar, u1cVar2, i) || m4c.g(j, u1cVar) != m4c.g(j, u1cVar2)) {
                            }
                            break;
                        case 3:
                            if (!q(u1cVar, u1cVar2, i) || m4c.g(j, u1cVar) != m4c.g(j, u1cVar2)) {
                            }
                            break;
                        case 4:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case 5:
                            if (!q(u1cVar, u1cVar2, i) || m4c.g(j, u1cVar) != m4c.g(j, u1cVar2)) {
                            }
                            break;
                        case 6:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case 7:
                            if (q(u1cVar, u1cVar2, i)) {
                                l4c l4cVar3 = m4c.c;
                                if (l4cVar3.l(j, u1cVar) != l4cVar3.l(j, u1cVar2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!q(u1cVar, u1cVar2, i) || !u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2))) {
                            }
                            break;
                        case 9:
                            if (!q(u1cVar, u1cVar2, i) || !u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2))) {
                            }
                            break;
                        case 10:
                            if (!q(u1cVar, u1cVar2, i) || !u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2))) {
                            }
                            break;
                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case 12:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case 14:
                            if (!q(u1cVar, u1cVar2, i) || m4c.g(j, u1cVar) != m4c.g(j, u1cVar2)) {
                            }
                            break;
                        case h4c.e /* 15 */:
                            if (!q(u1cVar, u1cVar2, i) || m4c.e(j, u1cVar) != m4c.e(j, u1cVar2)) {
                            }
                            break;
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                            if (!q(u1cVar, u1cVar2, i) || m4c.g(j, u1cVar) != m4c.g(j, u1cVar2)) {
                            }
                            break;
                        case 17:
                            if (!q(u1cVar, u1cVar2, i) || !u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2))) {
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
                            zA = u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2));
                            if (zA) {
                            }
                            break;
                        case 50:
                            zA = u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2));
                            if (zA) {
                            }
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
                            if (m4c.e(j2, u1cVar) == m4c.e(j2, u1cVar2) && u3c.a(m4c.i(j, u1cVar), m4c.i(j, u1cVar2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.j;
                while (true) {
                    int[] iArr2 = this.h;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (m4c.e(j3, u1cVar) != m4c.e(j3, u1cVar2)) {
                            return false;
                        }
                        if (!u(0, i3, u1cVar)) {
                            long jK = k(i3) & 1048575;
                            if (!u3c.a(m4c.i(jK, u1cVar), m4c.i(jK, u1cVar2))) {
                            }
                        }
                        i2++;
                    } else if (u1cVar.zzc.equals(u1cVar2.zzc)) {
                        if (this.f) {
                            return ((r1c) u1cVar).zzb.equals(((r1c) u1cVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final boolean q(u1c u1cVar, u1c u1cVar2, int i) {
        return s(i, u1cVar) == s(i, u1cVar2);
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & m4c.e(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iK = k(i);
        long j2 = iK & 1048575;
        switch (l(iK)) {
            case 0:
                if (Double.doubleToRawLongBits(m4c.c.s(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(m4c.c.p(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (m4c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (m4c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (m4c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return m4c.c.l(j2, obj);
            case 8:
                Object objI = m4c.i(j2, obj);
                if (objI instanceof String) {
                    if (((String) objI).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objI instanceof p0c)) {
                    zn3.b();
                    return false;
                }
                if (p0c.u.equals(objI)) {
                    return false;
                }
                return true;
            case 9:
                if (m4c.i(j2, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (p0c.u.equals(m4c.i(j2, obj))) {
                    return false;
                }
                return true;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (m4c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case h4c.e /* 15 */:
                if (m4c.e(j2, obj) != 0) {
                    return true;
                }
                return false;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                if (m4c.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (m4c.i(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                zn3.b();
                return false;
        }
    }

    public final void t(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        m4c.f(obj, j, (1 << (i2 >>> 20)) | m4c.e(j, obj));
    }

    public final boolean u(int i, int i2, Object obj) {
        return m4c.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, int i2, Object obj) {
        m4c.f(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int z(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.i0c r42) {
        /*
            Method dump skipped, instruction units count: 4182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3c.z(java.lang.Object, byte[], int, int, int, i0c):int");
    }
}
