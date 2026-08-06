package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ef5 implements KSerializer<xe5> {
    public static final ef5 a = new ef5();
    public static final m98 b = new m98("kotlin.time.Instant", j98.i.a);

    /* JADX WARN: Code duplicated, block: B:195:0x045b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0471  */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x0471, please report this as an issue */
    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        df5 df5VarC;
        int i4;
        int i5;
        char cCharAt;
        char cCharAt2;
        xe5 xe5Var = xe5.v;
        String strS = decoder.S();
        strS.getClass();
        if (strS.length() == 0) {
            df5VarC = new df5.a("An empty string is not a valid Instant", strS);
        } else {
            char cCharAt3 = strS.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i6 = i;
            while (i6 < strS.length() && '0' <= (cCharAt2 = strS.charAt(i6)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strS.charAt(i6) - '0');
                i6++;
            }
            int i7 = i6 - i;
            if (i7 > 10) {
                df5VarC = cf5.c(strS, "Expected at most 10 digits for the year number, got " + i7 + " digits");
            } else if (i7 == 10 && xj5.b(strS.charAt(i), 50) >= 0) {
                df5VarC = cf5.c(strS, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
            } else if (i7 < 4) {
                df5VarC = cf5.c(strS, "The year number must be padded to 4 digits, got " + i7 + " digits");
            } else if (cCharAt3 == '+' && i7 == 4) {
                df5VarC = cf5.c(strS, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i7 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i8 = i6 + 16;
                if (strS.length() < i8) {
                    df5VarC = cf5.c(strS, "The input string is too short");
                } else {
                    df5.a aVarB = cf5.b(strS, "'-'", i6, new af5(0));
                    if (aVarB == null && (aVarB = cf5.b(strS, "'-'", i6 + 3, new cv0(1))) == null && (aVarB = cf5.b(strS, "'T' or 't'", i6 + 6, new ev0(1))) == null && (aVarB = cf5.b(strS, "':'", i6 + 9, new m32(2))) == null && (aVarB = cf5.b(strS, "':'", i6 + 12, new bf5(0))) == null) {
                        for (int i9 = 0; i9 < 10; i9++) {
                            df5VarC = cf5.b(strS, "an ASCII digit", cf5.b[i9] + i6, new o32(2));
                            if (df5VarC == null) {
                            }
                        }
                        int iD = cf5.d(i6 + 1, strS);
                        int iD2 = cf5.d(i6 + 4, strS);
                        int iD3 = cf5.d(i6 + 7, strS);
                        int iD4 = cf5.d(i6 + 10, strS);
                        int iD5 = cf5.d(i6 + 13, strS);
                        int i10 = i6 + 15;
                        if (strS.charAt(i10) == '.') {
                            i10 = i8;
                            int iCharAt2 = 0;
                            while (i10 < strS.length() && '0' <= (cCharAt = strS.charAt(i10)) && cCharAt < ':') {
                                iCharAt2 = (iCharAt2 * 10) + (strS.charAt(i10) - '0');
                                i10++;
                            }
                            int i11 = i10 - i8;
                            if (1 > i11 || i11 >= 10) {
                                df5VarC = cf5.c(strS, "1..9 digits are supported for the fraction of the second, got " + i11 + " digits");
                            } else {
                                i2 = iCharAt2 * cf5.a[9 - i11];
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i10 >= strS.length()) {
                            df5VarC = cf5.c(strS, "The UTC offset at the end of the string is missing");
                        } else {
                            char cCharAt4 = strS.charAt(i10);
                            if (cCharAt4 == '+' || cCharAt4 == '-') {
                                int length = strS.length() - i10;
                                if (length > 9) {
                                    df5VarC = cf5.c(strS, "The UTC offset string \"" + cf5.e(16, strS.subSequence(i10, strS.length()).toString()) + "\" is too long");
                                } else if (length % 3 != 0) {
                                    df5VarC = cf5.c(strS, "Invalid UTC offset string \"" + strS.subSequence(i10, strS.length()).toString() + '\"');
                                } else {
                                    for (int i12 = 0; i12 < 2 && (i5 = cf5.c[i12] + i10) < strS.length(); i12++) {
                                        if (strS.charAt(i5) != ':') {
                                            StringBuilder sbB = t43.b(i5, "Expected ':' at index ", ", got '");
                                            sbB.append(strS.charAt(i5));
                                            sbB.append('\'');
                                            df5VarC = cf5.c(strS, sbB.toString());
                                        }
                                    }
                                    int i13 = 0;
                                    while (i13 < 6 && (i4 = cf5.d[i13] + i10) < strS.length()) {
                                        char cCharAt5 = strS.charAt(i4);
                                        int i14 = i13;
                                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                            StringBuilder sbB2 = t43.b(i4, "Expected an ASCII digit at index ", ", got '");
                                            sbB2.append(strS.charAt(i4));
                                            sbB2.append('\'');
                                            df5VarC = cf5.c(strS, sbB2.toString());
                                        } else {
                                            i13 = i14 + 1;
                                        }
                                    }
                                    int iD6 = cf5.d(i10 + 1, strS);
                                    int iD7 = length > 3 ? cf5.d(i10 + 4, strS) : 0;
                                    int iD8 = length > 6 ? cf5.d(i10 + 7, strS) : 0;
                                    if (iD7 > 59) {
                                        df5VarC = cf5.c(strS, "Expected offset-minute-of-hour in 0..59, got " + iD7);
                                    } else if (iD8 > 59) {
                                        df5VarC = cf5.c(strS, "Expected offset-second-of-minute in 0..59, got " + iD8);
                                    } else if (iD6 <= 17 || (iD6 == 18 && iD7 == 0 && iD8 == 0)) {
                                        i3 = ((iD7 * 60) + (iD6 * 3600) + iD8) * (cCharAt4 == '-' ? -1 : 1);
                                        if (1 <= iD || iD >= 13) {
                                            df5VarC = cf5.c(strS, "Expected a month number in 1..12, got " + iD);
                                        } else if (1 > iD2) {
                                            StringBuilder sbB3 = u43.b("Expected a valid day-of-month for month ", " of year ", ", got ", iD, iCharAt);
                                            sbB3.append(iD2);
                                            df5VarC = cf5.c(strS, sbB3.toString());
                                        } else {
                                            int i15 = iCharAt & 3;
                                            if (iD2 > (iD != 2 ? (iD == 4 || iD == 6 || iD == 9 || iD == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % CarouselScreenFragment.CAROUSEL_ANIMATION_MS == 0) ? 29 : 28)) {
                                                StringBuilder sbB4 = u43.b("Expected a valid day-of-month for month ", " of year ", ", got ", iD, iCharAt);
                                                sbB4.append(iD2);
                                                df5VarC = cf5.c(strS, sbB4.toString());
                                            } else if (iD3 > 23) {
                                                df5VarC = cf5.c(strS, "Expected hour in 0..23, got " + iD3);
                                            } else if (iD4 > 59) {
                                                df5VarC = cf5.c(strS, "Expected minute-of-hour in 0..59, got " + iD4);
                                            } else if (iD5 > 59) {
                                                df5VarC = cf5.c(strS, "Expected second-of-minute in 0..59, got " + iD5);
                                            } else {
                                                long j = iCharAt;
                                                long j2 = 365 * j;
                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iD * 367) - 362) / 12)) + ((long) (iD2 - 1));
                                                if (iD > 2) {
                                                    j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % CarouselScreenFragment.CAROUSEL_ANIMATION_MS != 0)) ? j3 - 2 : (-1) + j3;
                                                }
                                                df5VarC = new df5.b(i2, (((j3 - 719528) * 86400) + ((long) (((iD4 * 60) + (iD3 * 3600)) + iD5))) - ((long) i3));
                                            }
                                        }
                                    } else {
                                        df5VarC = cf5.c(strS, "Expected an offset in -18:00..+18:00, got " + strS.subSequence(i10, strS.length()).toString());
                                    }
                                }
                            } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                int i16 = i10 + 1;
                                if (strS.length() == i16) {
                                    i3 = 0;
                                    if (1 <= iD) {
                                        df5VarC = cf5.c(strS, "Expected a month number in 1..12, got " + iD);
                                    } else {
                                        df5VarC = cf5.c(strS, "Expected a month number in 1..12, got " + iD);
                                    }
                                } else {
                                    df5VarC = cf5.c(strS, "Extra text after the instant at position " + i16);
                                }
                            } else {
                                df5VarC = cf5.c(strS, "Expected the UTC offset at position " + i10 + ", got '" + cCharAt4 + '\'');
                            }
                        }
                    } else {
                        df5VarC = aVarB;
                    }
                }
            } else {
                df5VarC = cf5.c(strS, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return df5VarC.toInstant();
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        xe5 xe5Var = (xe5) obj;
        xe5Var.getClass();
        encoder.D(xe5Var.toString());
    }
}
