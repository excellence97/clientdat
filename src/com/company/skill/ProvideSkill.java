package com.company.skill;

import java.util.Scanner;

public class ProvideSkill {

    int[] valueArray = new int[26];

    public ProvideSkill()
    {
        var scanner = new Scanner(System.in);
        System.out.print("Skill ID : ");
        valueArray[0] = scanner.nextInt();
        System.out.print("Max Skill Level : ");
        valueArray[1] = scanner.nextInt();
        System.out.print("Number of sublevels (0 if none) : ");
        valueArray[2] = scanner.nextInt();
        System.out.print("Operate type: ");
        valueArray[3] = scanner.nextInt();
        System.out.print("Resist cast: ");
        valueArray[4] = scanner.nextInt();
        System.out.print("Magic Type : ");
        valueArray[5] = scanner.nextInt();
        System.out.print("Mp Consume : ");
        valueArray[6] = scanner.nextInt();
        System.out.print("Cast range : ");
        valueArray[7] = scanner.nextInt();
        System.out.print("Cast Style : ");
        valueArray[8] = scanner.nextInt();
        System.out.print("Hit Time : " );
        valueArray[9] = scanner.nextInt();
        System.out.print("Cool Time : ");
        valueArray[10] = scanner.nextInt();
        System.out.print("Reuse Delay : ");
        valueArray[11] = scanner.nextInt();
        System.out.print("Effect Point : ");
        valueArray[12] = scanner.nextInt();
        System.out.print("isMagic : ");
        valueArray[13] = scanner.nextInt();
        System.out.print("originSkill : ");
        valueArray[14] = scanner.nextInt();
        System.out.print("isDouble : ");
        valueArray[15] = scanner.nextInt();
        System.out.print("Animation : ");
        valueArray[16] = scanner.nextInt();
        System.out.print("Visual Effect : ");
        valueArray[17] = scanner.nextInt();
        System.out.print("Icon : ");
        valueArray[18] = scanner.nextInt();
        System.out.print("Icon Panel : ");
        valueArray[19] = scanner.nextInt();
        System.out.print("Debuff : ");
        valueArray[20] = scanner.nextInt();
        valueArray[21] = valueArray[1]; // Enchant Skill Level
        valueArray[22] = valueArray[18]; // Enchant Skill Icon
        System.out.print("Hp Consume : ");
        valueArray[23] = scanner.nextInt();
        System.out.print("Rumble Self : ");
        valueArray[24] = scanner.nextInt();
        System.out.print("Rumble Target : ");
        valueArray[25] = scanner.nextInt();

        new GenerateSkill(valueArray);
    }
}





// skill_begin	skill_id=1393	skill_level=3	skill_sublevel=1022	operate_type=2	resist_cast=0	MagicType=1
// mp_consume=69	cast_range=400	cast_style=1	hit_time=4.0	cool_time=0.0	reuse_delay=2.0
// effect_point=655	is_magic=1	origin_skill=0	is_double=0	animation={9610}	skill_visual_effect=77096
// icon=77846	icon_panel=1	debuff=0	icon_type=0	enchant_skill_level=3	enchant_icon=77847	hp_consume=0	rumble_self=8	rumble_target=10	skill_end