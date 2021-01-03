package com.company.skill;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GenerateSkill {

    public GenerateSkill(int [] v)
    {
        var scanner = new Scanner(System.in);
        System.out.println("Maximum enchant level per sub level ? : ");
        int maximumLevel = scanner.nextInt();

        for (int i = 0; i < v[1]; i++)
        {
            System.out.println("skill_begin\tskill_id="+v[0]+"\tskill_level="+i+"\tskill_sublevel=0\toperate_type="+v[3]+"\tresist_cast="+v[4]+"\tMagicType="+v[5]+"\tmp_consume="+v[6]+"\tcast_range="+v[7]+"\tcast_style="+v[8]+"\thit_time="+v[9]+".0"+"\tcool_time="+v[10]+".0"+"\treuse_delay="+v[11]+".0"+"\teffect_point="+v[12]+"\tis_magic="+v[13]+"\torigin_skill="+v[14]+"\tis_double="+v[15]+"\tanimation={"+v[16]+"}\tskill_visual_effect="+v[17]+"\ticon="+v[18]+"\ticon_panel="+v[19]+"\tdebuff="+v[20]+"\ticon_type=0\tenchant_skill_level=0\tenchant_icon=1\thp_consume="+v[23]+"\trumble_self="+v[24]+"\trumble_target="+v[25]+"\tskill_end");
        }

        if (v[2] > 0)
        {
            for (int i = 0; i < v[2]; i++)
            {
                int x = i == 1 ? 1000 : i == 2? 2000 : i == 3 ? 3000 : 0;

                for (int n = 1; n < maximumLevel; n++)
                {
                    x+= n;
                    System.out.println("skill_begin\tskill_id="+v[0]+"\tskill_level="+v[1]+"\tskill_sublevel="+x+"\toperate_type="+v[3]+"\tresist_cast="+v[4]+"\tMagicType="+v[5]+"\tmp_consume="+v[6]+"\tcast_range="+v[7]+"\tcast_style="+v[8]+"\thit_time="+v[9]+".0"+"\tcool_time="+v[10]+".0"+"\treuse_delay="+v[11]+".0"+"\teffect_point="+v[12]+"\tis_magic="+v[13]+"\torigin_skill="+v[14]+"\tis_double="+v[15]+"\tanimation={"+v[16]+"}\tskill_visual_effect="+v[17]+"\ticon="+v[18]+"\ticon_panel="+v[19]+"\tdebuff="+v[20]+"\ticon_type=0\tenchant_skill_level="+v[21]+"\tenchant_icon="+v[22]+"\thp_consume="+v[23]+"\trumble_self="+v[24]+"\trumble_target="+v[25]+"\tskill_end");
                }
           }
        }

        System.out.println("Generate SkillName? (1) or new skill(2) or exit (0)");
        if (scanner.nextInt() == 1)
        {
            String[] nameArr = new String[6];
            System.out.println("Name : ");
            nameArr[0] = scanner.next();
            System.out.println("Description : ");
            nameArr[1] = scanner.next();


            // ------------------------------------------ Description parameters split
            int numberOfParams = 1;
            while (true)
            {
                if (nameArr[1].contains("$s" + numberOfParams))
                {
                    numberOfParams++;
                }
                else
                {
                    break;
                }
            }

            String[] paramArr = new String[numberOfParams];

            for (int i = 1; i < numberOfParams; i++) {
                System.out.println("Param for $s" + i);
                paramArr[i] = scanner.nextLine();
            }

            StringBuilder paramSb = new StringBuilder();
            for (String s : paramArr) {
                if (!(s.equals("$s" + numberOfParams)))
                    paramSb.append(s).append(";");
                else
                    paramSb.append(s);
            }
            nameArr[2] = paramSb.toString();

            // ------------------------------------------ Enchant Description Split
            if (v[2] > 0)
            {
                for (int i = 0; i < v[2]; i++)
                {

                }
                numberOfParams = 1; // Empty
                paramSb = new StringBuilder(); // Empty

                System.out.println("Enchant Description : ");
                nameArr[3] = scanner.nextLine(); // Read Enc Desc String

                while (true) // for each $s"x" in enchantDescString
                {
                    if (nameArr[3].contains("$s" + numberOfParams))
                    {
                        numberOfParams++;
                    }
                    else
                    {
                        break;
                    }
                }

                paramArr = new String[numberOfParams];

                for (int i = 1; i < numberOfParams; i++) { // Read param value for each $s"x" in param description
                    System.out.println("Param for $s" + i);
                    paramArr[i] = scanner.nextLine();
                }

                for (String s : paramArr) { // Split Parameters
                    if (!(s.equals("$s" + numberOfParams)))
                        paramSb.append(s).append(";");
                    else
                        paramSb.append(s);
                }
                nameArr[4] = paramSb.toString(); // Enchant Desc Param Values
                ///////////////////////// Enchant Name ////////////////////////////////////////

                for (int i = 0; i < v[2]; i++)
                {
                    System.out.println("Enchant Name for subLevel " + (1 + i) + " :");
                    System.out.println("1 = time, 2 = chance, 3 = cost, 4 = recovery, 5 = power, 6 = penalty");
                    int enchantName = scanner.nextInt();
                    int arrVal = 5 + i;
                    nameArr[arrVal] = switch (enchantName)
                            {
                                case 1 -> "+ $s1 Time";
                                case 2 -> "+ $s1 Chance";
                                case 3 -> "+ $s1 Cost";
                                case 4 -> "+ $s1 Recovery";
                                case 5 -> "+ $s1 Power";
                                case 6 -> "+ $s1 Penalty";
                                default -> throw new IllegalStateException("Unexpected value: " + enchantName);
                            };
                }
            }
        }
        else
            System.exit(0);

    }
}

//skill_begin	skill_id=1189	skill_level=1	skill_sublevel=0	prev_skill_id=0	prev_skill_level=-1	prev_skill_sublevel=-1	name=[Wind Resistance]
// desc=[Increases Wind Resistance by $s2 for $s1.]	desc_param=[20 minutes;10]	enchant_name=[]	enchant_name_param=[]	enchant_desc=[]	enchant_desc_param=[]	skill_end

//skill_begin	skill_id=1189	skill_level=3	skill_sublevel=1001	prev_skill_id=1189	prev_skill_level=3	prev_skill_sublevel=0	name=[Wind Resistance]
// desc=[]	desc_param=[20 minutes 40 seconds;21]	enchant_name=[+ $s1 Time]	enchant_name_param=[1]
// enchant_desc=[Increases the effect's duration by $s1 and Wind Resistance.]
// enchant_desc_param=[40 seconds]	skill_end


    // skill_begin	skill_id=1393	skill_level=3	skill_sublevel=1022	operate_type=2	resist_cast=0	MagicType=1
    // mp_consume=69	cast_range=400	cast_style=1	hit_time=4.0	cool_time=0.0	reuse_delay=2.0
    // effect_point=655	is_magic=1	origin_skill=0	is_double=0	animation={9610}	skill_visual_effect=77096
    // icon=77846	icon_panel=1	debuff=0	icon_type=0	enchant_skill_level=3	enchant_icon=77847	hp_consume=0	rumble_self=8	rumble_target=10	skill_end