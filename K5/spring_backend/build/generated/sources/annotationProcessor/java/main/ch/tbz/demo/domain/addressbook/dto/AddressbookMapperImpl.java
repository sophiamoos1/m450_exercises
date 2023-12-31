package ch.tbz.demo.domain.addressbook.dto;

import ch.tbz.demo.domain.addressbook.Addressbook;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-02T11:23:34+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class AddressbookMapperImpl implements AddressbookMapper {

    @Override
    public Addressbook fromDTO(AddressbookDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Addressbook addressbook = new Addressbook();

        addressbook.setId( dto.getId() );
        addressbook.setFirstName( dto.getFirstName() );
        addressbook.setLastName( dto.getLastName() );
        addressbook.setEmail( dto.getEmail() );

        return addressbook;
    }

    @Override
    public List<Addressbook> fromDTOs(List<AddressbookDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Addressbook> list = new ArrayList<Addressbook>( dtos.size() );
        for ( AddressbookDTO addressbookDTO : dtos ) {
            list.add( fromDTO( addressbookDTO ) );
        }

        return list;
    }

    @Override
    public Set<Addressbook> fromDTOs(Set<AddressbookDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Addressbook> set = new LinkedHashSet<Addressbook>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( AddressbookDTO addressbookDTO : dtos ) {
            set.add( fromDTO( addressbookDTO ) );
        }

        return set;
    }

    @Override
    public AddressbookDTO toDTO(Addressbook BO) {
        if ( BO == null ) {
            return null;
        }

        AddressbookDTO addressbookDTO = new AddressbookDTO();

        addressbookDTO.setId( BO.getId() );
        addressbookDTO.setFirstName( BO.getFirstName() );
        addressbookDTO.setLastName( BO.getLastName() );
        addressbookDTO.setEmail( BO.getEmail() );

        return addressbookDTO;
    }

    @Override
    public List<AddressbookDTO> toDTOs(List<Addressbook> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<AddressbookDTO> list = new ArrayList<AddressbookDTO>( BOs.size() );
        for ( Addressbook addressbook : BOs ) {
            list.add( toDTO( addressbook ) );
        }

        return list;
    }

    @Override
    public Set<AddressbookDTO> toDTOs(Set<Addressbook> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<AddressbookDTO> set = new LinkedHashSet<AddressbookDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Addressbook addressbook : BOs ) {
            set.add( toDTO( addressbook ) );
        }

        return set;
    }
}
