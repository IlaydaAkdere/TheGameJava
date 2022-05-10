package Concrate;

import Entities.Campaign;
import Entities.Campaign;
import Entities.CampaignService;
import Entities.CampaignService;

public class CampaignManager implements CampaignService {
   
   
    @Override
    public void add(Campaign entity) {
      System.out.println("champain is added to system:" + entity.getGameName());
    }

    @Override
    public void delete(Campaign entity) {
        System.out.println("champain is deleted to system. :" + entity.getGameName());
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("champain is updated to system. :"  + entity.getGameName());
    }

  
    }

