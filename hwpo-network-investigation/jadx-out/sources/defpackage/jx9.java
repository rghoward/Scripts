package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jx9 {
    public static final ul8 a = k95.v(12);

    public static k95<Integer> a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new z70()).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && n6b.J(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return k95.q(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e A[RETURN] */
    public static k95<Integer> b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        k95<Integer> k95VarA;
        k95<Integer> k95VarQ;
        int speakerLayoutChannelMask;
        boolean zA = cz2.a(audioDeviceInfo.getType());
        ul8 ul8Var = a;
        if (!zA) {
            if (audioDeviceInfo.getType() == 1) {
                return k95.v(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return k95.v(Integer.valueOf(speakerLayoutChannelMask));
                }
                md6.g("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return ul8Var;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && audioDeviceInfo.getType() == 10) {
                k95<Integer> k95VarA2 = a(audioDeviceInfo);
                if (!k95VarA2.isEmpty()) {
                    return k95VarA2;
                }
                k95<Integer> k95VarA3 = a80.a(audioDeviceInfo.getAudioDescriptors());
                if (!k95VarA3.isEmpty()) {
                    return k95VarA3;
                }
            } else if (i >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i >= 31 && type2 == 29) {
                    k95<Integer> k95VarA4 = a(audioDeviceInfo);
                    if (!k95VarA4.isEmpty()) {
                        return k95VarA4;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i >= 34) {
                        if (i < 34 || audioDescriptors == null) {
                            k95.b bVar = k95.u;
                            k95VarQ = ul8.x;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorB = x70.b(it.next());
                                if (audioDescriptorB.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorB.getDescriptor();
                                    if (descriptor.length != 3) {
                                        md6.g("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                    } else {
                                        int i2 = 0;
                                        if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                            byte b = descriptor[0];
                                            i2 = (b & 1) != 0 ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i2 |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i2 |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i2 |= 192;
                                            }
                                            if ((b & 16) != 0) {
                                                i2 |= 1024;
                                            }
                                            if ((b & 32) != 0) {
                                                i2 |= 768;
                                            }
                                            if ((b & 128) != 0) {
                                                i2 |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i2 |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i2 |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i2 |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 16) != 0) {
                                                i2 |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i2 |= 262144;
                                            }
                                            if ((b2 & 64) != 0) {
                                                i2 |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i2 |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i2 |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i2 = 8388608 | i2;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i2 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                            arrayList.sort(new y70());
                            k95VarQ = k95.q(arrayList);
                        }
                        if (!k95VarQ.isEmpty()) {
                            return k95VarQ;
                        }
                    }
                    k95<Integer> k95VarA5 = a80.a(audioDescriptors);
                    if (!k95VarA5.isEmpty()) {
                        return k95VarA5;
                    }
                } else if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    k95VarA = a(audioDeviceInfo);
                    if (!k95VarA.isEmpty()) {
                        return k95VarA;
                    }
                }
            } else if (i >= 31) {
                k95VarA = a(audioDeviceInfo);
                if (!k95VarA.isEmpty()) {
                    return k95VarA;
                }
            }
        }
        return ul8Var;
    }
}
